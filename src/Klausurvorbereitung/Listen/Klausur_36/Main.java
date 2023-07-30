package Klausurvorbereitung.Listen.Klausur_36;

public class Main {
        public static void main(String[] args) {
            // Create a new Liste
            Liste liste = new Liste();

            // Add some data to the list
            liste.add("Data1");
            liste.add("Data2");
            liste.add("Data1");

            // Copy the first element to the end of the list
            liste.kopieren();

            // Count how many times "Data1" is in the list
            int count = liste.zaehlen("Data1");
            System.out.println("'Data1' appears " + count + " times in the list.");

            // Count how many times "Data2" is in the list
            count = liste.zaehlen("Data2");
            System.out.println("'Data2' appears " + count + " times in the list.");

            // Count how many times "Data3" is in the list
            count = liste.zaehlen("Data3");
            System.out.println("'Data3' appears " + count + " times in the list.");
        }
    }
