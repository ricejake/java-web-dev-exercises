package exercises;
import java.util.ArrayList;
public class arrayPractice {
    public static void main(String[] args) {
//        int numbers[] = {1, 1, 2, 3, 5, 8};
//        for(int i = 0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }

        String greenEggsHam = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        ArrayList<String> greenEggsHamArray = new ArrayList<>();
        for (String word: greenEggsHam.split(" \\.")) {
            greenEggsHamArray.add(word);
        }
        String green;
        System.out.println(greenEggsHamArray);

        //System.out.println(greenEggsHamArray.toString());
    }
}
