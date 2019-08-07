package com.cg.frs.ui;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.cg.frs.dao.IdNotFoundException;
import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.service.FlatRegistrationServiceImpl;

public class Client {
	public static void main(String[] args) throws Exception {

		FlatRegistrationServiceImpl serviceobj = new FlatRegistrationServiceImpl();
		Scanner sc = new Scanner(System.in);

		System.out.println("1.  Register Flat");
		System.out.println("2.  Display Flat Registration");
		System.out.println("3.  Exit");
		int ch;

		do {
			System.out.println("enter your choice");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				ArrayList<Integer> ids = serviceobj.getAllOwnerIds();
				System.out.println("Existing Owner IDS Are:- " + ids);
				System.out.println("please enter your owner id from above list: ");
				int ownerId = serviceobj.IdCheck(sc.nextInt());
				System.out.println("Select Flat Type (1-1BHK, 2-2BHK): ");
				int flatType = serviceobj.TypeCheck(sc.nextInt());
				System.out.println("Enter Flat area in sq.ft.: ");
				int flatArea = sc.nextInt();
				System.out.println("Enter desired rent amount Rs: ");
				double rentAmount = sc.nextDouble();
				System.out.println("Enter desired deposit amount Rs: ");
				double depositAmount = sc.nextDouble();
				if (depositAmount < rentAmount) {
					System.out.println("Deposit amount can not be less than rent amount");
					System.out.println("Enter the deposite amount again");
					depositAmount = sc.nextDouble();
				} 
			
				Random r = new Random();
				int registrationId = r.nextInt(10000);
				try {
					FlatRegistrationDTO beanobj = new FlatRegistrationDTO(registrationId, ownerId, flatType, flatArea,
							rentAmount, depositAmount);
					System.out.println("Flat sucessfully registered. Registration id:<" + registrationId + ">");
					serviceobj.registerFlat(beanobj);
				} catch (IdNotFoundException e) {
					System.out.println(e.getMessage());
				}
				

				break;
			case 2:
				System.out.println("Enter RegistrationId");
				registrationId = sc.nextInt();
				try {
					serviceobj.getFlatDetails(registrationId);
				} catch (IdNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("Thank You...!");
				System.exit(0);
				break;
			}

		} while (ch != 3);
		sc.close();
	}
}
