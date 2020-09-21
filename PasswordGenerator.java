// I (Maxim Vancompernolle) worked on the homework assignment alone, using only course materials.
import java.util.Scanner;
public class PasswordGenerator {
    public static void main(String[] args) {
        // declare objects and assign a value to the password string
        String password = new String();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a phrase that will be converted to a password:");
        password = myScanner.nextLine();

        //edit the phrase into a password
        password = password.toUpperCase();
        password = password.replace('A', '@');
        password = password.replace('E', '#');
        password = password.replace('I', '!');
        password = password.replace('O', '0');
        password = password.replace('U', '&');

        // check and adjust password length if necessary, then display the password
        if ((password.length() >= 2) && (password.length() <= 5)) {
            password = password.concat(password);
            System.out.printf(
                    "Your password could be guessed so the length was adjusted! Your new password is %s.", password);
        } else if (password.length() >= 6) {
            System.out.printf("Your password is the perfect length! Your password is %s", password);
        } else if (password.length() <= 1) {
            System.out.printf("This password will not work. You should try again!");
        }
    }
}