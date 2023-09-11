package stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StringStreamAllNeosoft {
	
	public static void main(String[] args) {
		
		 // 1 Count the empty strings 
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk"); 
		long count = strList.stream() .filter(x -> x.isEmpty()) .count(); System.out.printf("List %s has %d empty strings %n", strList, count); 
		//  2 Count String with length more than 3
		long num = strList.stream() .filter(x -> x.length()> 3) .count(); System.out.printf("List %s has %d strings of length more than 3 %n", strList, num); 
		
		//  3 Count number of String which starts with "a"
		count = strList.stream() .filter(x -> x.startsWith("a")) .count(); System.out.printf("List %s has %d strings which startsWith 'a' %n", strList, count); 
		//  4 Remove all empty Strings from List
		List<String> filtered = strList.stream() .filter(x -> !x.isEmpty()) .collect(Collectors.toList()); System.out.printf("Original List : %s, List without Empty Strings : %s %n", strList, filtered);
        
		//  5 Count number of String which starts with "a" 
		count = strList.stream() .filter(x -> x.startsWith("a")) .count(); System.out.printf("List %s has %d strings which startsWith 'a' %n", strList, count);  
		//  6 Remove all empty Strings from List 
		List<String> filtered1 = strList.stream() .filter(x -> !x.isEmpty()) .collect(Collectors.toList()); System.out.printf("Original List : %s, List without Empty Strings : %s %n", strList, filtered);
 
		//  7 Create a List with String more than 2 characters
		filtered = strList.stream() .filter(x -> x.length()> 2) .collect(Collectors.toList()); System.out.printf("Original List : %s, filtered list : %s %n", strList, filtered);    
		//  8 Convert String to Uppercase and join them using coma 
		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada"); String G7Countries = G7.stream() .map(x -> x.toUpperCase()) .collect(Collectors.joining(", ")); System.out.println(G7Countries);

		//  9 Create List of square of all distinct numbers 
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4); List<Integer> distinct = numbers.stream() .map( i -> i*i).distinct() .collect(Collectors.toList()); System.out.printf("Original List : %s, Square Without duplicates : %s %n", numbers, distinct);  
		//  10 Get count, min, max, sum, and average for numbers 
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		IntSummaryStatistics stats = primes.stream() .mapToInt((x) -> x) .summaryStatistics(); System.out.println("Highest prime number in List : " + stats.getMax()); System.out.println("Lowest prime number in List : " + stats.getMin()); System.out.println("Sum of all prime numbers : " + stats.getSum()); System.out.println("Average of all prime numbers : " + stats.getAverage());

		
	}

}
