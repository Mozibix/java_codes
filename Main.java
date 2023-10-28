
//// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
//// then press Enter. You can now see whitespace characters in your code.
//public class Main {
//    public static void main(String[] args) {
//        // Press Alt+Enter with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//
////        System.out.printf("Hello and welcome!");
////printing hello world
//
//        System.out.println("Hello world is me again");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
//    }
//}

/*types
* byte
* short
* int
* long
*
* letters
* char
* string
*
* Decimal numbers
* float
* double
* */

import java.awt.*;
import java.text.NumberFormat;
import java.time.Year;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        byte age = 49;
//        age = 60;
//        byte herAge = 16;
//        byte myAge = herAge + 5;
        /*for a large numbers*/
//        long viewsCount = 3_123_456_789L;
//        float price = 20.88F;
//        /*single letter - single quote == char and double more letters double quotes == string */
//        char letter = 'a';
//        boolean isEligible = true;
//        Date now = new Date();
//
//        byte x = 1;
//        byte y = x;
//        x = 2;
//        System.out.println(y);
//        System.out.println(now);

//        Point point1 = new Point(x:1, y:2);
//    }
//}

//
//public class Main {
//    public  static void main(String[] args) {
//        int x = 1;
//        int y = 3;
//        Point point1 = new Point(x, y);
//        Point point2 = point1;
//        point1.x = 2;
//        System.out.println(point2);
//    }
//}

/*strings, escape sequence*/
//public  class Main {
//public static  void main(String[] args) {
//    String message = "Hello \"world\" this is a string" + "!!";
//    System.out.println(message.replace("!", "*"));
//}
//}

/*Arrays*/

//public class Main {
//    public static void main(String[] args) {
//       int[] numbers = {5, 1, 6, 2, 5, 4, 10, 2, 3};
//        System.out.println(numbers.length);
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//    }
//}

/*
constant pi == final
public  class Main {
    public static void main(String[] args) {
        final float pi = 3.14F;

        System.out.println(pi);

    }
}*/
/*
implicit casting
byte > short > int > long*/


//public class Main {
//    public  static void main(String[] args) {
////        NumberFormat percentInstance = NumberFormat.getPercentInstance();
////        String result = percentInstance.format(0.5);
////        System.out.println(result);
//        /*second way*/
//        String result  = NumberFormat.getPercentInstance().format(0.909);
//        System.out.println(result);
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name: ");
//        String name = scanner.nextLine().trim();
//        System.out.println("You are " + name);
//    }
//}

/* AHH GREET YOU BOSS TERMINAL JAVA APP */
public class Main {
    public static void main(String[] args) {
        /*scanner represent inputs just know */
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Ahh Greet You Boss \uD83D\uDE4C");

        System.out.print("which way nah ? ");
        String way = scanner.nextLine();


        System.out.print("oohhkk na " + way + "?, oyah nah ID your yourself ASAP:...");
        String userName = scanner.nextLine().toUpperCase();


        System.out.println("Ahh Greet you Boss "  + userName + " tap that guy wey dey wear eye-glass say my guy pablo dey greet am ooo \uD83D\uDE4C");

        System.out.println("Occupation: ");
        System.out.print("i dey ");
        String occupation = scanner.nextLine();


        System.out.print("Ahh Chairman " + userName + " so which year you start to dey " + occupation + "? ");
        int startYear =  scanner.nextInt();



        /* current time sha */
       Date now = new Date();
       now.getTime();

       /* get current year from here */
        int currentYear  = Year.now().getValue();

        int results = currentYear - startYear;

        /* omo print all the printables abeg */
        System.out.println("omo you get " + results + " year(s) of experience for the work ooo");
        System.out.println("no wahala, later we go talk more base on some kind individs and babyFemales \uD83E\uDD1D ");
        System.out.println("Current Time: " + now);
        System.out.println("#FirstJavaApp");

        /*testing commit on intellij ide*/
    }
}


