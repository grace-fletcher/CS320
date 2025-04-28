/*
 * Author: Grace Fletcher
 * Course: CS 320
 * Date: March 21, 2025
 * Description: This contact service class maintains the list of contacts. It also
 * adds, deletes, and updates contact information as needed.
 * 
 */

package Contact;

import java.util.ArrayList;

public class ContactService {
	// This ArrayList holds the list of contacts
	public static ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	// Method to display the list of contacts.
	public void displayContactList() {
		for (int i = 0; i < contactList.size(); i++) {
			System.out.println("Contact ID: " + contactList.get(i).getContactID());
			System.out.println("First Name: " + contactList.get(i).getFirstName());
			System.out.println("Last Name: " + contactList.get(i).getLastName());
			System.out.println("Phone Number: " + contactList.get(i).getNumber());
			System.out.println("Address: " + contactList.get(i).getAddress() + "\n");
		}
	
	}
	
	
	// Method that adds a new contact to the list of contacts using the Contact constructor.
	public void addContact(String firstName, String lastName, String number, String address) {
		Contact contact = new Contact(firstName, lastName, number, address);
		contactList.add(contact);
	}
	
	
	// Method that gets a contact from the list of contacts using contactID.
	public Contact getContact(String contactID) {
		// Creating a default Contact to use in loop to look for existing contact.
		// If no existing contactID is found, the default Contact values are returned.
		Contact contact = new Contact(null, null, null, null);
		
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID().contentEquals(contactID)) {
				contact = contactList.get(i);
			}
		}
		return contact;
	}
	
	
	// Method to delete a contact from the list of contacts using contactID.
	public void deleteContact(String contactID) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID().equals(contactID)) {
				contactList.remove(i);
				break;
			}
			if (i == contactList.size() - 1) {
				System.out.println("Contact ID: " + contactID + " not found.");
			}
		}
	}
	
	
	// Method to update the first name of a contact.
	public void updateFirstName(String updatedString, String contactID) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID().equals(contactID)) {
				contactList.get(i).setFirstName(updatedString);
				break;
			}
			if (i == contactList.size() - 1) {
				System.out.println("Contact ID: " + contactID + " not found.");
			}
		}
	}
	
	
	// Method to update the last name of a contact.
	public void updateLastName(String updatedString, String contactID) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID().equals(contactID)) {
				contactList.get(i).setLastName(updatedString);
				break;
			}
			if (i == contactList.size() - 1) {
				System.out.println("Contact ID: " + contactID + " not found.");
			}
		}
	}
	
	
	// Method to update the phone number of a contact.
	public void updateNumber(String updatedString, String contactID) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID().equals(contactID)) {
				contactList.get(i).setNumber(updatedString);
				break;
			}
			if (i == contactList.size() - 1) {
				System.out.println("Contact ID: " + contactID + " not found.");
			}
		}
	}
	
	
	// Method to update the address of a contact.
	public void updateAddress(String updatedString, String contactID) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID().equals(contactID)) {
				contactList.get(i).setAddress(updatedString);
				break;
			}
			if (i == contactList.size() - 1) {
				System.out.println("Contact ID: " + contactID + " not found.");
			}
		}
	}

}
