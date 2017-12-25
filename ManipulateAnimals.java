package com.implement;


import java.util.ArrayList;
import java.util.List;

import com.polymorphism.MainInterf;

public class ManipulateAnimals {

	public static void main(String[] args) {
		
		// Make ArrayList Object with super interface for call All function
		List<MainInterf> list = new ArrayList<MainInterf>();
		
		//make Object and add in list For Save
		Animal animal_1 = new Animal("A1");
		list.add(animal_1);
		
		//make Object and add in list For Save
		Vehicle vehicle_1 = new Vehicle("V1", "20Y");
		list.add(vehicle_1);
				
		//make Object and add in list For Save		
		Animal animal_2 = new Animal("A2");
		list.add(animal_2);
		
		//make Object and add in list For Save
		Vehicle vehicle_2 = new Vehicle("V2", "5Y 1M");
		list.add(vehicle_2);
		
		//For Loop for Call All function with help of  super interface
		for (MainInterf mainInterf : list) {
			mainInterf.drawObject();
			mainInterf.resizeObject();
			mainInterf.rotateObject();
			mainInterf.playSound();
		}
		
	}
	
}

