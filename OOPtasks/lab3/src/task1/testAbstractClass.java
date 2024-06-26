package task1;

public class testAbstractClass {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.eat();
		dog.makeSound();
		System.out.println("---");
		cat.eat();
		cat.makeSound();
	}
}
