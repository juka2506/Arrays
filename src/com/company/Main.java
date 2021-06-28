package com.company;

public class Main {

    public static void main(String[] args) {
        int[] ages = {12, 15, 18, 19};
        //System.out.println(ages.length);
        //System.out.println(ages[3]);

        double average = 0;
        double sum = 0;

        for (int i = 0; i < ages.length; i++) {
            sum = sum + ages[i];
        }
        average = sum / ages.length;
        //System.out.println(average);
        
        String[] names = new String[4];
        names[0] = "Anne";
        names[1] = "Lana";
        names[2] = "Paris";
        names[3] = "Jane";
        //System.out.println(names[0]);

        String bunchOfNames = ""; // not the same as " "
        for (int i = 0; i < names.length; i++) {
            bunchOfNames += names[i] + " "; // bunchOfName = bunchOfNames + name[i]
        }
        //System.out.println(bunchOfNames);

        // [13, 45, 26, 22, 19, 24, 20, 30, 90, 12]
        int[] numbers = {13, 45, 26, 22, 19, 24, 20, 30, 90, 12};
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                System.out.println("Even number: " + numbers[i]);
            }
        }
    }
}
