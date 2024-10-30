import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Password_Generator {
    public static void main(String[] args) {

        String[] number = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] lowercaseLatinLetters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] uppercaseLatinLetters = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] specialСharacters = new String[]{" ", "!", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "@", "[", "]", "^", "_", "`", "{", "|", "}", "~"};

        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int passwordLenght = 0;
        /*
        try {
            System.out.print("Enter code length from 8 to 12: ");
            passwordLenght = in.nextInt();
        } catch (InputMismatchException e) {
            passwordLenght = 0;
        }

         */

        do {
            System.out.print("Enter code length from 8 to 12: ");
            passwordLenght = in.nextInt();
        } while (!(passwordLenght >= 8 && passwordLenght <= 12));

        String[] password = new String[passwordLenght];

        for (int i = 0; i < passwordLenght - 4; i++) {
            int characters = rand.nextInt(0, 4);
            if (characters == 0) {
                password[i] = number[rand.nextInt(0, number.length)];
            }
            if (characters == 1) {
                password[i] = lowercaseLatinLetters[rand.nextInt(0, lowercaseLatinLetters.length)];
            }
            if (characters == 2) {
                password[i] = uppercaseLatinLetters[rand.nextInt(0, uppercaseLatinLetters.length)];
            }
            if (characters == 3) {
                password[i] = specialСharacters[rand.nextInt(0, specialСharacters.length)];
            }
        }
        password[passwordLenght - 4] = number[rand.nextInt(0, number.length)];
        password[passwordLenght - 3] = lowercaseLatinLetters[rand.nextInt(0, lowercaseLatinLetters.length)];
        password[passwordLenght - 2] = uppercaseLatinLetters[rand.nextInt(0, uppercaseLatinLetters.length)];
        password[passwordLenght - 1] = specialСharacters[rand.nextInt(0, specialСharacters.length)];

        for (String str : password) {
            System.out.print(str);
        }

    }
}
