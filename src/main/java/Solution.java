import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter name of input and output file");
        String in = reader.readLine();
        ArrayList<int[]> triangles = null;

        while (triangles == null){
            try {
                triangles = ReadingInputFile.ReadFile(in);
            } catch (FileNotFoundException e) {
                System.out.println("File not found. Please try again");
                in = reader.readLine();
            }
        }

        Triangles.IsoscelesTriangles(triangles);
    }
}
