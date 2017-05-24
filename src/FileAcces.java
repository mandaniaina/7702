import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by Mandaniaina on 2017-05-24.
 */
public class FileAcces {
    public static void WriteListIn(String nomFichier, List<String> toWrite) {

        //the file to write
        File file = new File (nomFichier+".txt");
        FileWriter writer;

        try{
            writer = new FileWriter(file);
            for (String s:toWrite) {
                //write all string in the list
                writer.write(s+"\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
