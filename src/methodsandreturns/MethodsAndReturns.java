/*
 * Evan Robertson
 * November 14th 2018
 * 
 */

package methodsandreturns;
import java.util.Scanner;

/**
 * 
 * @author evrob0095
 */
public class MethodsAndReturns {
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;
        
        System.out.println("Enter a number to choose an option");
        System.out.println("1. String Methods");
        System.out.println("2. Math Methods");
        
        userInput = input.nextInt();
        
        if (userInput == 1) {
            stringMenu(input);
        }
        else if (userInput == 2) {
            mathMenu(input);
        }
        else {
            System.out.println("Enter a valid number");
        }
    }
    
    public static void stringMenu(Scanner input) {
        int userInput;
        String userInputString;
        String userInputString2;
        
        System.out.println("Enter a number to choose an option");
        System.out.println("1. Turn a string to all upper case");
        System.out.println("2. Turn a string to all lower case");
        System.out.println("3. Returns the character of a string. given the index");
        System.out.println("4. Compare two strings");
        System.out.println("5. Check if a string ends with the given character");
        
        userInput = input.nextInt();
        userInputString = input.nextLine();
        switch (userInput) {
            case 1:
                System.out.println("Enter a string");
                userInputString = input.nextLine();
                System.out.println(upperCase(userInputString));
                break;
            case 2:
                System.out.println("Enter a string");
                userInputString = input.nextLine();
                System.out.println(lowerCase(userInputString));
                break;
            case 3:
                System.out.println("Enter a string");
                userInputString = input.nextLine();
                System.out.println("Enter a number less than the amount of characters in the string");
                userInput = input.nextInt();
                System.out.println(charAt(userInputString, userInput));
                break;
            case 4:
                System.out.println("Enter a string");
                userInputString = input.nextLine();
                System.out.println("Enter another String");
                userInputString2 = input.nextLine();
                System.out.println(compare(userInputString, userInputString2));
                break;
            default:
                System.out.println("Enter a String");
                userInputString = input.nextLine();
                System.out.println("Enter a Letter");
                userInputString2 = input.nextLine();
                System.out.println(endsWith(userInputString, userInputString2));
                break;
        }
    }
    /**
     * Menu for math methods
     * @param input 
     */
    public static void mathMenu(Scanner input) {
       int userInput1;
       double userInput2;
       
       
        System.out.println("Enter a number to choose an option");
        System.out.println("1. Square Root");
        System.out.println("2. Powers");
        System.out.println("3. Give Aboslute Value");
        System.out.println("4. Round to nearest whole");
        System.out.println("5. Find average");
        
        userInput1 = input.nextInt();
        
        switch (userInput1) {
            case 1:
                System.out.println("Enter a number");
                userInput2 = input.nextDouble();
                System.out.println("The square root is " + sqrt(userInput2));
                break;
            case 2:
                System.out.println("Enter a base");
                userInput1 = input.nextInt();
                System.out.println("Enter an exponent");
                userInput2 = input.nextInt();
                System.out.println("The answer is " + power(userInput1, userInput2));
                break;
            case 3:
                System.out.println("Enter a negative value");
                userInput2 = input.nextDouble();
                System.out.println("The absolute value is " + absolute(userInput2));
                break;
            case 4:
                System.out.println("Enter a decimal number");
                userInput2 = input.nextDouble();
                System.out.println("The decimal number rounded to the nearest whole is " + round(userInput2));
                break;
            default:
                System.out.println("Enter a number");
                userInput1 = input.nextInt();
                System.out.println("Enter another number");
                userInput2 = input.nextInt();
                System.out.println("The average is " + average(userInput1, userInput2));
        }
    }
    
    /**
     * sqrt finds that square root of a number
     * @param num
     * @return 
     */
    public static double sqrt(double num) {
        return(Math.sqrt(num));
    }
    
    /**
     * power multiplies the base by itself, exponent number of times
     * @param num1
     * @param num2
     * @return 
     */
    public static double power(int num1, double num2) {
        return(Math.pow(num1, num2));
    }
    
    /**
     * Finds absolute value
     * @param num
     * @return 
     */
    public static double absolute(double num) {
        return(Math.abs(num));
    }
    
    /**
     * Rounds to nearest whole
     * @param num
     * @return 
     */
    public static double round(double num) {
        return(Math.round(num));
    }
    
    /**
     * Find average of two numbers
     * @param num1
     * @param num2
     * @return 
     */
    public static double average(int num1, double num2) {
        return((num1 + num2) / 2);
    }
    /**
     * upperCase changes all the letters in the string to upper case
     * @param upper
     * @return 
     */
    public static String upperCase(String upper) {
        upper = upper.toUpperCase();
        return(upper);
    }
    
    /**
     * lowerCase changes all the letters in the string to lower case
     * @param lower
     * @return 
     */
    public static String lowerCase(String lower) {
        lower = lower.toLowerCase();
        return(lower);
    }
    
    /**
     * charAt finds the character at the given integer value
     * @param word
     * @param num
     * @return 
     */
    public static char charAt(String word, int num) {
        num = num - 1;
        return(word.charAt(num));
    }
    
    /**
     * compare compares two strings and outputs a message
     * @param word1
     * @param word2
     * @return 
     */
    public static String compare(String word1, String word2) {
        if (word1.equalsIgnoreCase(word2)) {
            return("The strings are the same");
        }
        else {
            return("The strings are not the same");
        }
    }
    
    /**
     * endsWith checks if the given string ends with the given letter
     * @param word1
     * @param word2
     * @return 
     */
    public static String endsWith(String word1, String word2) {
        if (word1.endsWith(word2)) {
            return("The string ends with the letter");
        }
        else {
            return("The string does not end with the letter");
        }
    }
    
}
