import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        for (int i = 0; i<10 ; i++)
        {
            liste.add(String.valueOf(i));
        }
        FileAcces.WriteListIn("test",liste);
    }
}
