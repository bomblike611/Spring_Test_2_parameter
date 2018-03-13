package com.choa.car;

public class CarService {
	private Car car;
	
	
	
	public void setCar(Car car) {
		this.car = car;
	}



	public void info(){
		System.out.println(car.getColor());
		System.out.println(car.getPrice());
		System.out.println("====Engine====");
		System.out.println(car.getEngine().getFuel());
		System.out.println(car.getEngine().getHp());
		System.out.println("====Tire====");
		System.out.println(car.getTire().getCompany());
		System.out.println(car.getTire().getKind());
	}
}
