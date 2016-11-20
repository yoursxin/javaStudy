package test.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class RefTest {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> weights = Arrays.asList(7,3,4,10);
		//List<Apple> apples = map(weights, Apple::new);
		
		//2
		List<Apple> apples = map(weights,   i -> new Apple(i));
		System.out.println(apples);

	}

	private static List<Apple> map(List<Integer> list, Function<Integer, Apple> f) {
		
		List<Apple> result = new ArrayList<>();
		
		for(Integer e:list){
			result.add(f.apply(e));
		}
		return result;
	}

}
