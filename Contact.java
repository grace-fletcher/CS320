/*
 * Author: Grace Fletcher
 * Course: CS 320
 * Date: March 21, 2025
 * Description: This contact class creates and stores contact information.
 * 
 */

package Contact;

import java.util.concurrent.atomic.AtomicLong;

public class Contact {
	
	private final String contactID;
	private String firstName;
	private String lastName;
	private String number;
	private String address;
	private static AtomicLong generateID = new AtomicLong();
	
	// Constructor for Contact //
	/*
	 * Takes in first name, last name, phone number, and address as parameters.
	 */
	public Contact(String firstName, String lastName, String number, String address) {
		// Contact ID is generated using AtomicLong generateID.
		// generateID is static so duplicates are avoided.
		this.contactID = String.valueOf(generateID.getAndIncrement());
		
		
		// First Name
		// If it is longer than 10 characters, only the first 10 characters are used.
		if (firstName == null || firstName.isEmpty()) {
			this.firstName = "EMPTY";
		}
		else if (firstName.length() > 10) {
			this.firstName = firstName.substring(0, 10);
		}
		else {
			this.firstName = firstName;
		}
		
		
		// Last Name
		// If it is longer than 10 characters, only the first 10 characters are used.
		if (lastName == null || lastName.isEmpty()) {
			this.lastName = "EMPTY";
		}
		else if (lastName.length() > 10) {
			this.lastName = lastName.substring(0, 10);
		}
		else {
			this.lastName = lastName;
		}
		
		
		// Phone Number
		if (number == null || number.isEmpty() || number.length() != 10) {
			this.number = "1111111111";
		}
		else {
			this.number = number;
		}
		
		
		// Address
		if (address == null || address.isEmpty()) {
			this.address = "EMPTY";
		}
		else if (address.length() > 30) {
			this.address = address.substring(0, 30);
		}
		else {
			this.address = address;
		}
		
	}
	
	// Getters
	public String getContactID() {
		return contactID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getNumber() {
		return number;
	}
	
	public String getAddress() {
		return address;
	}
	
	// Setters
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.isEmpty()) {
			this.firstName = "EMPTY";
		}
		else if (firstName.length() > 10) {
			this.firstName = firstName.substring(0, 10);
		}
		else {
			this.firstName = firstName;
		}
	}
	
	public void setLastName(String lastName) {
		if (lastName == null || lastName.isEmpty()) {
			this.lastName = "EMPTY";
		}
		else if (lastName.length() > 10) {
			this.lastName = lastName.substring(0, 10);
		}
		else {
			this.lastName = lastName;
		}
	}
	
	public void setNumber(String number) {
		if (number == null || number.isEmpty() || number.length() != 10) {
			this.number = "1111111111";
		}
		else {
			this.number = number;
		}
	}
	
	public void setAddress(String address) {
		if (address == null || address.isEmpty()) {
			this.address = "EMPTY";
		}
		else if (address.length() >30) {
			this.address = address.substring(0, 30);
		}
		else {
			this.address = address;
		}
	}
	
}
