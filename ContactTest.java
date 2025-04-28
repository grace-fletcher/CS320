/*
 * Author: Grace Fletcher
 * Course: CS 320
 * Date: March 21, 2025
 * Description: This contains the unit tests for the Contact class.
 * 
 */

package Test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

import Contact.Contact;


public class ContactTest {
	// Testing to ensure that the Contact ID cannot have more than 10 characters
	@Test
	@DisplayName("Test to make sure that Contact ID cannot have more than 10 characters.")
	void testContactIDWithTenPlusCharacters() {
		Contact contact = new Contact("FirstName", "LastName", "1113338888", "Address");
		if (contact.getContactID().length() > 10) {
			fail("Contact ID has more than 10 characters.");
		}
	}
	
	
	// Testing to ensure that the first name cannot have more than 10 characters
	@Test
	@DisplayName("Test to make sure that First Name cannot have more than 10 characters.")
	void testFirstNameWithTenPlusCharacters() {
		Contact contact = new Contact("ThisIsALongName", "LastName", "1113338888", "Address");
		if (contact.getFirstName().length() > 10) {
			fail("First Name has more than 10 characters.");
		}
	}
	
	
	// Testing to ensure that the last name cannot have more than 10 characters
	@Test
	@DisplayName("Test to make sure that Last Name cannot have more than 10 characters.")
	void testLastNameWithTenPlusCharacters() {
		Contact contact = new Contact("FirstName", "ThisIsALongName", "1113338888", "Address");
		if (contact.getLastName().length() > 10) {
			fail("Last Name has more than 10 characters.");
		}
	}
	
	
	// Testing to ensure that the phone number is exactly 10 characters long
	@Test
	@DisplayName("Test to make sure that Phone Number is exactly 10 characters long.")
	void testPhoneNumberWithTenPlusCharacters() {
		Contact contact = new Contact("FirstName", "LastName", "12345678901", "Address");
		if (contact.getNumber().length() != 10) {
			fail("Phone number length is not equal to 10.");
		}
	}
	
	
	// Testing to ensure that the address cannot have more than 30 characters
	@Test
	@DisplayName("Test to make sure that Address cannot have more than 30 characters.")
	void testAddressWithThirtyPlusCharacters() {
		Contact contact = new Contact("FirstName", "LastName", "1113338888", "MyAddressIsReallyReallyReallyLong");
		if (contact.getAddress().length() > 30) {
			fail("Address has more than 30 characters.");
		}
	}
	
	
	// Testing to make sure that first name cannot be null
	@Test
	@DisplayName("Test to make sure that First Name cannot be null.")
	void testFirstNameNotNull() {
		Contact contact = new Contact(null, "LastName", "1113338888", "Address");
		assertNotNull(contact.getFirstName(), "First name was null.");
	}
	
	
	// Testing to make sure that last name cannot be null
	@Test
	@DisplayName("Test to make sure that Last Name cannot be null.")
	void testLastNameNotNull() {
		Contact contact  = new Contact("FirstName", null, "1113338888", "Address");
		assertNotNull(contact.getLastName(), "Last Name was null.");
	}
	
	
	// Testing to make sure that phone number cannot be null
	@Test
	@DisplayName("Test to make sure that Phone Number cannot be null.")
	void testNumberNotNull() {
		Contact contact = new Contact("FirstName", "LastName", null, "Address");
		assertNotNull(contact.getNumber(), "Phone number was null.");
	}
	
	
	// Testing to make sure that address cannot be null
	@Test
	@DisplayName("Test to make sure that Adress cannot be null.")
	void testAddressNotNull() {
		Contact contact = new Contact("FirstName", "LastName", "111333888", null);
		assertNotNull(contact.getAddress(), "Address was null.");
	}

}
