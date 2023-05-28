import java.util.Scanner;

public class Main {
    //Constants

    public static void main(String[] args) {

//Declarations
        Scanner input = new Scanner(System.in);
        int change;
        double rem1, rem2, rem3, rem4, rem5, quarter;
        double dimes, nickels, pennies;
        int halfdollar, quarter1, dimes1, nickels1, pennies1;

//Input

        System.out.println("Enter the amount of change");
        change = input.nextInt();

//Process

//halfdollar
        rem1 = (double) change / 50;
        halfdollar = (int) rem1;

//quarters
        rem2 = (double) change - (halfdollar * 50);
        quarter = rem2 / 25;
        quarter1 = (int) quarter;

//dimes
        rem3 = (double) rem2 - (quarter1 * 25);
        dimes = rem3 / 10;
        dimes1 = (int) dimes;


//nickels
        rem4 = (double) rem3 - (dimes1 * 10);
        nickels = rem4 / 5;
        nickels1 = (int) nickels;

//pennies
        rem5 = (double) rem4 - (nickels1 * 5);
        pennies = rem5 / 1;
        pennies1 = (int) pennies;


//Output

        System.out.println("The change you entered is " + change + ".");
        System.out.println("The number of half-dollars to be returned is " + halfdollar + ".");
        System.out.println("The number of quarters to be returned is " + quarter1 + ".");
        System.out.println("The number of dimes to be returned is " + dimes1 + ".");
        System.out.println("The number of nickels to be returned is " + nickels1 + ".");
        System.out.println("The number of pennies to be returned is " + pennies1 + ".");

    }
}