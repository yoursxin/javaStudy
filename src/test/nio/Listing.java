package test.nio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

public class Listing {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Path listing = Paths.get("src");
		System.out.println(listing);
		System.out.println("filename is :"+listing.getFileName());		
		System.out.println("root is:"+listing.getRoot());
		
		System.out.println(">>>list files in current directory:");
		try(DirectoryStream<Path> stream= Files.newDirectoryStream(listing,"*.xml")){
			for(Path entry: stream){
				System.out.println(entry);
			}
			
		}catch(IOException e){
			
		}
		System.out.println(">>>list filse in current dirctiory and subdirector:"); 
		Files.walkFileTree(listing, new SimpleFileVisitor<Path>(){
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
				System.out.println(file.toAbsolutePath());
				
				return FileVisitResult.CONTINUE;
			}
			
		});
		
		//read file 
		List<String> list = Files.readAllLines(Paths.get("src/custom.xml"), StandardCharsets.UTF_8);
		System.out.println(list);
		

	}

}
