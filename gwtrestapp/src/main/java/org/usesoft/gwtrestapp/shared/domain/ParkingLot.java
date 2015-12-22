package org.usesoft.gwtrestapp.shared.domain;

public class ParkingLot {
	private int id;
	private String name;
	private Address adress;
	private VehicleType vehicleType;

	public ParkingLot(int id, String name, Address address, VehicleType vehicleType) {
		this.id = id;
		this.name = name;
		this.adress = address;
		this.vehicleType = vehicleType;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
