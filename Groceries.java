//I (Maxim Vancompernolle) worked on the homework assignment alone, using only course materials.
public class Groceries {
    public static void main(String[] args) {
        //declare and instantiate all variables
        String name = "Brad";
        int cash = 50;
        double taxRate = 0.1;
        double subTotal = 42.3;

        //calculate the change left after taxes
        double change = cash - ((subTotal * taxRate) + subTotal);

        //output the data in one printf statement
        System.out.printf("%s has $%3.2f dollars remaining!%n%n%s started with $%d dollars!", name, change, name, cash);
    }
}