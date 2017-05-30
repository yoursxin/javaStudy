package test.annotation;
import java.lang.reflect.*;

public class RunTests {

	public static void main(String[] args) throws Exception{
		int tests = 0;
		int passed = 0;
		Class testClass = Sample2.class;
		for(Method m : testClass.getDeclaredMethods()){
			if(m.isAnnotationPresent(Test.class)){
				tests++;
				try{
					m.invoke(null);
					passed++;
				}catch(InvocationTargetException wrappedExc){
					System.out.println(m + " failed: "+wrappedExc.getCause());
				}catch(Exception exc){
					System.out.println("INVALID @Test: "+m);
				}
			}
			if(m.isAnnotationPresent(ExceptionTest.class)){
				tests++;
				try{
					m.invoke(null);
					System.out.printf("Test %s failed: no exception%n");
				}catch(InvocationTargetException wrappedEx){
					Throwable exc = wrappedEx.getCause();
					Class<? extends Exception> excType = 
							m.getAnnotation(ExceptionTest.class).value();
					if(excType.isInstance(exc)){					
						passed++;
					}else{
						System.out.printf(
								"Test %s failed: expected %s,got %s%n", 
								m,excType.getName(),exc);
					}
				}catch(Exception exc){
					System.out.println("INVALID @Test:"+m);
				}
			}
		}
		System.out.printf("Passed: %d, Failed: %d%n", passed, tests - passed);
		

	}

}
