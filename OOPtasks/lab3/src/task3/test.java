package task3;

public class test {
	 public static void main(String[] args) {
	        MyCollection<String> myCollection = new SimpleCollection<>();
	        myCollection.add("Sofa");
	        myCollection.add("Table");
	        myCollection.add("Chair");
	        myCollection.add("Bed");


	        System.out.println("Collection contains 'Sofa': " + myCollection.contains("Sofa"));
	        System.out.println("Size of collection: " + myCollection.size());
	        System.out.println("---");


	        myCollection.remove("Sofa");
	        System.out.println("Collection contains 'Sofa' after removal: " + myCollection.contains("Sofa"));
	        System.out.println("Size of collection after removal: " + myCollection.size());
	        System.out.println("---");
	        
	        myCollection.clear();
	        System.out.println("Size of collection after clear: " + myCollection.size());
	        System.out.println("Collection is empty?: " + myCollection.isEmpty());

	        
	    }
}
