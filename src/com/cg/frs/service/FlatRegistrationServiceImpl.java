package com.cg.frs.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.frs.dao.FlatRegistrationDAOImpl;
import com.cg.frs.dto.FlatRegistrationDTO;

public class FlatRegistrationServiceImpl implements IFlatRegistrationService {
	Scanner sc = new Scanner(System.in);
	FlatRegistrationDAOImpl daoobj = new FlatRegistrationDAOImpl();

	public ArrayList<Integer> getAllOwnerIds() {

		return daoobj.getAllOwnerIds();

	}

	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO beanobj) {
		return daoobj.registerFlat(beanobj);

	}

	public ArrayList<FlatRegistrationDTO> getFlatDetails(int registrationId) {

		return daoobj.getFlatDetails(registrationId);
	}

	public int IdCheck(int id) {
		while (true) {
			if (id > 3) {
				System.out.println("please reselect your id from the above option");
				id = sc.nextInt();
			} else {
				return id;
			}
		}
	}

	public int TypeCheck(int type) {
		while (true) {
			if (type > 2) {
				System.out.println("select valid option");
				type = sc.nextInt();
			} else {
				return type;
			}
		}
	}

}
