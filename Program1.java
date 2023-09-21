package company1;

import java.util.Scanner;

public class Program1 {
public static void main(String[] args) {
	System.out.println("Enter number of your choice:");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println("Enter power you want to raise:");
	int b=sc.nextInt();
	int powert=1;
	for(int i=1;i<=b;i++) {
		
		powert=powert*a;
		
	}
	System.out.println(b + "th" + "power of" + a+ ":"+ powert);
}
}
