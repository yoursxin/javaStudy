package test.nio;

import java.nio.charset.*;
import java.util.Map;


public class AvailableCharsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map map = Charset.availableCharsets();
		System.out.println(map);

	}

}
