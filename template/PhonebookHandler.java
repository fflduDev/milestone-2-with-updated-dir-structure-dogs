package template;

import java.util.*;

/**
 * PhonebookHandler - supports 
 * Phonebook operations
 * 
 * Use a map to build the Phonebook
 * key: Contact
 * value: List<phonebookEntries>
 */

public class PhonebookHandler implements iPhonebookHander{

	private Map<Contact, List<PhonebookEntry>> phonebook;
	//constructor may be wrong, just fixed the errors
	public PhonebookHandler(Map<Contact, List<PhonebookEntry>> phonebook) {
		this.phonebook = new HashMap<>();
	}


	@Override
	public List<Contact> sortByName() {
		// TODO Auto-generated method stub
		List<Contact> contacts = new ArrayList<>(phonebook.keySet());

		for (int i = 0; i < contacts.size() - 1; i++) {
			for (int j = i + 1; j < contacts.size() - 1 - i; j++) {
				if (contacts.get(j).getName().compareTo(contacts.get(j+1)) > 0) {
					Contact temp = contacts.get(i);
					contacts.set(j, contacts.get(j+1));
					contacts.set(j+1, temp);
				}
			}
		}
		return contacts;
	}

	@Override
	public List<PhonebookEntry> binarySearch(List<Contact> sortedContacts, String name) {
		// TODO Auto-generated method stub
		List<PhonebookEntry> result = new ArrayList<>();
		return null;
	}

	@Override
	public void display(List<Contact> sortedContacts) {
		// TODO Auto-generated method stub
		System.out.println("[");
		for (int i = 0; i < sortedContacts.size(); i++) {
			System.out.println(sortedContacts.get(i));
			if (i != sortedContacts.size() - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

 
}
