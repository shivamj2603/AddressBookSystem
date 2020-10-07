package AddressBookSystem;
import java.util.*;
import java.util.Set;
import java.util.HashMap;

public class AddressBookMain {
	static HashMap<String, AddressBook> addressBookMap = new HashMap<>();
	public static void createAddressBook() {
		Scanner input = new Scanner(System.in);
		System.out.println("Do you wish to add a new Address Book?(yes/no)");
		if(input.nextLine().equals("yes")) {
			do {
				System.out.println("Enter the name of Address Book");
				String addressBookName = input.nextLine();
				addressBookMap.put(addressBookName, new AddressBook("addressBookName"));
				System.out.println("Do you wish to continue/add new AddressBook(yes/no)?");
			}while(input.nextLine().equals("yes"));
		}
	}
	public static void main(String[] args) {
		ArrayList<AddressBook> addressbook = new ArrayList<>();
		System.out.println("Welcome to Address Book");
		createAddressBook();
		Scanner input = new Scanner(System.in);
		input.nextLine();
		System.out.println("Enter the AddressBookName you wish to access");
		String addressBookName = input.nextLine();
		do {
			System.out.println("1.Add a new Contact");
			System.out.println("2.Edit the contact details");
			System.out.println("3.Delete a Contact");
			int choice = input.nextInt();
			input.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter the details of person");
				System.out.println("Enter the first name");
				String firstName = input.nextLine();
				System.out.println("Enter the last name");
				String lastName = input.nextLine();
				System.out.println("Enter the address");
				String address = input.nextLine();
				System.out.println("Enter the city name");
				String city = input.nextLine();
				System.out.println("Enter the state name");
				String state = input.nextLine();
				System.out.println("Enter the ZIP code");
				int zip = input.nextInt();
				input.nextLine();
				System.out.println("Enter the phone number");
				long phoneNumber = input.nextLong();
				input.nextLine();
				System.out.println("Enter the email");
				String email = input.nextLine();
				Contact contact = new Contact(firstName,lastName,address,city,state,zip,phoneNumber,email);//Created Contact
				addressBookMap.get(addressBookName).addContact(contact);
				break;
			case 2:
				System.out.println("Enter the contact name");
				String name = input.nextLine();
				addressBookMap.get(addressBookName).editContact(name);
				break;
			case 3:
				System.out.println("Enter the contact name");
				String  contactName = input.nextLine();
				addressBookMap.get(addressBookName).deleteContact(contactName);
				break;
			default:
				break;
			} 
			System.out.println("Do you wish to continue(yes/no)?");
		}
		while(input.nextLine().equals("yes"));
		for(Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {
			System.out.println(entry.getKey() + " : ");
			System.out.println(entry.getValue().getAddressBook());
		}
		System.out.println("Thank You");
	}

}


