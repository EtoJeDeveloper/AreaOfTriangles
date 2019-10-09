import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        String in, out;
        System.out.println("Please, enter name of input and output file");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        in = reader.readLine();
        ArrayList<int[]> list = null;

        while (list == null){
            try {
                list = ReadingInputFile.ReadFile(in);
            } catch (FileNotFoundException e) {
                System.out.println("File not found. Please try again");
                in = reader.readLine();
            }
        }

        for (int[] ints : list) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
