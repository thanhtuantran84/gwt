package org.usesoft.gwtrestapp.server.interfaces.api;

import java.util.HashMap;
import java.util.Map;

import org.usesoft.gwtrestapp.shared.domain.ParkingLot;

public class ParkingLotResource {
	Map<String, ParkingLot> database;
	public ParkingLotResource() {
		database = new HashMap<String, ParkingLot>();
	    ParkingLot parkingLot1 = new ParkingLot(0, null, null, null);
	    
	    database.put(parkingLot1.getName(), parkingLot1);
	}
	
}
