`//public class Main {
//    public static void main(String[] args) {
//        byte myAge = 18;
//        byte yourAge = 100;
//
//        if (myAge < yourAge){
//            System.out.println("I am younger than you");
//        }
//
//    }

import java.util.Scanner;

  public class DailyActivity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello! Please enter your age here: ");

        int age = scanner.nextInt();
        String activity = determineActivity(age);

        System.out.println("According to your age, your daily activity is: " + activity);

        scanner.close();
    }

    public static String determineActivity(int age) {
        if (age < 6) {
            System.out.println("Home, walk, and kindergarten.");
        } else if (age >  6 && age <= 17) {
            System.out.println(("School.");
        } else if (age >= 18 && age <= 22) {
            System.out.println("University.");
        } else if (age > 23 && age <= 60) {
            System.out.println("Work.");
        } else {
            System.out.println ("Retired.");
        }
    }
}

public class BookRecommendation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello!");
        System.out.print("Tell me your name ");
        String name = scanner.nextLine();

        System.out.print("Hi, " + name + "! How old are you? ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("What is your favorite book genre? ");
        String genre = scanner.nextLine();

        System.out.println("Great! Let me recommend a book for you.");

        // Apply book recommendations based on age and genre
        if (age >= 13 && age <= 16) {
            if (genre.equals("detective")) {
                System.out.println("Read Sherlock Holmes");
            }
        } else if (age >= 17 && age <= 25) {
            if (genre.equals("non-fiction")) {
                System.out.println("Read Party Lines");
            }
        } else {
            System.out.println("Sorry, we don't have recommendations for your age group.");
        }

        System.out.println("Enjoy your reading!!!");


    }

}








`