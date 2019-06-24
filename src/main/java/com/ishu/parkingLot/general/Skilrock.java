package com.ishu.parkingLot.general;

public class Skilrock extends Company{
	
	private final int totalParkingSpace = 150;
	
	private volatile int parkingSpace = 150;

	@Override
	protected int getCurrentSize() {
		return parkingSpace;
	}

	@Override
	protected boolean isFull() {
		if(parkingSpace == 0)
			return true;
		else
			return false;
	}

	@Override
	protected boolean isEmpty() {
		if(parkingSpace == totalParkingSpace)
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
