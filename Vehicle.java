package com.implement;


import com.polymorphism.MainInterf;

public class Vehicle implements MainInterf {
	private String name;
	private String age;

	public Vehicle(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", age=" + age + "]";
	}

	@Override
	public void playSound() {
		System.out.println("Vehicle sound");
	}

	@Override
	public void resizeObject() {
		System.out.println("Resizing a Vehicle");
	}

	@Override
	public void rotateObject() {
		System.out.println("Rotating a Vehicle");
	}

	@Override
	public void drawObject() {
		System.out.println("Drawing a Vehicle");
	}

}

