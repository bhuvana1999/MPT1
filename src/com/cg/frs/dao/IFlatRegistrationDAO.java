package com.cg.frs.dao;

import java.util.ArrayList;

import com.cg.frs.dto.FlatRegistrationDTO;

public interface IFlatRegistrationDAO {
	public void addFlat(FlatRegistrationDTO beanobj);

	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO beanobj) throws IdNotFoundException;

	public ArrayList<Integer> getAllOwnerIds() throws IdNotFoundException;

	public ArrayList<FlatRegistrationDTO> getFlatDetails(int registrationId) throws IdNotFoundException;

}
