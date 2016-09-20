package com.subd.pharmacy;

public class Medication {

	private String name;
	private String description;
	private float price;
	private float weight; // in grams
	private boolean isWithPrescription;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public boolean isWithPrescription() {
		return isWithPrescription;
	}

	public void setWithPrescription(boolean isWithPrescription) {
		this.isWithPrescription = isWithPrescription;
	}

}
