package ru.akvine.PopulationRegistry.models;

import javax.persistence.*;
import javax.validation.constraints.*;


@Entity(name="Person")
@Table(name="person_table", schema = "public")
public class Person {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Size(min=2, max=25)
	@Column(name = "first_name")
	private String firstName;
	
	@Size(min=2, max=25)
	@Column(name = "second_name")
	private String secondName;
	
	@Size(min = 0, max = 150)
	@Column(name = "age")
	private int age;
	
	@Size(min=10, max=10)
	@Column(name = "birth_date")
	private String birthDate;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phone;
	
	Person() {
		
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
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


	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getBirthDate() {
		return birthDate;
	}



	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}



	@Override
	public String toString() {
		return "Person{" + id +
				", " + this.firstName +
				", " + this.secondName +
				", " + this.age +
				", " +  this.birthDate +
				", " + this.email + 
				", " + this.phone + "}";
	}
}
