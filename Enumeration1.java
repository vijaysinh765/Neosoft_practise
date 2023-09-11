package collection;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v=new Vector();
		for(int i=0;i<=10;i++) {
		v.addElement(v);}
	
        Enumeration e=v.elements();
        while(e.hasMoreElements()){
        	Integer i=(Integer)e.nextElement();//Exception in thread "main" java.lang.ClassCastException: class java.util.Vector cannot be cast to class java.lang.Integer (java.util.Vector and java.lang.Integer are in module java.base of loader 'bootstrap')
        	                                   //at collection.Enumeration1.main(Enumeration1.java:17)

        	if(i%2==0) {System.out.println(i);}
        	System.out.println(v);
        }
       
}}
