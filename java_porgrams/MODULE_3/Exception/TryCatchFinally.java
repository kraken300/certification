import java.io.*;

public class TryCatchFinally {
    public static void main(String[] args) {
        /*
         * Checked exception related to the files
         */

        FileReader reader = null;
        try {
            reader = new FileReader("example.txt");
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        BufferedReader br = new BufferedReader(reader);

        try {
            br.readLine();
        } 
        catch (IOException e) {
            e.printStackTrace();
        } 
        finally {
            try {
                reader.close();
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
