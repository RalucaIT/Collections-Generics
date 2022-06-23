package org.example;

import java.util.*;

class CollectionsHomework {

    public static void main(String[] args) {

/*
● 1) Make a List, populate it with numbers from 1 to 10 and then iterate through them and print only even numbers;
 */
        List<Integer> intList = new ArrayList<>();
        for (int i = 1; i <= 10; ++i) {
            intList.add(i);
        }
        System.out.println("\nPrint only even numbers:");
        for (Integer i : intList) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        /*
● 2) Make a Set, add to it the same string three times. Iterate through the set
and print all the elements. What do you notice?
*/
        Set<String> setString = new HashSet<>(); // declarat. NU contine / accepta DUPLICATE
        setString.add("coffee");
        setString.add("coffee");
        setString.add("coffee");
        System.out.println("Print all the 3 elements:");
        for (String s : setString) {
            System.out.println(s);
        }
        System.out.println();

 /*
● 3) Make a Map with String keys and Integer values. Iterate through it and
print only the keys that have a value greater than 10.
  */
        Map<String, Integer> coffee = new HashMap<>(); // coffee = map
        coffee.put("capuccino", 60);
        coffee.put("espresso", 0);
        coffee.put("latte macchiato", 90);
        coffee.put("americano", 10);
        coffee.put("special", 11);
        System.out.println("Print only the keys that have a value greater than 10:");
        for (Map.Entry<String, Integer> s : coffee.entrySet()) { // coffee = map
            // System.out.println(s.getKey() + " " + s.getValue());
            if (s.getValue() > 10) {
                System.out.println(s.getKey());
            }
        }
        System.out.println();


        /* ● 4) Make a List, populate it with the following numbers: 7, 4, 5, 2, 1, 2, 4, 1.

● 4.1) Eliminate all duplicates and print the list. // sout = 1 2 4 5 7.

● 4.2) Sort the numbers from high to low in the list and print it. // sout = 7 5 4 2 1.

● 4.3) Create a Set of Strings from the sorted list and print it. // sout =

● 4.4) Create a Map having the resulted set as the keySet and the list as values for each key. // sout = 1=7  2=5  4=4  5=2  7=1.
         */

        List<Integer> entireNumbersList = Arrays.asList(7, 4, 5, 2, 1, 2, 4, 1); // asa adaugam elemente in Array direct din declaratie
        System.out.println("Print The Entire Numbers' List:");
        for (Integer everyNumberOfTheList : entireNumbersList) {
            System.out.println(everyNumberOfTheList);
        }
        System.out.println();


        HashSet<Integer> setWithoutDuplicates = new HashSet<>(entireNumbersList); //  din lista de Arrays (entireNumbersList) imi creeaza un HashSet => si cum NU accepta duplicate, le elimina.
        List<Integer> listWithoutDuplicates = new ArrayList<>(setWithoutDuplicates);
        System.out.println("Print The Numbers' List Without Duplicates:");
        for (Integer listWithoutDuplicate : listWithoutDuplicates) {
            System.out.println(listWithoutDuplicate);
        }
        // transform lista in HashSet si asta elimina automat duplicates.
        System.out.println();


        Collections.sort(listWithoutDuplicates, Collections.reverseOrder());
        System.out.println("Print The Numbers' List in a Descending Order:");
        for (Integer elemFromHighToLow : listWithoutDuplicates) { // item-ul / elem din lista care le cauta si afiseaza
            System.out.println(elemFromHighToLow);
        }
        // Create a Set of Strings from the sorted list; convert / cast la fiecare elem din lista la String si-l adaugam (cu. add) intr-un HashSet de String-uri
// ● 4.3)  Create a Set of Strings from the sorted list and print it.
        // elem. vreau sa le adaug intr-o lista de string-uri, ele fiind initial integers.
        System.out.println();


        Set<String> setOfStrings = new HashSet<>(); // declar un set de tip String
        for (Integer element : listWithoutDuplicates) {
            // setOfStrings.add(Integer.toString(element)) // la setul de string-uri ADAUG elementul convertit in String.

            //String element_convertit_de_la_integer_to_string = Integer.toString(element); // var declarata ca sa fac conversia de la int la string
            // aici am stocat valoarea conversiei elementului de la integer la string.

            setOfStrings.add(Integer.toString(element)); //adaug elementul convertit la (lista de tip) set de String-uri
            // aici, la randurile 103-106, explicatie  alternativa pt setOfStrings, rand 99.
        }
        System.out.println("Print a Created Set of Strings from the sorted list:");
        for (String element2 : setOfStrings)
            System.out.println(element2);
        System.out.println();

// ● 4.4) Create a Map having the resulted set as the keySet and the list as values for each key.
// s = eachElementOfTheSetOfStrings
// i = elementsOfListWithoutDuplicates

        Map<String, Integer> myMap = new HashMap<>();
        int elementsOfListWithoutDuplicates = 0;
        for (String eachElementOfTheSetOfStrings : setOfStrings) {
            myMap.put(eachElementOfTheSetOfStrings, listWithoutDuplicates.get(elementsOfListWithoutDuplicates));
            ++elementsOfListWithoutDuplicates;
        }

        System.out.println("Printed Map as having the resulted set as the keySet and the list as the values for each key:");
        for (Map.Entry<String, Integer> mapPairsOfElements : myMap.entrySet()) {
            System.out.println(mapPairsOfElements);
        }
// mapElement = mapPairsOfElements
    }
}
