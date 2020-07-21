package sec03.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		Animal animal = null;
		
		//타입변환
		//항상 자식쪽에서 재정의된 메소드가 호출
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		
		//매개변수의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
