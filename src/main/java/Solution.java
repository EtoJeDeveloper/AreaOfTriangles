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

        int[] CoordinatesOfTheLargestTriangle = Triangles.AreaOfTheLargestIsoscelesTriangle(triangles);

        System.out.println();
        System.out.println("Please, enter name of output file");
        String outputFile = "";

        while (outputFile.equals("")){
            outputFile = scanner.nextLine();
            try {
                WriteOutputFile.WriteFile(outputFile, CoordinatesOfTheLargestTriangle);
            } catch (FileNotFoundException e) {
                System.out.println("Unable to read/create file with this name. Please try again. ");
                outputFile = "";
            }
        }

        scanner.close();
    }
}
