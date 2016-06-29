package test.generic;

public class ArrayAlg {
	public static Pair<String> minmax(String[] a){
		if(a == null || a.length == 0){
			return null;
		}
		String min=a[0], max=a[0];
		for(int i=1; i<a.length; i++){
			if(a[i].compareTo(min) < 0){
				min = a[i];
			}
			if(a[i].compareTo(max) > 0){
				max = a[i];
			}
		}
		return new Pair<>(min,max);
		
	}
	
	public static<T> T getMiddle(T... a){
		return a[a.length/2];
	}
	
	public static void main(String[] args){
		String[] words = {"Mary","had","a","little","lamb"};
		Pair<String> minmax = ArrayAlg.minmax(words);
		System.out.println("min:" +minmax.getFirst());
		System.out.println("max:" + minmax.getSecond());
		
		//ø…“‘ °¬‘ <String>
		//String mid = ArrayAlg.<String>getMiddle("Mary","had","a","little","lamb");
		String mid = ArrayAlg.getMiddle("Mary","had","a","little","lamb");
		System.out.println("mid:"+ mid);
		
		//ERR:
		//ArrayAlg.getMiddle(3.14,1729,0);
		double middle = ArrayAlg.getMiddle(3.14,1729.0,0.0);
		System.out.println("middle:"+middle);
	}

}
