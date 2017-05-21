package test.myenum;

public class WeightTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Planet p: Planet.values()){
			System.out.printf("Weight on %s is %f%n", p, p.mass());
		}
		
		

	}

}
