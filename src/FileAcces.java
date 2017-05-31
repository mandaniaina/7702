
import java.io.*;
import java.util.List;

/**
 * Created by Mandaniaina on 2017-05-24.
 */
public class FileAcces {
    public static void WriteListIn(String nomFichier, List<String> toWrite) {

        //le fichien ou écrire
        File file = new File (nomFichier);
        FileWriter writer;

        try{
            writer = new FileWriter(file);
            for (String s:toWrite) {
                //écrire tout ce qui est dans la liste
                writer.write(s+"\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String ReadFrom(String nomFichier) {
        String everything = null;
        try(BufferedReader br = new BufferedReader(new FileReader(nomFichier))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {//écrire chaque ligne
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            everything = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return everything;
    }
}


