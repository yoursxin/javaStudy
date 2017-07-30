package test.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AsynchronicIOFuture {

	public static void main(String[] args) {
		try {
			Path file = Paths.get("src/custom.xml");
			AsynchronousFileChannel channel = AsynchronousFileChannel.open(file);
			ByteBuffer buffer = ByteBuffer.allocate(100_000);
			Future<Integer> result = channel.read(buffer, 0);
			while(!result.isDone()){
				System.out.println("do other sth.");
			}
			Integer bytesRead = result.get();
			System.out.println("Bytes read["+bytesRead+"]");
			
			

		} catch (IOException | InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

	}

}
