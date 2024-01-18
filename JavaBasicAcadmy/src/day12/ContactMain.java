package day12;

import java.util.ArrayList;

public class ContactMain {

	public static void main(String[] args) {

		Contact contact1 = new Contact();
//		contact1.name = "Mage";
//		contact1.age = 248;
//		contact1.tel = "010-7979-4452";

		Contact contact2 = new Contact("Dwarf", 82, "070-5252-3232");
		Contact contact3 = new Contact("Doctor", 160, "070-5267-3232");
		Contact contact4 = new Contact("Archer", 27, "070-5272-3832");
		
		
		ArrayList<Contact> contacts = new ArrayList<>();
		contacts.add(contact1);
		contacts.add(contact2);
		contacts.add(contact3);
		contacts.add(contact4);
		
//		contacts.get(i).getName();
//		System.out.println(contacts.get(1).getName());

		for (Contact i : contacts) {
			i.showContacts();
		}

	}

}
