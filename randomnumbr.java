import java.util.*;

class RandomNumber {
    public static void main(String[] args) {
        int guess, answer, score;
        final int high = 100;
        Scanner keypad = new Scanner(System.in);

        Random rand = new Random();

        answer = rand.nextInt(high) + 1; 
        
        // FOR RANDOM NUMBER

        System.out.println(
                " Welcome  to the Number Guess game !\n I have a number between 1 and 100 . can you guess it ?");

        int attempts_num = 0;

        // FOR PLAY MULTIPLE TIME 

        while (answer > 0) {
            attempts_num += 1;
            guess = keypad.nextInt();
            if (guess == answer) {
                System.out.println(" congratulation ! you guess right number in attempts  " + attempts_num);
                break;
            }
            if (guess > answer) {
                System.out.println(" oh! no number my number is small. ");
            }

            else {
                System.out.println(" oh! no number my number is large");

                score = (answer + attempts_num) / 2;
                System.out.println(" wao your score is " + score);
            }

            //  FOR COUNT ATTEMPTS NUMBER 
            if (attempts_num >= 10) {
                System.out.println(" Sorryb ,you have reached the maximum number of attempts.");
                System.out.println(" my number was " + answer);
                break;
            }

        }

    }
}