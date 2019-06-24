package com.ishu.parkingLot.general;

public class Bike implements Vehicle{

	@Override
	public int size() {
		return VehicleType.BIKE.getSize();
	}

	@Override
	public String getType() {
		return VehicleType.BIKE.getType();
	}

}
