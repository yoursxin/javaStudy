package test.stream;

import java.util.Arrays;
import static java.util.stream.Collectors.toList;
import static java.lang.System.out;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.util.stream.Collectors.joining;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fileStreamTest();


	}
	public static void fileStreamTest(){
		try(Stream<String> lines = Files.lines(Paths.get("d:/vpn2.txt"))){
			System.out.println("words num is: "+lines.flatMap(l -> Arrays.stream(l.split(" "))).distinct().count()
			);
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void numberStreamTest(){
		Stream<double[]> pythagoreanTriples = 
			IntStream.rangeClosed(1, 100).boxed()
			.flatMap(a -> 
				IntStream.rangeClosed(a,100)
					.mapToObj(b -> new double[]{a,b,Math.sqrt(a*a + b*b)}))
					.filter(t -> t[2]%1 == 0);
		
		pythagoreanTriples
			.forEach(t -> System.out.println(t[0]+","+t[1]+","+t[2]));
	}
	
	

	public static void filterTest() {
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
		numbers.stream().filter(i -> i % 2 == 0).distinct().forEach(System.out::println);
	}

	// the flatMap method lets you replace each value of a stream with another
	// stream
	// and then concatenates all the generated streams into a single stream.
	public static void mapTest1() {
		List<String> strs = Arrays.asList("hello", "world");
		strs.stream().map(word -> word.split("")).flatMap(Arrays::stream).distinct().forEach(out::println);
	}

	public static void mapTest2() {
		List<Integer> number1 = Arrays.asList(1, 2, 3);
		List<Integer> number2 = Arrays.asList(4, 5, 6);
		number1.stream().flatMap(i -> number2.stream().map(j -> new int[] { i, j })).forEach(out::println);
	}

	public static void matchTest() {
		List<Integer> numbers = Arrays.asList(2, 4, 6);
		System.out.println(numbers.stream().allMatch(i -> i % 2 == 0));
		System.out.println(numbers.stream().anyMatch(i -> i > 4));
		System.out.println(numbers.stream().noneMatch(i -> i % 2 == 1));
	}

	public static void allinoneTest() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));
		System.out.println("0:"+transactions);
		
		// 1. Find all transactions in the year 2011 and sort them by value
		// (small to high).
		System.out.println("1:"+transactions.stream().filter(t -> t.getYear() == 2011)
				.sorted(comparing(Transaction::getValue)).collect(toList()));

		// 2. What are all the unique cities where the traders work?
		System.out.println("2-1:"+transactions.stream()
				.map(t -> t.getTrader().getCity())
				.distinct().collect(toList()));
		
		System.out.println("2-2:"+transactions.stream()
				.map(t -> t.getTrader().getCity())
				.collect(toSet()));

		// 3. Find all traders from Cambridge and sort them by name.
		System.out.println("3:"+transactions.stream().map(Transaction::getTrader)
				.filter(t -> "Cambridge".equals(t.getCity()))
				.sorted(comparing(Trader::getName)).collect(toList()));
		
		// 4. Return a string of all traders¡¯ names sorted alphabetically.
		System.out.println("4-1:"+transactions.stream().map(t -> t.getTrader().getName())
				.distinct().sorted().collect(joining(" ")));
		
		System.out.println("4-2:"+transactions.stream().map(t -> t.getTrader().getName())
				.distinct().sorted().reduce("", (x,y) -> x+" "+y));
		
		// 5. Are any traders based in Milan?
		System.out.println("5:"+transactions.stream().anyMatch(t -> t.getTrader().getCity().equals("Milan")));
		
		// 6. Print all transactions¡¯ values from the traders living in Cambridge.
		System.out.println("6:"+transactions.stream()    
			.filter(t -> "Cambridge".equals(t.getTrader().getCity()))
			.map(Transaction::getValue).collect(toList()));
		
		// 7. What¡¯s the highest value of all the transactions?
		System.out.println("7-1:"+transactions.stream()
				.map(Transaction::getValue).max(comparing(Integer::intValue)));
		System.out.println("7-2:"+transactions.stream()
		.map(Transaction::getValue).reduce(Integer::max));
		System.out.println("7-3:"+transactions.stream()
		.map(Transaction::getValue).reduce((x,y)->x>y?x:y));		
		
		// 8. Find the transaction with the smallest value.
		System.out.println("8-1:"+transactions.stream()
				.reduce((x,y) -> x.getValue()<y.getValue()?x:y));
		
		System.out.println("8-2:"+transactions.stream()
				.min(comparing(Transaction::getValue)));
		
	}
	
	
	
	public static void testIterate(){
		Stream.iterate(2, n -> n*2).limit(100).forEach(System.out::println);
	}
	

}
