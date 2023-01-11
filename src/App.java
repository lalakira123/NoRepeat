import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> mainFruitsList = new ArrayList<>();
        mainFruitsList.add("Amora");
        mainFruitsList.add("Uva");
        mainFruitsList.add("Limão");

        List<String> secondFruitsList = new ArrayList<>();
        secondFruitsList.add("Limão");
        secondFruitsList.add("Pêra");
        secondFruitsList.add("Amora");

        for (int i = 0; i < mainFruitsList.size(); i++) {
            String fruit = mainFruitsList.get(i);

            boolean hasFruit = secondFruitsList.contains(fruit);

            if (hasFruit) {
                System.out.println(fruit);
            }
        }
    }
}
