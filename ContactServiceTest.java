/*
 * Author: Grace Fletcher
 * Course: CS 320
 * Date: March 21, 2025
 * Description: This contains the unit tests for the ContactService class.
 * 
 */

package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Contact.Contact;
import Contact.ContactService;

public class ContactServiceTest {
	// Clears the ArrayList after each test.
	@AfterEach
	void tearDown() throws Exception{
		ContactService.contactList.clear();
	}
	
	// Testing addContact
	@Test
	@DisplayName("Test to make sure adding a contact works.")
	void testAddContact() {
		ContactService service = new ContactService();
		service.addContact("Grace", "Fletcher", "8881115555", "123 Sesame St.");
		service.displayContactList();
		assertNotNull(service.getContact("0"), "Contact was not added correctly.");
	}
	
	
	// Testing deleteContact
	@Test
	@DisplayName("Test to make sure deleting a contact works.")
	void testDeleteContact() {
		ContactService service = new ContactService();
		service.addContact("Grace", "Fletcher", "8881115555", "123 Sesame St.");
		service.deleteContact("17");
		// Creating a new contact list to ensure the the original contact list is empty.
		ArrayList<Contact> contactListEmpty = new ArrayList<Contact>();
		service.displayContactList();
		assertEquals(ContactService.contactList, contactListEmpty, "The contact was not deleted.");
	}
	
	
	// Testing updateAddress
	@Test
	@DisplayName("Test to make sure updating an address works.")
	void testUpdateAddress() {
		ContactService service = new ContactService();
		service.addContact("Grace", "Fletcher", "8881115555", "123 Sesame St.");
		service.updateAddress("123 Pleasant St.", "15");
		service.displayContactList();
		assertEquals("123 Pleasant St.", service.getContact("15").getAddress(), "Address was not updated.");
	}
	
	
	// Testing updateNumber
	@Test
	@DisplayName("Test to make sure updating a phone number works.")
	void testUpdateNumber() {
		ContactService service  = new ContactService();
		service.addContact("Grace", "Fletcher", "8881115555", "123 Sesame St.");
		service.updateNumber("1118883333", "17");
		service.displayContactList();
		assertEquals("1118883333", service.getContact("17").getNumber(), "Phone number was not updated.");
	}
	
	
	// Testing updateFirstName
	@Test
	@DisplayName("Test to make sure updating a first name works.")
	void testUpdateFirstName() {
		ContactService service  = new ContactService();
		service.addContact("Grace", "Fletcher", "8881115555", "123 Sesame St.");
		service.updateFirstName("Audrey", "9");
		service.displayContactList();
		assertEquals("Audrey", service.getContact("9").getFirstName(), "First name was not updated.");
		
	}
	
	
	// Testing updateLastName
	@Test
	@DisplayName("Test to make sure updating a last name works.")
	void testUpdateLastName() {
		ContactService service = new ContactService();
		service.addContact("Grace", "Fletcher", "8881115555", "123 Sesame St.");
		service.updateLastName("Pratt", "11");
		service.displayContactList();
		assertEquals("Pratt", service.getContact("11").getLastName(), "Last name was no updated.");
	}

}
