package org.example;

import java.util.Arrays;
import java.util.List;

public class Generics {

    public static void main(String[] args) throws Exception {
        // apelez metodele ...
//        Integer[] inputArray = {8, 11, 4, 9}; // schimb primele 2 pozitii: 0 cu 1 {8, 11}. Asa declar un Array de Integers, Vectorii.
//        printArray(inputArray, 0, 1);
//        System.out.println(checkPrime(11));
        List<Integer> array = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9); // aici poate primi chiar si Strings, Int, Char, etc.
        System.out.println(primeNumbersFromList(array));
        int i = 5;
    }

    public static <T> void printArray(T[] inputArray, int a, int b) { // aici primesc pozitiile intre care tre' sa fac switch.
        T aux; // o sa am un array si interschimb elements de pe pozitiile respective cu AUX.
        // aux stocheaza valoarea de la pozitia a. inputArray[a]
        aux = inputArray[a]; // fac schimb intre valorile de la pozitiile a si b.
        inputArray[a] = inputArray[b];
        inputArray[b] = aux;

        for (T type : inputArray) {
            System.out.println(type);
        }
    }

    public static boolean checkPrime(int n) { // 5
        for (int i = 2; i < n / 2; i++) {
            if (n % i != 0) {
                return true;
            }
        }
        return false;
    }

    public static <E> int primeNumbersFromList(List<E> arrayList) {
        int count = 0;

        try { // pt exceptii
            for (E element : arrayList) { // Generic Method
                if (checkPrime((Integer) element)) {
                    count++;
                }
                if ((Integer) element == 2) {
                    count++;
                }
            }
            System.out.println("Print the Number of Prime Numbers from a list, counted with Generic Method:");
            return count;
        } catch (Exception e) {
            System.out.println("The input is incorrect.");
        }
        return count;
    }
}


/*
Write a generic method to exchange the positions of two different elements in an array.

Write a generic method to count the number of prime numbers from a list. // ? metoda apelata cu integers

 */
