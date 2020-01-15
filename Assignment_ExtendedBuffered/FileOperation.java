import java.io.*;

public class FileOperation{

    public static void main(String[] args) throws IOException {

        File file = new File("sample.txt");
        file.createNewFile();

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Hello world");
        bufferedWriter.close();

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        System.out.println(bufferedReader.readLine());
        bufferedReader.close();
    }
}
