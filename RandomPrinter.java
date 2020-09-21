// I (Maxim Vancompernolle) worked on the homework assignment alone, using only course materials.
// import non-restricted classes needed for the assignment
import java.util.Random;

public class RandomPrinter {

    // main method that calls all methods and creates a Random object
    public static void main(String[] args) {
        Random randomizer = new Random();
        randomController(randomizer);
    }

    // definition of the powersOfTwo method
    public static void powersOfTwo() {
        System.out.println("Running the powersOfTwo method");

        // starts at base 1 and power 0 because any number to the power of 0 is 1
        int base = 1;
        int power = 0;

        while (base < 100) {
            System.out.println("    2 raised to the " + power + " is " + base);

            // the number 2 here can be substituted for any integer that you want the powers of
            //changing this value to 3 would give you the powers of three that are less than 100
            base *= 2;
            power++;
        }
    }

    // definition of the parameterPrinter method
    public static void parameterPrinter(int parameter) {
        System.out.println("Running the parameterPrinter method");

        // declares and instantiates a variable to the value passed in as parameter
        int value = parameter;
        System.out.println("    Method took the parameter " + value + ".");
    }

    // definition of the randomNumber method
    public static void randomNumber() {
        System.out.println("Running the randomNumber method");

        // creates a random number from 1 to 10 (inclusive) and casts it to an int type
        int x = (int) ((Math.random() * 10) + 1);
        System.out.println("    Your random number is " + x + ".");
    }

    // definition of the randomController method
    public static void randomController(Random rand) {
        System.out.println("Starting to call the methods!");

        // instantiate random numbers to call the methods
        int powersOfTwoCounter = (rand.nextInt(5) + 1);
        int parameterPrinterCounter = (rand.nextInt(4) + 6);
        int randomNumberCounter = (rand.nextInt(10) + 1);

        //run the methods a random number of times
        while (powersOfTwoCounter > 0) {
            powersOfTwo();
            powersOfTwoCounter--;
        }
        while (parameterPrinterCounter > 0) {
            parameterPrinter(parameterPrinterCounter);
            parameterPrinterCounter--;
        }
        while (randomNumberCounter > 0) {
            randomNumber();
            randomNumberCounter--;
        }
    }
}