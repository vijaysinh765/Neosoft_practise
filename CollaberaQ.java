package interviewMostRepeating;


public final class CollaberaQ {
	 
    int count = 0;
 
    CollaberaQ() {
        count++;
        System.out.println(count);
    }
 
    CollaberaQ(int a) {
    	  this();
        count++;
        System.out.println(count);
      
    }
 
    public static void main(String args[]) {
        CollaberaQ c1 = new CollaberaQ();   //1

        CollaberaQ c2 = new CollaberaQ(1);// 1
                                             
                                           // 2


        CollaberaQ c3 = new CollaberaQ(); // 1
    }
}