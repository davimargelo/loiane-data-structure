package array.services;

import array.data.Contact;
import array.data.ObjectVetor;

public class Aula10 {
    public static void main(String[] args) {
        ObjectVetor v = new ObjectVetor(3);

        Contact c1 = new Contact("João", "123231", "joao@gmail.com");
        Contact c2 = new Contact("Maria", "123231", "maria@gmail.com");
        Contact c3 = new Contact("Pedro", "123231", "pedro@gmail.com");

        Contact c4 = new Contact("João", "123231", "joao@gmail.com");

        v.add(3);
        v.add(4);
        v.add(5);
        v.add(c1);
        v.add(c2);
        v.add(c3);

        v.add("CACETAO");

        System.out.println("Length: " + v.getLength());

        System.out.println(v);

//        System.out.println("Search: " + v.search(3));

        System.out.println("Search: " + v.search(c4));

    }
}

