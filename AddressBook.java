package AddressBookSystem;

import java.util.ArrayList;

public class AddressBook {
	public ArrayList<Contact> addressBook = new ArrayList<Contact>();
	
	public ArrayList<Contact> getAddressBook() {
		return addressBook;
	}
	
	public void setAddressBook(ArrayList<Contact> addressbook) {
		this.addressBook = addressBook;
	}
	
	public void addContact(Contact contact) {
		addressBook.add(contact);
	}	

}
