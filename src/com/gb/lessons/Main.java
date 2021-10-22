package com.gb.lessons;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //String[] arr = {"banana", "banana", "pear", "pineapple", "apple", "peach", "pear", "peach", "orange", "banana"};
        //findUniqWords(arr);

        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();

        telephoneDirectory.add("1234567890", "Zaharov");
        telephoneDirectory.add("7789432355", "Miami");
        telephoneDirectory.add("6654523455", "Mayhem");
        telephoneDirectory.add("41235613855", "Smith");
        telephoneDirectory.add("5675644561", "Zaharov");

        System.out.println(telephoneDirectory.get("Mayhem"));
    }

    public static void findUniqWords(String[] array) {
        ArrayList list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    count++;
                }
            }

            if (!list.contains(array[i])) {
                System.out.println(array[i] + ": " + count);
                list.add(array[i]);
            }

        }

        System.out.println("\nБез повторов: ");
        System.out.println(list);
    }
}
