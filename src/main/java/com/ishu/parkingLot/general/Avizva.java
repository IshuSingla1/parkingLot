package com.ishu.parkingLot.general;

public class Avizva extends Company{
	
	private final int totalParkingSpace = 120;
	
	private volatile int parkingSpace = totalParkingSpace;

	@Override
	protected int getCurrentSize() {
		return parkingSpace;
	}

	@Override
	protected boolean isFull() {
		if(parkingSpace == totalParkingSpace)
			return true;
		else
			return false;
	}

	@Override
	protected boolean isEmpty() {
		if(parkingSpace == 0)
			return true;
		else
			return false;
	}

	@Override
	protected void addVehicleInParkingSpace(Vehicle v) {
		parkingSpace = parkingSpace - v.size();
	}

	@Override
	protected void removeVehicleInParkingSpace(Vehicle v) {
		parkingSpace = parkingSpace + v.size();
		
	}

	@Override
	protected int getTotalParkingSize() {
		return totalParkingSpace;
	}

}
