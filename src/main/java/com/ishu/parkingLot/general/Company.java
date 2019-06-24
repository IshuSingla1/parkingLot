package com.ishu.parkingLot.general;

public abstract class Company {
	
	protected abstract int getCurrentSize();
	protected abstract int getTotalParkingSize();
	protected abstract boolean isFull();
	protected abstract boolean isEmpty();
	protected abstract void addVehicleInParkingSpace(Vehicle v);
	protected abstract void removeVehicleInParkingSpace(Vehicle v);
	
	protected String addVehicle(Vehicle v){
		if(isFull()){
			return "Cannot add vehicle space full";
		}
		int vehicleSize = v.size();
		int emptySpace = getCurrentSize();
		if((emptySpace-vehicleSize) > 0){
			addVehicleInParkingSpace(v);
			return v.getType() + " added successfully in parking";
		}else{
			return "Cannot add vehicle space full";
		}
		
	}
	protected String removeVehicle(Vehicle v){
		if(isEmpty()){
			return "No vehicle in parking to remove";
		}
		int vehicleSize = v.size();
		int currentSize = getCurrentSize();
		int totalParkingSize = getTotalParkingSize();
		if((currentSize + vehicleSize) <= totalParkingSize){
			removeVehicleInParkingSpace(v);
			return v.getType() + " removed successfully from parking";
		}else{
			return "Cannot remove vehicle";
		}
		
	}
	
	
	

}
