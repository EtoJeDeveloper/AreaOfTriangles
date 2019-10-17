import java.util.ArrayList;
import java.util.Arrays;

public class Triangles {
    public static int[] AreaOfTheLargestIsoscelesTriangle(ArrayList<int[]> list){
        double largestArea = 0;
        double area = 0;
        int[] CoordinatesOfTheLargestTriangle = new int[6];

        for (int[] TriangleCoordinates : list) {
            int Xa = TriangleCoordinates[0];
            int Ya = TriangleCoordinates[1];
            int Xb = TriangleCoordinates[2];
            int Yb = TriangleCoordinates[3];
            int Xc = TriangleCoordinates[4];
            int Yc = TriangleCoordinates[5];

            double AB = Math.sqrt((Xb - Xa) * (Xb - Xa) + (Yb - Ya) * (Yb - Ya));
            double AC = Math.sqrt((Xc - Xa) * (Xc - Xa) + (Yc - Ya) * (Yc - Ya));
            double BC = Math.sqrt((Xc - Xb) * (Xc - Xb) + (Yc - Yb) * (Yc - Yb));

            try{
                if (Double.isNaN(AB) || Double.isNaN(AC) || Double.isNaN(BC))
                    throw new NaNException();
            } catch (NaNException e){
                System.out.println();
                System.out.println("The coordinates of triangle: " + Arrays.toString(TriangleCoordinates) + " are too large, area of this triangle cannot be calculated.");
                continue;
            }

            if (AB == AC & AB != 0 & AC != 0 & BC != 0) {
                area = BC/4 * Math.sqrt(4*AB*AB - BC*BC);
            } else if (AB == BC & AB != 0 & AC != 0 & BC != 0) {
                area = AC/4 * Math.sqrt(4*AB*AB - AC*AC);
            } else if (AC == BC & AB != 0 & AC != 0 & BC != 0) {
                area = AB/4 * Math.sqrt(4*AC*AC - AB*AB);
            }

            if (largestArea < area){
                CoordinatesOfTheLargestTriangle = TriangleCoordinates;
                largestArea = area;
                area = 0;
            }
        }

        if (largestArea > 0){
            return CoordinatesOfTheLargestTriangle;
        }
        else
            return null;
    }
}
