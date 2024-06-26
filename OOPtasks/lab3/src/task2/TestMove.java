package task2;

public class TestMove {
	  public static void main(String[] args) {
		  Horse horse = new Horse();
		  Fish fish = new Fish();
		  
		  horse.move();
		  System.out.println("---");
		  fish.moveUnderWater();
	  }
}
