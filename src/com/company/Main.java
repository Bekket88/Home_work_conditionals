package com.company;

public class Main {

    public static void main(String[] args) {
        // Задача 1
        int clientOS = 5;
        if (clientOS == 0) {
            System.out.println("Please follow the link to install our iOS app");
        }
        else if (clientOS == 1) {
            System.out.println("Please follow the link to install our Android app");
        }
        else {
            System.out.println("Please enter 0 or 1");
        }

        // Задача 2

        int clientOSTask2 = 0;
        int yearOfBuild = 2015;

        if (clientOSTask2 == 0) {
            if (yearOfBuild >= 2015) {
                System.out.println("Please install our new app for iOS");
            } else {
                System.out.println("Please install our Lite app for iOS");
            }
        }
        if (clientOSTask2 == 1) {
            if (yearOfBuild >= 2015) {
                System.out.println("Please install our new app for Android");
            }
            else {
                System.out.println("Please install our Lite app for Android");
            }
        }
        if (clientOSTask2 != 0 && clientOS != 1) {
            System.out.println("Please enter 0 or 1");
        }

        // Задача 3

        int year = 2021;

        if (year % 100 == 0 && year % 400 == 0)
            System.out.println("This is a leap year");

        else if (year % 4 == 0 && year % 100 > 0)
            System.out.println("This is a leap year");

        else if (year % 100 == 0)
            System.out.println("This is a common year");

        else
            System.out.println("This is a common year");

        // Задача 4

        int deliveryDistance = 1;

        if (deliveryDistance >= 0 && deliveryDistance < 20) {
            System.out.println("It will take 1 day to deliver your card");
        }
        else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("It will take 2 days to deliver your card");
        }
        else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("It will take 3 days to deliver your card");
        }
        else {
            System.out.println("Please visit our office");
        }

        //Задача 5

        int monthNumber = 12;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("It's winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It's spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It's summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("It's autumn");
                break;
            default:
                System.out.println("the month does not exist");
        }
    }
}
