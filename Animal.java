
package com.implement;


import com.polymorphism.MainInterf;

public class Animal implements MainInterf 
{
	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}

	@Override
	public void playSound() {
		System.out.println("Animal sound");
	}

	@Override
	public void resizeObject() {
		System.out.println("Resizing a Animal");
	}

	@Override
	public void rotateObject() {
		System.out.println("Rotating a Animal");
	}

	@Override
	public void drawObject() {
		System.out.println("Drawing a Animal");
	}

}

