package com.kh.git;

import com.kh.animal.*;

public class Helloworld {
	public static void main(String[] args) {
		System.out.println("Hello world");
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.bark();
		cat.cry();
		
		Snake snake = new Snake();
		snake.move();
		
	}

}
