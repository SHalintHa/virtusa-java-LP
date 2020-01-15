import java.io.*;

public class ExtendedBufferedReader extends BufferedReader {

    public ExtendedBufferedReader(Reader reader) {
        super(reader);
    }

    public String readLine() throws IOException {
        String result = super.readLine();
        int n;
        char[] chars = new char[result.length()];

        for(int i = 0; i < result.length(); i++) {

            n = (int) result.charAt(i);
            if(n >= 97){
                n -= 32;
            }
            chars[i] = (char) n;
        }

        result = String.valueOf(chars);
        return result;
    }

    public static void main(String[] args) throws IOException {

        File file = new File("sample.txt");
        file.createNewFile();

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        ExtendedBufferedReader extendedBufferedReader = new ExtendedBufferedReader(fileReader);

        System.out.println(extendedBufferedReader.readLine());
        bufferedReader.close();
    }
}
