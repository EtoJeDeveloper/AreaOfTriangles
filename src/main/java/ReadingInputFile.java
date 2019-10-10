import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingInputFile {
    public static ArrayList<int[]> ReadFile(String fileName) throws FileNotFoundException{
        File file = new File(fileName);
        Scanner scanner = null;
        scanner = new Scanner(file);

        ArrayList<int[]> triangles = new ArrayList<>();
        int string = 1;
        while (scanner.hasNext()){
            int counter = 0;
            int[] coordinateOfOneTriangles = new int[6];
            String line = scanner.nextLine();
            String[] trianglesString = line.split(" ");

            try {
                for (String s : trianglesString) {
                    coordinateOfOneTriangles[counter++] = Integer.parseInt(s);
                }
                if (counter < 6)
                    throw new CoordinateException();
            } catch (NumberFormatException e){
                System.out.println("String number " + string + ", has contained a wrong characters.");
                string++;
                continue;
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("String number " + string + ", has contained an excess coordinates.");
                string++;
                continue;
            } catch (CoordinateException e){
                System.out.println("String number " + string + ", hasn't contained of all coordinates.");
                string++;
                continue;
            }
            triangles.add(coordinateOfOneTriangles);
            string++;
        }

        scanner.close();
        return triangles;
    }
}
