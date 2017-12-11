package test.inner;

class D{}
abstract class E{}
class Z extends D{
	E makeE(){return new E(){};}
}

public class A {
	
	 static  class A1{
		 static class A11{
			 static class A111{}
		 }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a1 = new A1();

	}

}
