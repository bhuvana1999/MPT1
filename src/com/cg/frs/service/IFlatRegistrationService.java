package com.cg.frs.service;

import java.util.ArrayList;

import com.cg.frs.dto.FlatRegistrationDTO;

public interface IFlatRegistrationService {
	public ArrayList<Integer> getAllOwnerIds();

	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO beanobj);

	public ArrayList<FlatRegistrationDTO> getFlatDetails(int registrationId);

}
