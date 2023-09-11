package garbageCollection;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollectionConditions {
	
public static void main(String[] args) {
	
	NullifyReferences();
	MethodScope();
	ReassignReferences();
	Collections();}
	
	public static void NullifyReferences() {//Nullify References: Set the reference variables pointing to an object to null. This way, there are no more active references to the object, and it becomes unreachable.
		
		GarbageCollectionConditions myObject = new GarbageCollectionConditions();
		// ... do something with myObject ...
		myObject = null; // Now the object is eligible for garbage collection
		}
	
	public static void MethodScope() {
		GarbageCollectionConditions myObject = new GarbageCollectionConditions();
	    // ... use myObject ...
	} // After this method completes, myObject is eligible for garbage collection}
	
	public static void ReassignReferences() {
		GarbageCollectionConditions obj1 = new GarbageCollectionConditions();
		GarbageCollectionConditions obj2 = new GarbageCollectionConditions();
		obj1 = obj2; // Now the original obj1 is eligible for garbage collection

	}
	
	public static void Collections() {
		List<GarbageCollectionConditions> myList = new ArrayList<>();
		myList.add(new GarbageCollectionConditions());
		myList.remove(0); // The object originally added is now eligible for garbage collection

	}
	
}

