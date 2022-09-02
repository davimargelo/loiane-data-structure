package array.labs;

import com.github.javafaker.Faker;
import array.data.Contact;

import java.util.ArrayList;
import java.util.Scanner;

public class VetorEx7Impl extends VetorEx6Impl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contact> list = new ArrayList<>(20);
        createContacts(5, list);
        obtainMenu(scanner, option -> {
            System.out.println("You've chosen option " + option);
            switch (option) {
                case 1: // adding new contact
                    Contact contact = buildContact(scanner);
                    list.add(contact);
                    System.out.println("Contact added successfully");
                    break;
                case 2: // adding new contact at a given position
                    Contact contact2 = buildContact(scanner);
                    if (list.size() > 0) {
                        int position = obtainPosition(scanner, list);
                        list.add(position, contact2);
                    } else {
                        System.out.println("List is empty");
                        list.add(contact2);
                    }
                    System.out.println("Contact added successfully");
                    break;
                case 3: // Get contact at a given position
                    int position1 = obtainPosition(scanner, list);
                    System.out.println(list.get(position1));
                    break;
                case 4: // Get contact
                    Contact contact3 = buildContact(scanner);
                    System.out.println(list.indexOf(contact3));
                    break;
                case 5: // Get last index at given contact
                    Contact contact4 = buildContact(scanner);
                    System.out.println(list.lastIndexOf(contact4));
                    break;
                case 6: // Verify if contact exists
                    Contact contact5 = buildContact(scanner);
                    System.out.println(list.contains(contact5));
                    break;
                case 7: // Remove contact at a given position
                    int position2 = obtainPosition(scanner, list);
                    list.remove(position2);
                    System.out.println("Contact removed successfully");
                    break;
                case 8: // Remove contact
                    Contact contact6 = buildContact(scanner);
                    list.remove(contact6);
                    System.out.println("Contact removed successfully");
                    break;
                case 9: // Get size
                    System.out.println(list.size());
                    break;
                case 10: // Clear list
                    list.clear();
                    System.out.println("List cleared successfully");
                    break;
                case 11: // Print list
                    list.forEach(System.out::println);
                    break;
            }
        });
    }

    private static int obtainPosition(Scanner scanner, ArrayList<Contact> list) {
        System.out.println("Enter the position number: ");
        try {
            int position = Integer.parseInt(scanner.nextLine());
            if (!(position >= 0 && position < list.size()))
                throw new IllegalArgumentException("Invalid position");
            return position;
        } catch (Exception e) {
            System.out.println("Invalid position");
            return obtainPosition(scanner, list);
        }
    }

    private static void createContacts(int quantity, ArrayList<Contact> list) {
        Faker faker = new Faker();
        for (int i = 0; i < quantity; i++) {
            String name = faker.name().name();
            list.add(new Contact(name, faker.number().digits(10), name.toLowerCase().replaceAll("\\.", "").replaceAll(" ", ".") + "@br.domain.com"));
//            log.info("Contact {} created", name);
        }
    }
}
