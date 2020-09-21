//I (Maxim Vancompernolle) worked on the homework assignment alone, using only course materials.
public class BirthdayCalculator {
    public static void main(String[] args) {
        //declare and instantiate all variables
        int birthMonth = 1;
        int birthDay = 23;
        int birthYear = 1996;
        int bdayCalculation = birthMonth;

        //calculate the birthday into one 6 digit number
        bdayCalculation += 18;
        bdayCalculation *= 25;
        bdayCalculation -= 333;
        bdayCalculation *= 8;
        bdayCalculation -= 554;
        bdayCalculation /= 2;
        bdayCalculation += birthDay;
        bdayCalculation *= 5;
        bdayCalculation += 692;
        bdayCalculation *= 20;
        bdayCalculation += (birthYear % 100);
        bdayCalculation -= 32940;

        //output the birthday in one printf statement
        System.out.printf("Birthday: %d.", bdayCalculation);
    }
}