import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String fileToTest = args[0];
        String fileToSavePlus = args[1];
        String fileToSaveMoins = args[2];




        List<String> liste = new ArrayList<>();
        for (int i = 0; i<10 ; i++)
        {
            liste.add(String.valueOf(i));
        }


        FileAcces.WriteListIn(fileToSaveMoins,liste);
        FileAcces.WriteListIn(fileToSavePlus,liste);
    }
}
