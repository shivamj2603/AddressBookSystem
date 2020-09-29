package AddressBookSystem;
import java.util.*;

public class AddressBookMain {
	
    public static void main(String[] args) {
    	AddressBook addressBook = new AddressBook();
	    System.out.println("Welcome to Address Book");
	    Scanner sc = new Scanner(System.in);
	    do {
	    	sc.nextLine();
	    	System.out.println("1.Add a new Contact");
	    	System.out.println("2.Edit the contact details");
	    	System.out.println("3.Delete a Contact");
	    	int choice = sc.nextInt();
	    	sc.nextLine();
	    	switch(choice) {
	    	case 1:
	    		System.out.println("Enter the details of person");
	    		System.out.println("Enter the first name");
	    		String firstName = sc.nextLine();
	    		System.out.println("Enter the last name");
	    		String lastName = sc.nextLine();
	    		System.out.println("Enter the address");
	    		String address = sc.nextLine();
	    		System.out.println("Enter the city name");
	    		String city = sc.nextLine();
	    		System.out.println("Enter the state name");
	    		String state = sc.nextLine();
	    		System.out.println("Enter the ZIP code");
	    		int zip = sc.nextInt();
	    		sc.nextLine();
	    		System.out.println("Enter the phone number");
	    		long phoneNumber = sc.nextLong();
	    		sc.nextLine();
	    		System.out.println("Enter the email");
	    		String email = sc.nextLine();
	    		Contact contact = new Contact(firstName,lastName,address,city,state,zip,phoneNumber,email);//Created Contact
	    		addressBook.addContact(contact);//added Contact to the AddressBook
	    		break;
	    	case 2:
	    		System.out.println("Enter the contact name");
	    		String name = sc.nextLine();
	    		addressBook.editContact(name);//edited Contact
	    		break;
	    	case 3:
	    		System.out.println("Enter the contact name");
	    		String  contactName = sc.nextLine();
	    		addressBook.deleteContact(contactName);//deleted Contact
	    		break;
	    	default:
	    		break;
	    	} 
	    	System.out.println("Do you wish to continue/add new Contacts(Y/N)?");
	    }
            while(sc.next().charAt(0)=='Y');
	    System.out.println("Thank You");
	    ArrayList<Contact> contactList = addressBook.getAddressBook();
	    for(Contact contact : contactList) {
	    	System.out.println(contact);//Display of Contact List in AddressBook
	    }
	}

}
