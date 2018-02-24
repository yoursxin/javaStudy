package test.inner;

//use .new to create instances of inner classes
public class DotNew {
	
	public class Inner{}
	

	public static void main(String[] args) {
		
		DotNew dn = new DotNew();
		DotNew.Inner dni = dn.new Inner();
		

	}

}
