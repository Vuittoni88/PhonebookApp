package phonebook;

public class Person {
	private String firstName;
	private String lastName;
	private long phoneNumber;
	private Address address;
	private String middleName;
	private String fullName;
	public void addAddress(String streetAddress, String city, String state, int zipCode) {
		Address tempAddress = new Address(streetAddress, city, state, zipCode);
		this.address = tempAddress;
	}

	public Address getAddress() {
		return address;
	}

	public void printContactInfo() {
		if (middleName.length() != 0) {
			System.out.print(firstName + " " + middleName + " " + lastName + " ");
		} else {
			System.out.print(firstName + " " + lastName + " ");
		}
		address.printAddress();
		System.out.print(" " + phoneNumber);
		System.out.println();
	}

	public Person() {
	}

	public Person(String firstName, String middleName, String lastName, long phoneNumber) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;

	}

	public String getFullName() {
		return firstName + " " + middleName + " " + lastName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getMyCity() {
		return address.getCity();
	}

	public String getMyStreet() {
		return address.getStreetAddress();
	}

	public String getMyState() {
		return address.getState();
	}
//@Override
//public String toString() {
//	return "Person [firstName=" + firstName + ", lastName=" + lastName + ", fullName=" + fullName + ", phoneNumber="
//			+ phoneNumber + ", address=" + address + "]";
//}

}
