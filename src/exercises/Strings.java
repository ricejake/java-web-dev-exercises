package exercises;
import java.util.Locale;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Type a word you would like to check for: ");
        String checkWord = input.next();

        if(alice.toLowerCase().contains(checkWord.toLowerCase())){
           System.out.println(true + " " + alice.indexOf(checkWord) + " " + checkWord.length());
        }
        else{
            System.out.println(false);
        }

    }
}
