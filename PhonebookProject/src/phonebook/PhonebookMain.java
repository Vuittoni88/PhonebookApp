package phonebook;

import java.util.*;

public class PhonebookMain {

	public static void main(String[] args) {

		Person p1 = new Person("Kevin", "Lonnell", "Boulware", 4047852145L);
		p1.addAddress("123 Main Lane", "Anytown", "KS", 74821);
		Person p2 = new Person("Lauren", "Paige", "Strudwick", 9542549822L);
		p2.addAddress("456 Niam Pike", "Anytown", "KS", 74821);
		Person p3 = new Person("Labcoat", "", "Maximus", 9548541458L);
		p3.addAddress("456 Niam Pike", "Anytown", "KS", 74821);
		Contacts c1 = new Contacts();
		c1.addPerson(p1);
		c1.addPerson(p2);
		c1.addPerson(p3);

		Scanner input = new Scanner(System.in);
		int choice = 0;
		while (choice != 11) {
			choice = phonebookMenu();
			switch (choice) {
			case 1:

				System.out.println("Please enter new listing under the example in the following format: ");
				System.out.println("Full name, Street address, City, State abbreviation, Zip code, Phone number");
				System.out.println("i.e: John Doe, 114 Market St, St Louis, MO, 63403, 6366435698");
				String newContactEntry = input.nextLine();
				String[] newContactArray = newContactEntry.split(", ");
				String fullName = newContactArray[0]; //
				String streetAddress = newContactArray[1]; //
				String city = newContactArray[2];
				String state = newContactArray[3];
				int zipCode = Integer.parseInt(newContactArray[4]);
				Long phoneNumber = Long.parseLong(newContactArray[5]);
				String[] nameSplit = fullName.split(" ");
				String firstName = nameSplit[0];
				String lastName = nameSplit[nameSplit.length - 1];
				String middleName = "";

				for (int i = 1; i < nameSplit.length - 1; i++) {
					middleName += nameSplit[i];
					if (i != nameSplit.length - 2) {
						middleName += " ";
					}

				}
				// firstName = firstName + " " + middleName;
				// firstName += " " + middleName;

				Person newPerson = new Person(firstName, middleName, lastName, phoneNumber);
				c1.addPerson(newPerson);
				newPerson.addAddress(streetAddress, city, state, zipCode);
				break;
			case 2:
				System.out.println("Enter the first name of the contact you would like to search:");
				String search = input.nextLine();
				System.out.println();
				c1.printContacts(c1.searchFirstName(search));
				break;
			case 3:
				System.out.println("Enter the last name of the contact you would like to search:");
				String search2 = input.nextLine();
				System.out.println();
				c1.printContacts(c1.searchLastName(search2));
				break;
			case 4:
				System.out.println("Enter the full name of the contact you would like to search:");
				String search3 = input.nextLine();
				System.out.println();
				c1.printContacts(c1.searchFullName(search3));
				break;
			case 5:
				System.out.println("Enter the phone number of the contact you would like to search:");
				long search4 = input.nextLong();
				System.out.println();
				c1.getByPhone(search4).printContactInfo();
				break;
			case 6:
				System.out.println("Enter the city of the contact you would like to search:");
				String search7 = input.nextLine();
				System.out.println();
				c1.printContacts(c1.searchCity(search7));
				break;
			case 7:
				System.out.println("Enter the state of the contact you would like to search:");
				String search5 = input.nextLine();
				System.out.println();
				c1.printContacts(c1.searchState(search5));
				break;
			case 8:
				System.out.println("Enter the phone number of the contact to be deleted:");
				long search6 = input.nextLong();
				c1.deleteContact(c1.getByPhone(search6));
				break;
			case 9:
				System.out.println("Enter the phone number of the contact to be updated");
				long searchNum = input.nextLong();
				int updateChoice = 0;
				while (updateChoice != 9) {
					updateChoice = updateMenu();
					switch (updateChoice) {
					case 1:
						System.out.println("Please enter a first name:");
						String newFirst = input.next();
						c1.getByPhone(searchNum).setFirstName(newFirst);
						break;
					case 2:
						System.out.println("Please enter a last name:");
						String newLast = input.next();
						c1.getByPhone(searchNum).setLastName(newLast);
						break;
					case 3:
						System.out.println("Please enter a full name:");
						String newFull = input.next();
						c1.getByPhone(searchNum).setFullName(newFull);
						break;
					case 4:
						System.out.println("Please enter a street address name:");
						String newStreet = input.next();
						c1.getByPhone(searchNum).getAddress().setStreetAddress(newStreet);
						break;
					case 5:
						System.out.println("Please enter a city:");
						String newCity = input.next();
						c1.getByPhone(searchNum).getAddress().setCity(newCity);
						break;
					case 6:
						System.out.println("Please enter a state:");
						String newState = input.next();
						c1.getByPhone(searchNum).getAddress().setState(newState);
						break;
					case 7:
						System.out.println("Please enter a zip code:");
						int newZip = input.nextInt();
						c1.getByPhone(searchNum).getAddress().setZipCode(newZip);
						break;
					case 8:
						System.out.println("Please enter phone number:");
						long newNum = input.nextLong();
						c1.getByPhone(searchNum).setPhoneNumber(newNum);
						break;
					case 9:
						break;
					}
				}
			case 10:
				c1.printContacts(c1.getContacts());

				break;
			case 11:
				System.out.println("Thanks for using Phonebook App");
				break;
			default:
				System.out.println("Please enter a number between 1 and 11");
			}

		}
	}

	public static int phonebookMenu() {
		Scanner input1 = new Scanner(System.in);
		int choice = 0;
		System.out.println("Welcome to Phonebook App");
		System.out.println("Phonebook Menu \nPlease choose from the following options: ");
		System.out.println("1. Create a new contact.");
		System.out.println("2. Search for an existing contact by first name.");
		System.out.println("3. Search for an existing contact by last name.");
		System.out.println("4. Search for an existing contact by full name.");
		System.out.println("5. Search for an existing contact by phone number.");
		System.out.println("6. Search for an existing contact by city.");
		System.out.println("7. Search for an existing contact by state.");
		System.out.println("8. Delete a contact.");
		System.out.println("9. Update a contact.");
		System.out.println("10. See contact list.");
		System.out.println("11. Exit.");
		System.out.println();
		choice = input1.nextInt();
		System.out.println();
		return choice;

	}

	public static int updateMenu() {
		// once
		Scanner input2 = new Scanner(System.in);
		int choice = 0;
		System.out.println("Update Menu \nPlease choose from the following options: ");
		System.out.println("1. Update first name");
		System.out.println("2. Update last name.");
		System.out.println("3. Update full name");
		System.out.println("4. Update street address");
		System.out.println("5. Update city.");
		System.out.println("6. Update state.");
		System.out.println("7. Update zip code.");
		System.out.println("8. Update phone number.");
		System.out.println("9. Return to main menu.");
		choice = input2.nextInt();
		System.out.println();
		return choice;
	}
}
