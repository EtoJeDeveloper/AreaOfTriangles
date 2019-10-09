import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        String in, out;
        System.out.println("Please, enter name of input and output file");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        in = reader.readLine();
        out = reader.readLine();

        ArrayList<int[]> list = ReadingInputFile.ReadFile(in);

        for (int[] ints : list) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
