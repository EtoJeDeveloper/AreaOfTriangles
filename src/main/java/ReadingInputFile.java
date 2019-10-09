import javax.swing.border.EmptyBorder;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingInputFile {
    public static ArrayList<int[]> ReadFile(String fileName) {
        File file = new File(fileName);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please try again");
        }

        ArrayList<int[]> numbers = new ArrayList<>();
        int string = 1;
        while (scanner.hasNext()){
            int counter = 0;
            int[] mas = new int[6];
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");

            try {
                for (String s : numbersString) {
                    mas[counter++] = Integer.parseInt(s);
                }
                if (counter < 6)
                    throw new CoordinateException();
            } catch (NumberFormatException e){
                System.out.println("String number " + string + ", has contains a wrong characters.");
                string++;
                continue;
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("String number " + string + ", has contains an excess coordinates.");
                string++;
                continue;
            } catch (CoordinateException e){
                System.out.println("String number " + string + ", hasn't contains of all coordinates.");
                string++;
                continue;
            }
            numbers.add(mas);
            string++;
        }

        scanner.close();
        return numbers;
    }
}
