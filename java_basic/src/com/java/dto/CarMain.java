package com.java.dto;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		System.out.println("¹ÙÄû¼ö : " + car.wheel);
		
		car = new Ambulance();
		Ambulance a = (Ambulance)car;
		System.out.println("¹ÙÄû¼ö : " + car.wheel);
		System.out.println("¹ÙÄû¼ö : " + a.madicine);
		
		car = new FireEngine();
		if(car instanceof FireEngine) {
			car = new Car();
			
			car.speedUp();
			car.speedDown();
			
			FireEngine f = new FireEngine();
			car = f;
			
			car.speedUp();
			car.speedDown();
			f.speedUp();
			f.speedDown();
			System.out.println(car.wheel);
			car.speedDown();
		}
		else {
			System.out.println("");
		}
		
		
	}

}
