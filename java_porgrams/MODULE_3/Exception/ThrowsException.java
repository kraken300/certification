import java.io.*;

public class ThrowsException {

    public static void readingFromFile(String name) throws FileNotFoundException, IOException {
        FileReader reader = null;
        reader = new FileReader(name);
        BufferedReader br = new BufferedReader(reader);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
        reader.close();
    }

    public static void createFile(String name) throws Exception {
        File f = new File(name);
        f.createNewFile();

        FileWriter fw = new FileWriter(f);
        fw.write("hello \nbye \n....");
        fw.flush();
        fw.close();
    }

    public static void main(String[] args) throws Exception {
        String name = "example.txt";
        createFile(name);
        readingFromFile(name);
    }
}
