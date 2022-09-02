package array.services;

import array.data.Vetor;

public class Aula09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.add("B");
        vetor.add("G");
        vetor.add("D");
        vetor.add("E");
        vetor.add("F");

        vetor.remove(1);

        System.out.println(vetor);

        System.out.println("Remove element E");

        vetor.remove(vetor.search("E"));

        System.out.println(vetor);

        System.out.println("Remove element A");

        vetor.remove(vetor.search("A")); // nao tem elemento A
    }
}
