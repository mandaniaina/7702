import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //String fileToTest = args[0];
        //String fileToSavePlus = args[1];
        //String fileToSaveMoins = args[2];

        List<String> liste = new ArrayList<>();
        for (int i = 0; i<100 ; i++)
        {
            liste.add(String.valueOf(i));
        }


        for (double[] ints : GetArrayFromFile("test.txt")) {
            for (double anInt : ints) {
                System.out.println(anInt+"*");
            }
        }




        //FileAcces.WriteListIn(fileToSaveMoins,liste);
        //FileAcces.WriteListIn(fileToSavePlus,liste);
    }

    private static double[][] GetArrayFromFile(String name){
        String infosBruts = FileAcces.ReadFrom(name);

        String[] infos = infosBruts.split("@data");//commencer à @data

        String lines[] = infos[1].split("\\r?\\n");//couper au saut de lignes
        lines = Arrays.copyOfRange(lines, 1, lines.length);//enlever la première ligne ou il n'y a rien
        int count = lines[0].length() - lines[0].replace(",", "").length();
        double[][] formated = new double[lines.length][count];
        for (int i = 0; i < lines.length; i++) {
            String[] valeursSepares = lines[i].split(",");//séparer à chaque ,
            for (int j = 0; j < count; j++) {
                formated[i][j] = Double.parseDouble(valeursSepares[j]);// tout insérer dans le tableau
            }
        }
        return formated;
    }
}
