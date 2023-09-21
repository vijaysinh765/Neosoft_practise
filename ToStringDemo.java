package langPackage;

public class ToStringDemo {
		 String name;
		 int rollno;
		 
		 ToStringDemo(String name, int rollno)
		 {
		 this.name=name;
	     this.rollno=rollno;
         }
		 
		 public static void main(String args[]){
			 
	     ToStringDemo s1=new ToStringDemo("saicharan",101);
		 ToStringDemo s2=new ToStringDemo("ashok",102);
		 System.out.println(s1);
		 System.out.println(s1.toString());
		 System.out.println(s2);
		 }

}
//output:
//langPackage.ToStringDemo@123a439b
//langPackage.ToStringDemo@123a439b
//langPackage.ToStringDemo@182decdb

