import java.util.Scanner;

public class Gallows {
    public static void main(String[] args) {

        String[] arrStrs = new String[]{"поезд","объезд","ведёрко","юбилярша","чальмугра","магналит",
                "самоблокировка","факторгруппа","жандармерия","лакримоцит"};
        int countLife = 10;

        int x = (int)Math.floor(Math.random() * arrStrs.length);

        String[] arrStrQuestion = new String[arrStrs[x].length()];
        String[] arrStrAnswer = new String[arrStrs[x].length()];

        for (int i = 0; i<arrStrs[x].length();i++) {
            arrStrQuestion[i]="_";
        }
        for(int i = 0; i<arrStrs[x].length();i++){
            arrStrAnswer[i]=arrStrs[x].split("")[i];
        }

        String letter;
        Scanner in = new Scanner(System.in);

        boolean guessedTheLetter;

        boolean end = false;
        boolean winer = false;

        for(String str: arrStrQuestion){
            System.out.print(str+" ");
        }

        while (!end){
            System.out.print("\nLIFE: "+countLife+"\n");

            letter = in.next();

            guessedTheLetter = false;

            for (int i = 0; i < arrStrAnswer.length; i++) {
                if(arrStrAnswer[i].equals(letter)){
                    arrStrQuestion[i]=arrStrAnswer[i];
                    guessedTheLetter = true;
                }
            }

            for(String str: arrStrQuestion){
                System.out.print(str+" ");
            }

            if(!guessedTheLetter){
                countLife--;
            }

            if(countLife==0){
                end = true;
            }

            int count = 0;
            for(String str: arrStrQuestion){
                if(str.equals("_")){
                    count++;
                }
            }
            if(count == 0){
                end = true;
                winer = true;
            }
        }

        if(winer){
            System.out.print("\nYou win!");
        }else{
            System.out.print("\nYou lose!\n");
            for(String str: arrStrAnswer){
                System.out.print(str+" ");
            }
        }

    }
}
