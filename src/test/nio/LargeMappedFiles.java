package test.nio;

import java.nio.*;
import java.nio.channels.*;
import java.io.*;

public class LargeMappedFiles {
	
	static int length = 0x8FFFFFF;

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println(length);
		MappedByteBuffer out = new RandomAccessFile("test.dat","rw")
				.getChannel().map(FileChannel.MapMode.READ_WRITE, 0, length);
		
		for(int i=0; i<length;i++)
			out.put((byte)'x');
		
				

	}

}
