package AddressBookSystem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBookMain {
	static HashMap<String, AddressBook> addressBookMap = new HashMap<>();
	public static void createAddressBook() {
		Scanner input = new Scanner(System.in);
		System.out.println("Do you wish to add a new Address Book?(yes/no)");
		if(input.nextLine().equals("yes")) {
			do {
				System.out.println("Enter the State of Address Book");
				String addressBookName = input.nextLine();
				addressBookMap.put(addressBookName, new AddressBook("addressBookName"));
				System.out.println("Do you wish to continue/add new AddressBook(yes/no)?");
			}while(input.nextLine().equals("yes"));
		}
	}
	/**
	 * Usecase 7_Part1
	 * Function checks for the contact in a particular city using the contact's name across the entire address book
	 * @param name
	 * @param city
	 */
	public static void searchPersonByCity(String name, String city) {
		List<Contact> list = new ArrayList<Contact>();
		for(Map.Entry<String, AddressBook> entries : addressBookMap.entrySet()) {
			list = entries.getValue().getAddressBook().stream().filter(p -> p.getCity().equals(city)).filter(p ->(p.getFirstName() + p.getLastName()).equals(name)).collect(Collectors.toList());
		}
		for(Contact contact : list) {
			System.out.println(contact);
		}
	}
	/**
	 * UseCase7_Part2
	 * Function checks for the contact in a particular State using the contact's name across the entire address book
	 * @param name
	 * @param state
	 */
	public static void searchPersonByState(String name, String state) {
		List<Contact> list = new ArrayList<Contact>();
		for(Map.Entry<String, AddressBook> entries : addressBookMap.entrySet()) {
			list = entries.getValue().getAddressBook().stream().filter(p -> p.getState().equals(state)).filter(p ->(p.getFirstName() + p.getLastName()).equals(name)).collect(Collectors.toList());
		}
		for(Contact contact : list) {
			System.out.println(contact);
		}
	}
	/**
	 * UseCase8_Part1
	 * This function returns the list of people residing in a particular City
	 * @param city
	 */
	public static void viewPersonByCity(String city) {
		List<Contact> list = new ArrayList<Contact>();
		for(Map.Entry<String, AddressBook> entries : addressBookMap.entrySet()) {
			list = entries.getValue().getAddressBook().stream().filter(p -> p.getCity().equals(city)).collect(Collectors.toList());
		}
		for(Contact contact : list) {
			System.out.println(contact);
		}
	}
	/**
	 * UseCase8_Part2
	 * This function returns the list of people residing in a particular State
	 * @param state
	 */
	public static void viewPersonByState(String state) {
		List<Contact> list = new ArrayList<Contact>();
		for(Map.Entry<String, AddressBook> entries : addressBookMap.entrySet()) {
			list = entries.getValue().getAddressBook().stream().filter(p -> p.getState().equals(state)).collect(Collectors.toList());
		}
		for(Contact contact : list) {
			System.out.println(contact);
		}
	}
	/**
	 * Usecase9
	 * Function displays the count of contacts in a particular city across the multiple address book
	 * @param city
	 */
	public static void countPersonByCity(String city) {
		long totalCount = 0;
		for(Map.Entry<String, AddressBook> entries : addressBookMap.entrySet()) {
			long count = entries.getValue().getAddressBook().stream().filter(p -> p.getCity().equals(city)).count();
			totalCount += count;
		}
		System.out.println(totalCount + " Contacts in " + city);
	}
	/**
	 * Function displays the count of contacts in a particular State across the multiple address book
	 * @param State
	 */
	public static void countPersonByState(String State) {
		long totalCount = 0;
		for(Map.Entry<String, AddressBook> entries : addressBookMap.entrySet()) {
			long count = entries.getValue().getAddressBook().stream().filter(p -> p.getCity().equals(State)).count();
			totalCount += count;
		}
		System.out.println(totalCount + " Contacts in " + State);
	}
	public static void viewContacts(Scanner input) {
		System.out.println("1.View Person By City\n2.View Person By State\n3.Count Person By City\n4.Count Person By State\5.View Contacts in City\n6.View Contacts in State");
		int option = input.nextInt();
		input.nextLine();
		switch(option) {
		case 1:
			System.out.println("Enter the city");
			String city = input.nextLine();
			viewPersonByCity(city);
			break;
		case 2:
			System.out.println("Enter the state");
			String state = input.nextLine();
			viewPersonByState(state);
			break;
		case 3: 
			System.out.println("Enter the city");
			String City = input.nextLine();
			countPersonByCity(City);
			break;
		case 4:
			System.out.println("Enter the state");
			String State = input.nextLine();
			viewPersonByState(State);
			break;
		case 5:
			System.out.println("Enter the city and the name");
			String Citie = input.nextLine();
			String name = input.next();
			input.nextLine();
			searchPersonByCity(name, Citie);
			break;
		case 6:
			System.out.println("Enter the city and the name");
			String States = input.nextLine();
			String names = input.next();
			input.nextLine();
			searchPersonByState(names, States);
			break;
		default:
			break;
		}
	}
	public static void main(String[] args) {
		ArrayList<AddressBook> addressbook = new ArrayList<>();
		System.out.println("Welcome to Address Book");
		createAddressBook();
		Scanner input = new Scanner(System.in);
		input.nextLine();
		System.out.println("Enter the State whose AddressBook you wish to access");
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
				String firstName = input.next();
				input.nextLine();
				System.out.println("Enter the last name");
				String lastName = input.next();
				input.nextLine();
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
		viewContacts(input);
		System.out.println("Thank You");
	}


}


