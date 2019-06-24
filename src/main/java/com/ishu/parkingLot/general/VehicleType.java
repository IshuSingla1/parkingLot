package com.ishu.parkingLot.general;

public enum VehicleType {
	
	BIKE("Bike",1),
	CAR("Car",2),
	BUS("Bus",4);
	
	private String type;
	private int size;
	
	private VehicleType(String type,int size){
		this.type = type;
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public int getSize() {
		return size;
	}

}
