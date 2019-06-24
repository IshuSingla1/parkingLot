package com.ishu.parkingLot.general;

public class TestParking {
	
	public static void main(String[] args) {
		Company skilrock = new Skilrock();
		System.out.println(skilrock.getCurrentSize());
		System.out.println(skilrock.addVehicle(new Bus()));
		System.out.println(skilrock.addVehicle(new Car()));
		System.out.println(skilrock.addVehicle(new Bike()));
		System.out.println(skilrock.getCurrentSize());
		System.out.println(skilrock.removeVehicle(new Car()));
		System.out.println(skilrock.removeVehicle(new Bus()));
		System.out.println(skilrock.removeVehicle(new Bike()));
		System.out.println(skilrock.removeVehicle(new Car()));
		System.out.println(skilrock.getCurrentSize());
	}

}
