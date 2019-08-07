package com.cg.frs.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.frs.dto.FlatOwners;
import com.cg.frs.dto.FlatRegistrationDTO;

public class FlatRegistrationDAOImpl implements IFlatRegistrationDAO {
	FlatOwners bean;
	FlatRegistrationDTO beanobj;

	HashMap<Integer, FlatOwners> owners = new HashMap<Integer, FlatOwners>();
	{
		owners.put(1, new FlatOwners(1, "vaishali", "9023002122"));
		owners.put(2, new FlatOwners(2, "Megha", "9643221234"));
		owners.put(3, new FlatOwners(3, "Manish", "5453221234"));
		System.out.println(owners);

	}

	HashMap<Integer, FlatRegistrationDTO> flatDetails = new HashMap<Integer, FlatRegistrationDTO>();

	public HashMap<Integer, FlatOwners> owners() {
		return owners;
	}

	public HashMap<Integer, FlatRegistrationDTO> flatDetails() {
		return flatDetails;
	}

	public void addFlat(FlatRegistrationDTO beanobj) {
		this.beanobj = beanobj;
		flatDetails.put(beanobj.getRegistrationId(), beanobj);
		System.out.println(flatDetails);
	}

	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO beanobj) throws IdNotFoundException {
		flatDetails.put(beanobj.getRegistrationId(), beanobj);
		beanobj = (FlatRegistrationDTO) flatDetails.get(beanobj.getRegistrationId());

		return beanobj;
	}

	public ArrayList<Integer> getAllOwnerIds() throws IdNotFoundException {
		owners.keySet();
		ArrayList<Integer> al = new ArrayList<Integer>(owners.keySet());

		return al;
	}

	public ArrayList<FlatRegistrationDTO> getFlatDetails(int registrationId) throws IdNotFoundException {
		if (flatDetails.containsKey(registrationId))

			System.out.println(flatDetails.values());
		else
			System.out.println("Owner does not exit");

		return null;
	}

}
