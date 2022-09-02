package array.labs;

import com.github.javafaker.Faker;
import array.data.Contact;
import array.data.ArrayList;
import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;
import java.util.function.Consumer;

@Slf4j
public class VetorEx6Impl {
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
                    if (list.getSize() > 0) {
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
                    System.out.println(list.search(contact3));
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
                    System.out.println(list.getSize());
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
            if (!(position >= 0 && position < list.getSize()))
                throw new IllegalArgumentException("Invalid position");
            return position;
        } catch (Exception e) {
            System.out.println("Invalid position");
            return obtainPosition(scanner, list);
        }
    }

    protected static Contact buildContact(Scanner scanner) {
        Contact contact = new Contact();
        System.out.println("Adding new contact, please enter the information:");
        System.out.println("Name:");
        contact.setName(scanner.nextLine());
        System.out.println("Phone:");
        contact.setPhone(scanner.nextLine());
        System.out.println("Email:");
        contact.setEmail(scanner.nextLine());
        return contact;
    }

    protected static void obtainMenu(Scanner scanner, Consumer<Integer> consumer) {

        System.out.println("Choose an option: ");

        System.out.println("1 - Add contact at the end");
        System.out.println("2 - Add contact at the index");
        System.out.println("3 - Get contact by index");
        System.out.println("4 - Get contact");
        System.out.println("5 - Get last index for contact");
        System.out.println("6 - Verify if contact exists");
        System.out.println("7 - Remove contact by index");
        System.out.println("8 - Remove contact");
        System.out.println("9 - Get size");
        System.out.println("10 - Clear list");
        System.out.println("11 - Print list");

        System.out.println("0 - Exit");

        try {
            int option = Integer.parseInt(scanner.nextLine());
            if (option < 0 || option > 11) {
                System.out.println("Invalid option - choose from 0 to 11\n");
                obtainMenu(scanner, consumer);
                return;
            }
            consumer.accept(option);
            if (option != 0)
                obtainMenu(scanner, consumer);

        } catch (Exception e) {
            System.out.println("Invalid option - Not a number\n");
            obtainMenu(scanner, consumer);
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
