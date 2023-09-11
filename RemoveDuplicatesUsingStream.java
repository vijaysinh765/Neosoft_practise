package jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesUsingStream {
public static void main(String[] args) {
	List<Integer>al= Arrays.asList(1,2,3,4,2,1,6,7,8,9,8,4);
	al.stream().collect(Collectors.toSet()).forEach(System.out::println);
}
}
