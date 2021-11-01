package phonebook;

public class Contacts {
	// Create array of People
	Person[] contact = new Person[0];

	public void addPerson(Person newPerson) {
		// Create new array, one larger that current array
		Person[] temp = new Person[contact.length + 1];
		for (int i = 0; i < contact.length; i++) {
			temp[i] = contact[i];
		}
		// add new person to the end of the temporary array
		temp[temp.length - 1] = newPerson;
		// reassign current array to new array
		contact = temp;
	}

	public Person[] getContacts() {
		return contact;
	}

	public void printContacts(Person[] searched) {
		String[] str = new String[searched.length];
		for (int i = 0; i < searched.length; i++) {
			str[i] = searched[i].getFirstName();
		}
		String temp;
//		System.out.println("Strings in sorted order:");
		for (int j = 0; j < str.length; j++) {
			for (int i = j + 1; i < str.length; i++) {
				// comparing adjacent strings
				if (str[i].compareTo(str[j]) < 0) {
					temp = str[j];
					str[j] = str[i];
					str[i] = temp;
				}
			}
//		   System.out.println(str[j]);
		}
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < contact.length; j++) {
				if (str[i] == contact[j].getFirstName()) {
					contact[j].printContactInfo();
				}
			}
		}
	}

	public Person[] searchFirstName(String searchFirst) {
		// Counting instances found of first name in contacts AND display an array of
		// just the found first names
		int count = 0;
		// for loop to find the number of people with the searched first name for the
		// new array
		for (int i = 0; i < contact.length; i++) {
			if (contact[i].getFirstName().equals(searchFirst)) {
				count++;
			}
		}
		// Create a new array of persons with the size of count
		Person[] temp = new Person[count];
		int x = 0;
		// makes sure that our array has space for all instances of the first name found
		for (int i = 0; i < contact.length; i++) {
			if (contact[i].getFirstName().equals(searchFirst)) {
				temp[x] = contact[i];
				x++;
			}
		}
		return temp;
	}

	public Person[] searchLastName(String searchLast) {
		// Counting instances found of first name in contacts AND display an array of
		// just the found first names
		int count = 0;
		// for loop to find the number of people with the searched first name for the
		// new array
		for (int i = 0; i < contact.length; i++) {
			if (contact[i].getLastName().equals(searchLast)) {
				count++;
			}
		}
		// Create a new array of persons with the size of count
		Person[] temp = new Person[count];
		int x = 0;
		// makes sure that our array has space for all instances of the first name found
		for (int i = 0; i < contact.length; i++) {
			if (contact[i].getLastName().equals(searchLast)) {
				temp[x] = contact[i];
				x++;
			}
		}
		return temp;
	}

	public Person[] searchFullName(String searchFull) {
		// Counting instances found of first name in contacts AND display an array of
		// just the found first names
		int count = 0;
		// for loop to find the number of people with the searched first name for the
		// new array
		for (int i = 0; i < contact.length; i++) {
			if (contact[i].getFullName().equals(searchFull)) {
				count++;
			}
		}
		// Create a new array of persons with the size of count
		Person[] temp = new Person[count];
		int x = 0;
		// makes sure that our array has space for all instances of the first name found
		for (int i = 0; i < contact.length; i++) {
			if (contact[i].getFullName().equals(searchFull)) {
				temp[x] = contact[i];
				x++;
			}
		}
		return temp;
	}

	public Person[] searchAddress(String searchStreet) {
		// Counting instances found of first name in contacts AND display an array of
		// just the found first names
		int count = 0;
		// for loop to find the number of people with the searched first name for the
		// new array
		for (int i = 0; i < contact.length; i++) {
			if (contact[i].getAddress().equals(searchStreet)) {
				count++;
			}
		}
		// Create a new array of persons with the size of count
		Person[] temp = new Person[count];
		int x = 0;
		// makes sure that our array has space for all instances of the first name found
		for (int i = 0; i < contact.length; i++) {
			if (contact[i].getFirstName().equals(searchStreet)) {
				temp[x] = contact[i];
				x++;
			}
		}
		return temp;
	}

	public Person[] searchCity(String searchC) {
		// Counting instances found of first name in contacts AND display an array of
		// just the found first names
		int count = 0;
		// for loop to find the number of people with the searched first name for the
		// new array
		for (int i = 0; i < contact.length; i++) {
			if (contact[i].getMyCity().equals(searchC)) {
				count++;
			}
		}
		// Create a new array of persons with the size of count
		Person[] temp = new Person[count];
		int x = 0;
		// makes sure that our array has space for all instances of the first name found
		for (int i = 0; i < contact.length; i++) {
			if (contact[i].getMyCity().equals(searchC)) {
				temp[x] = contact[i];
				x++;
			}
		}
		return temp;
	}

	public Person[] searchState(String searchS) {
		// Counting instances found of first name in contacts AND display an array of
		// just the found first names
		int count = 0;
		// for loop to find the number of people with the searched first name for the
		// new array
		for (int i = 0; i < contact.length; i++) {
			if (contact[i].getMyState().equals(searchS)) {
				count++;
			}
		}
		// Create a new array of persons with the size of count
		Person[] temp = new Person[count];
		int x = 0;
		// makes sure that our array has space for all instances of the first name found
		for (int i = 0; i < contact.length; i++) {
			if (contact[i].getMyState().equals(searchS)) {
				temp[x] = contact[i];
				x++;
			}
		}
		return temp;
	}

//	public Person[] searchFirstName(int searchZip) {
//		// Counting instances found of first name in contacts AND display an array of
//		// just the found first names
//		int count = 0;
//		// for loop to find the number of people with the searched first name for the
//		// new array
//		for (int i = 0; i < contact.length; i++) {
//			if (contact[i].getFirstName().equals(searchZip)) {
//				count++;
//			}
//		}
//		// Create a new array of persons with the size of count
//		Person[] temp = new Person[count];
//		int x = 0;
//		// makes sure that our array has space for all instances of the first name found
//		for (int i = 0; i < contact.length; i++) {
//			if (contact[i].getFirstName().equals(searchZip)) {
//				temp[x] = contact[i];
//				x++;
//			}
//		}
//		return temp;
//	}
	public Person getByPhone(long phoneNumber) {
		// Bring up a contact by phone number
		int count = 0;
		// for loop to find the specific phone number we want to update in our original
		// array
		for (int i = 0; i < contact.length; i++) {
			if (contact[i].getPhoneNumber() == phoneNumber) {
				count = i;
				break;
			}

		}
		return contact[count];
	}
	public void deleteContact(Person deletee) {
		Person[] temp = new Person[contact.length-1];
		int y = 0;
		for (int i = 0; i < contact.length; i++) {
			if (contact[i] != deletee) {
				temp[y] = contact[i];
				y++;
			}
		}
		contact = temp;
	}
}
