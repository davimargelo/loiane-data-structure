package array.labs;

//https://www.slideshare.net/loianeg/exercicios-vetores-arrays-estruturas-de-dados-e-algoritmos-com-java

import array.data.ArrayList;

public class VetorEx1Impl {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(5);

        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list.contains("A"));
        System.out.println(list.contains("B"));
        System.out.println(list.contains("E"));
    }
}
