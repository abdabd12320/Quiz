import java.util.*;
public class Main {
    public static void main(String[] args) {

        //Ex1: Write a Java program that accept three numbers from
        //the user and print the largest number.
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter number(1): ");
        int number1 = in.nextInt();
        System.out.print("Please enter number(2): ");
        int number2 = in.nextInt();
        System.out.print("Please enter number(3): ");
        int number3 = in.nextInt();

        if(number1 > number2 && number1 > number3)
        {
            System.out.println("The largest number = " + number1);
        } else if (number2 > number3) {
            System.out.println("The largest number = " + number2);
        }
        else System.out.println("The largest number = " + number3);

        System.out.println("-----------------------------");

        //Ex2: Write a Java program that accept a String and a number from
        //the user,then print the character in the given index.

        System.out.print("Please enter String: ");
        in.nextLine();
        String sentence = in.nextLine();
        System.out.print("Please enter number: ");
        int number = in.nextInt();

        System.out.println(sentence.charAt(number));

        System.out.println("-----------------------------");

        //Ex3: Write a program to enter the numbers till
        // the user wants and at the end it should display the sum entered

        int num = 0,sum = 0;
        do {
            sum += num;
            System.out.print("Enter input(stop if number = -1): ");
            num = in.nextInt();
        }while (num != -1);
        System.out.println("Sum = " + sum);

        System.out.println("-----------------------------");

        //Ex4: Write a Java program to find positive and negative numbers of a given array.

        int[] array = {10,-21,30,31,-25};
        for (int e: array)
        {
            if(e > 0)
                System.out.println(e + " is a positive number");
            else System.out.println(e + " is a negative number");
        }

        System.out.println("-----------------------------");

        //Ex5: Write a Java program to find a shortest word of a given array.

        String[] array_S = {"Tuwaiq","Bootcamp","Student","JAVA"};
        int n = array_S[0].length();
        int numb = 0;
        for (int i = 1; i < array_S.length; i++) {
            if(n > array_S[i].length())
            {
                n = array_S[i].length();
                numb = i;
            }
        }
        System.out.println(array_S[numb]);
    }
}