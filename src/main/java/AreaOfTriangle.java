import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputFile = "";
        String outputFile = "";

        try {
            inputFile = args[0];
            outputFile = args[1];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You must set command-line arguments. Please rename file.");
            return;
        }

        ArrayList<int[]> triangles = null;
        while (triangles == null){
            try {
                triangles = ReadingInputFile.ReadFile(inputFile);
            } catch (FileNotFoundException e) {
                System.out.println("Input file not found. Please try again.");
                System.out.print("New name for input file: ");
                inputFile = scanner.nextLine();
            }
        }

        int[] CoordinatesOfTheLargestTriangle = Triangles.AreaOfTheLargestIsoscelesTriangle(triangles);

        PrintWriter printWriter = null;

        while (printWriter == null){
            try {
                printWriter = WriteOutputFile.WriteFile(outputFile, CoordinatesOfTheLargestTriangle);
            } catch (FileNotFoundException e) {
                System.out.println("Unable to read/create output file with this name. Please rename file.");
                System.out.print("New name for output file: ");
                outputFile = scanner.nextLine();
            }
        }
    }
}
