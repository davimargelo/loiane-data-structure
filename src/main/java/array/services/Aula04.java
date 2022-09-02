package array.services;

import array.data.Vetor;

public class Aula04 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.add("Element 1");
        vetor.add("Element 2");
        vetor.add("Element 3");

        System.out.println(vetor.getSize());
        System.out.println(vetor);
    }
}
