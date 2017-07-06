package test.nio;
import java.nio.*;


public class GetData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int SIZE = 1024;
		ByteBuffer bf = ByteBuffer.allocate(SIZE);
		int i=0;
		while(i++<bf.limit()){			
			if(bf.get() != 0){
				System.out.println(bf.get());
			}
				
		}
		System.out.println(i);
		bf.rewind();
		bf.asCharBuffer().put("hello").put(3,'c');
		
		
		
		char c ;
		while((c= bf.getChar())!=0)
			System.out.println(c);
		
		bf.rewind();
		bf.asIntBuffer().put(32769);
		System.out.println(bf.getInt());

	}

}
