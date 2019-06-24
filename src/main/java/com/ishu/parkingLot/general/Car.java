package com.ishu.parkingLot.general;

public class Car implements Vehicle {

	@Override
	public int size() {
		return VehicleType.CAR.getSize();
	}

	@Override
	public String getType() {
		return VehicleType.CAR.getType();
	}

}
