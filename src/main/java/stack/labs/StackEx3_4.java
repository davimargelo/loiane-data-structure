package stack.labs;

import stack.data.Book;

import java.util.Stack;

public class StackEx3_4 {
    public static void main(String[] args) {
        Stack<Book> bookStack = new Stack<>();

        bookStack.push(new Book("The Hobbit", "123456789", 1937, "J.R.R. Tolkien"));
        bookStack.push(new Book("The Fellowship of the Ring", "123456789", 1954, "J.R.R. Tolkien"));
        bookStack.push(new Book("The Two Towers", "123456789", 1954, "J.R.R. Tolkien"));
        bookStack.push(new Book("The Return of the King", "123456789", 1955, "J.R.R. Tolkien"));
        bookStack.push(new Book("The Silmarillion", "123456789", 1977, "J.R.R. Tolkien"));
        bookStack.push(new Book("Game of Thrones", "123456789", 1996, "George R.R. Martin"));

        System.out.println("\nPrinting stack content:");
        bookStack.forEach(System.out::println);

        System.out.println("\nRemoving the last element from the stack:" + bookStack.pop());

        System.out.println("\nPrinting top content:" + bookStack.peek());

        System.out.println("\nSearching for the book with the title 'The Hobbit': " + bookStack.search(new Book("The Hobbit")));

        System.out.println("\nRemoving each stack content:");
        while (!bookStack.isEmpty()) {
            System.out.println("Popping element: " + bookStack.pop());
        }
    }
}
