import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter name of input file");
        String inputFile = scanner.nextLine();
        ArrayList<int[]> triangles = null;

        while (triangles == null){
            try {
                triangles = ReadingInputFile.ReadFile(inputFile);
            } catch (FileNotFoundException e) {
                System.out.println("File not found. Please try again");
                inputFile = scanner.nextLine();
            }
        }

        System.out.println("Please, enter name of output file");
        String outputFile = scanner.nextLine();

        int[] CoordinatesOfTheLargestTriangle = Triangles.IsoscelesTriangles(triangles);
        WriteOutputFile.WriteFile(outputFile, CoordinatesOfTheLargestTriangle);
    }
}
