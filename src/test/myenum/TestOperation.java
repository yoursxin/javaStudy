package test.myenum;

import java.util.Arrays;
import java.util.Collection;

public class TestOperation {

	public static void main(String...args){
		double x=2;
		double y=4;
		test(ExtendedOperation.class, x,y);
		test2(Arrays.asList(ExtendedOperation.values()), x,y);
	}
	
	private static <T extends Enum<T> & Operation> void test(
			Class<T> opSet, double x, double y){
		for(Operation op: opSet.getEnumConstants()){
			System.out.printf("%f %s %f = %f%n",x,op,y,op.apply(x, y));
		}
	}
	
	public static void test2(Collection<? extends Operation> opSet,
			double x, double y){
		for(Operation op: opSet){
			System.out.printf("%f %s %f = %f%n",x,op,y,op.apply(x, y));
		}
	}

}
