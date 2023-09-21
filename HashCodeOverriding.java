package langPackage;

public class HashCodeOverriding {
	int i;
	
	HashCodeOverriding(int i){
		this.i=i;
	}
	
	public int hashCode() {
		return i;
	}
	
	public String toString() {
		return i+"";
	}
	
	public static void main(String[] args) {
		HashCodeOverriding h=new HashCodeOverriding(9);
		HashCodeOverriding h1=new HashCodeOverriding(10);
		System.out.println(h);//langPackage.HashCodeOverriding@9 if toString not overriden
		System.out.println(h1);//10 if toString method overriden
	}
}

//if we are giving opportunity to Object class toString() method it internally calls 
//hashCode() method. But if we are overriding toString() method it may not call 
//hashCode() method.

//We can use toString() method while printing object references and we can use 
//hashCode() method while saving objects into HashSet or Hashtable or HashMap.