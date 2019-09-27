package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
public static void main(String[] args) {
	ArrayList <Animal> farm = new ArrayList <Animal>();
	Pig piggie = new Pig();
	Chicken chicken= new Chicken();
	Dog doggie = new Dog();
	Cow cow = new Cow();
	Dog dog = new Dog();
	Pig pig = new Pig();
	farm.add(piggie);
	farm.add(chicken);
	farm.add(doggie);
	farm.add(cow);
	farm.add(dog);
	farm.add(pig);
	for (int i = 0; i < farm.size(); i++) {
		farm.get(i).makeNoise();
		farm.get(i).eat();
	}
	
}
}
