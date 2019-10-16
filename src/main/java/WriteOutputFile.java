import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteOutputFile {
    public static void WriteFile(String outputFileName, int[] CoordinatesOfTheLargestTriangle) throws FileNotFoundException {
        File file = new File(outputFileName);
        PrintWriter printWriter = new PrintWriter(file);

        if (CoordinatesOfTheLargestTriangle != null) {
            for (int coordinate : CoordinatesOfTheLargestTriangle) {
                printWriter.print(coordinate + " ");
            }
        }

        printWriter.close();
    }
}
