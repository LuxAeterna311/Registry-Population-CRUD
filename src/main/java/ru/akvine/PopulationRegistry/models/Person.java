package ru.akvine.PopulationRegistry.models;

import javax.persistence.*;


@Entity
@Table(name="Person")
public class Person {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "BIRTH_DATE")
	private String birthDate;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "SECOND_NAME")
	private String secondName;
	
	@Column(name = "THIRD_NAME")
	private String thirdName;
	
	@Column(name = "AGE")
	private int age;
	
	@Column(name = "CITY")
	private String city;
	
	@Column(name = "STREET")
	private String street;
	
	@Column(name = "HOUSE_NUMBER")
	private int houseNumber;
	
	@Column(name = "APARTMENT_NUMBER")
	private int apartmentNumber;
	
	@Column(name = "POSTAL")
	private String postal;
	
	@Column(name = "PAS_NUMBER")
	private String pasNumber;
	
	@Column(name = "PAS_SERIES")
	private String pasSeries;
	
	@Column(name = "RECEIPT_DATE")
	private String receiptDate;
	
	public Person() {
		
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getSecondName() {
		return secondName;
	}


	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}


	public String getThirdName() {
		return thirdName;
	}


	public void setThirdName(String thirdName) {
		this.thirdName = thirdName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public int getHouseNumber() {
		return houseNumber;
	}


	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}


	public int getApartmentNumber() {
		return apartmentNumber;
	}


	public void setApartmentNumber(int apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}


	public String getPostal() {
		return postal;
	}


	public void setPostal(String postal) {
		this.postal = postal;
	}


	public String getPasNumber() {
		return pasNumber;
	}


	public void setPasNumber(String pasNumber) {
		this.pasNumber = pasNumber;
	}


	public String getPasSeries() {
		return pasSeries;
	}


	public void setPasSeries(String pasSeries) {
		this.pasSeries = pasSeries;
	}


	public String getReceiptDate() {
		return receiptDate;
	}


	public void setReceiptDate(String receiptDate) {
		this.receiptDate = receiptDate;
	}


	@Override
	public String toString() {
		return "Person{" + id +
				", " + this.birthDate +
				", " + this.firstName +
				", " + this.secondName +
				", " + this.thirdName +
				", " + this.age +
				", " + this.city + 
				", " + this.street + 
				", " + this.houseNumber + 
				", " + this.apartmentNumber + 
				", " + this.postal + 
				", " + this.pasNumber + 
				", " + this.pasSeries +
				", " + this.receiptDate + "}";
	}
}
