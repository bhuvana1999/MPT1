package com.cg.frs.dto;

public class FlatRegistrationDTO {
	private int ownerId;
	private int flatType;
	private int flatArea;
	private double rentAmount;
	private double depositAmount;
	private int registrationId;

	// getters and setters

	public int getOwnerId() {
		return ownerId;
	}

	public int getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public int getFlatType() {
		return flatType;
	}

	public void setFlatType(int flatType) {
		this.flatType = flatType;
	}

	public int getFlatArea() {
		return flatArea;
	}

	public void setFlatArea(int flatArea) {
		this.flatArea = flatArea;
	}

	public double getRentAmount() {
		return rentAmount;
	}

	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	// constructor
	public FlatRegistrationDTO(int registrationId, int ownerId, int flatType, int flatArea, double rentAmount,
			double depositAmount) {
		super();
		this.registrationId = registrationId;
		this.ownerId = ownerId;
		this.flatType = flatType;
		this.flatArea = flatArea;
		this.rentAmount = rentAmount;
		this.depositAmount = depositAmount;
	}

	public FlatRegistrationDTO() {
		super();
	}

	@Override
	public String toString() {
		return "ownerId=" + ownerId + ",\n flatType=" + flatType + ", \n flatArea=" + flatArea + ",\n rentAmount="
				+ rentAmount + ", \n depositAmount=" + depositAmount + ", \n registrationId=" + registrationId;
	}

}
