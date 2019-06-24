package com.ishu.parkingLot.general;

public class Bus implements Vehicle {

	@Override
	public int size() {
		return VehicleType.BUS.getSize();
	}

	@Override
	public String getType() {
		return VehicleType.BUS.getType();
	}

}
