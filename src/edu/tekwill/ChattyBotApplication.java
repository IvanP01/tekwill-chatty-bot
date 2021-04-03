package edu.tekwill;

import java.util.Scanner;

public class ChattyBotApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("\uD83D\uDC4B Hello there friend! \uD83D\uDC4B");
        System.out.println("\uD83E\uDD16 I'm named the chatty-Bot!");
        System.out.println("\uD83D\uDE0D I was created during the Java Fundamentals Course of March-June 2021." +
                " Born during the COVID pandemic! Can you believe that? \uD83D\uDE32\n");
        System.out.print("\uD83E\uDD14 So friend, can you remind me your name? \n>> ");
        String nameUser = scanner.nextLine();
        System.out.println("This is a wonderful name you have there, " + nameUser + "!\n");
        System.out.println("Believe it or not, but I can guess your age!");
        System.out.print("\uD83E\uDD14 Say me the reminders of diving your age by 3, 5 and 7: \n>> ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int userAge = (a * 70 + b * 21 + c * 15) % 105;
        System.out.println(nameUser + "! " + "Using magic I guess, your age is " + userAge + "!");
        System.out.println("\uD83D\uDE10 But I'm simple bot, and I might be wrong. \uD83D\uDE04\n");
        System.out.print("Tell me your real age, and let's see if my guess is right: \n>> ");
        int realUserAge = scanner.nextInt();

        realUserAge = getRealUserAge();
        if (realUserAge == userAge) {
            System.out.println("\uD83D\uDE04 Yaaay! In the end, I'm stil capable of doing something! \uD83D\uDE0D ");
        } else {
            System.out.println("\uD83D\uDE1E Ohh! Sorry " + nameUser + ", I'mstill learning. I hope you stil belive in magic!");
        }

        if (realUserAge < 0) {
            System.out.print("Heeeeeeey, somebody must be joking here. You can't be that young! Please\n" +
                    "try again! \n>>");
        } else if (realUserAge < 7) {
            System.out.println("Wow " + nameUser + "! " + "You are very young, just " + realUserAge + "years old\n" +
                    "and you're already running an app by yourself. That's sweet! Try and learn some programming,\n" +
                    "maybe you'll be the Iron Man of our century?");
        } else if (realUserAge < 15) {
            System.out.println("Hey " + nameUser + ", " + "you're just " + realUserAge + " years old, what a good \n" +
                    " age to gain some basic knowledge in programing!");
        } else if (realUserAge < 55) {
            System.out.println("Hey " + nameUser + ", " + "you're just " + realUserAge + " years old, what a good \n" +
                    " age to gain some basic knowledge in programing!");
        } else if (realUserAge < 120) {
            System.out.println("Oh my, " + nameUser + ", " + "you age is " + realUserAge + ". " + "You have many years\n" +
                    "ahead! It's never too late to learn programming!");
        } else if (realUserAge > 120) {
            System.out.println("Heeeeeeey, somebody must be joking here. You can't be that old! Please\n" +
                    "try again!");
        } else {
            System.out.print("Tell me your real age, and let's see if my guess is right: ");
            realUserAge = scanner.nextInt();
        }

        System.out.println("So," + nameUser + ", your age is " + realUserAge + ". That's the most perfect time to learn programing! \n");
        System.out.print("You know what else I can do? I can count to any number you want! Tell me whento stop: \n>> ");
        number = scanner.nextInt();

        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }


// To Do
      /*  System.out.println("\uD83D\uDC4B\" - waving hand\n" +
                "\uD83E\uDD16\" - robot\n" +
                "\uD83D\uDE32\" - astonished face\n" +
                "\uD83E\uDD14\" - thinking face\n" +
                "\uD83D\uDE04\" - smiling face\n" +
                "\uD83D\uDE10\" - serious face\n" +
                "\uD83D\uDE1E\" - disappointed face\n" +
                "\uD83D\uDE0D\" - heart eyes");*/
    }

    private static int getRealUserAge() {
        return 0;
    }
}
