package com.cg.frs.dto;

public class FlatOwners {
	private int ownerId;
	private String ownerName;
	private String mobileNumber;

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public FlatOwners(int ownerId, String ownerName, String mobileNumber) {
		super();
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.mobileNumber = mobileNumber;
	}

	public FlatOwners() {
		super();
	}

}
