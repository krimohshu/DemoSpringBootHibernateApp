package com.demo.entity;

import java.sql.Timestamp;
import java.util.GregorianCalendar;

//import java.sql.Timestamp;

//import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private Long id;

	@Column(nullable = false, unique = true, name = "USER_NAME", updatable = true, length = 100)
	private String userName;

	@Column(nullable = false, name = "FIRST_NAME", updatable = true, length = 100)
	private String firstName;

	@Column(nullable = true, name = "MIDDLE_NAME", updatable = true, length = 100)
	private String middleName;

	@Column(nullable = false, name = "LAST_NAME", updatable = true, length = 100)
	private String lastName;

	// private Address address;

	@Column(nullable = true, name = "AGE", updatable = true, length = 3)
	private Integer age;

	@Column(nullable = false)
	private String createUser = "System";

	@Column(nullable = false)
	private String editUser = "System";

	@Column(nullable = false, updatable = false)
	@CreationTimestamp
	private Timestamp createTime = new Timestamp(GregorianCalendar.getInstance().getTimeInMillis());

	@Column(nullable = false)
	@UpdateTimestamp
	private Timestamp editTime = new Timestamp(GregorianCalendar.getInstance().getTimeInMillis());;

	public User(String userName, String firstName, String lastName, Integer age) {

		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public User(Long id, String userName, String firstName, String lastName, Integer age) {

		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the address
	 */
	/*
	 * public Address getAddress() { return address; }
	 * 
	 *//**
		 * @param address
		 *            the address to set
		 *//*
		 * public void setAddress(Address address) { this.address = address; }
		 */

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", address=");
		// builder.append(address);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}

}
