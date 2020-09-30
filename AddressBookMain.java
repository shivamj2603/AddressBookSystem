package AddressBookSystem;
import java.util.*;
import java.util.HashMap;

public class AddressBookMain {
	static int option=0;
	public static void main(String[] args) {
		AddressBook[] addressBook = new AddressBook[2];
		addressBook[0]=new AddressBook("Mumbai");
		addressBook[1]=new AddressBook("Chennai");
		System.out.println("Welcome to Address Book");
		Scanner sc = new Scanner(System.in);
		HashMap<String,AddressBook> addressBookMap = new HashMap<>();
		addressBookMap.put("Mumbai", addressBook[0]);
		addressBookMap.put("Chennai", addressBook[1]);
		do {
			sc.nextLine();
			System.out.println("1.Add a new Contact");
			System.out.println("2.Edit the contact details");
			System.out.println("3.Delete a Contact");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter the details of person\nEnter 1.Mumbai 2.Chennai");
				option = sc.nextInt();
				sc.nextLine();
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
				if(option == 1) {
					addressBook[0].addContact(contact);
				}
				else {
					addressBook[1].addContact(contact);
				}
				break;
			case 2:
				System.out.println("Enter the contact name");
				String name = sc.nextLine();
				if(option == 1)
				{
					addressBook[0].editContact(name);	
				}
				else
				{
					addressBook[0].editContact(name);
				}
				break;
			case 3:
				System.out.println("Enter the contact name");
				String  contactName = sc.nextLine();
				if(option == 1)
				{
					addressBook[0].deleteContact(contactName);
				}
				else
				{
					addressBook[1].deleteContact(contactName);
				}
				break;
			default:
				break;
			} 
			System.out.println("Do you wish to continue/add new Contacts(Y/N)?");
		}
		while(sc.next().charAt(0) == 'Y');
		System.out.println("Thank You");
		System.out.println("List of Contacts in Address Book of Mumbai :");
		System.out.println(addressBook[0].getAddressBook());
		System.out.println("List of Contacts in Address Book of Chennai :");
		System.out.println(addressBook[1].getAddressBook());
	}

}


