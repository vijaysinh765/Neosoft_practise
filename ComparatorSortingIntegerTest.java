package collection;

import java.util.Comparator;

public class ComparatorSortingIntegerTest implements Comparator{
	
		
	
	
	public int compare(Object obj1,Object obj2){
		Integer I1=(Integer)obj1;
		Integer I2=(Integer)obj2;
		 if(I1<I2) return +100;
		 else if(I1>I2) return -100;
		 else return 0;            //[25, 20, 15, 10, 5]
		 
		// return I1.compareTo(I2);//DefaultNaturalSortingAscendingOrder-[5, 10, 15, 20, 25]
		// return I2.compareTo(I1);//ReverseOfDNSO(ASCENDING order)-DescendingOrder-[25, 20, 15, 10, 5]
		 //return -I1.compareTo(I2);//ReverseOfDnso=DescendingOrder-[25, 20, 15, 10, 5]
		 //return -I2.compareTo(I1);//Rev(ReverseOfDNSO)=AscendingOrder-[5, 10, 15, 20, 25]
		//return +1;//DNSO-ascendingOrder-[5, 10, 15, 20, 25]
		//return -1;//ReverseOfDnso-descendingOrder-[25, 20, 15, 10, 5]
		//return 0;//onlyFirstElementWillBeAdded &RemainingWillBe duplicate
		
	}



	}
