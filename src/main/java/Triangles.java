import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Triangles {
    public static void IsoscelesTriangles(ArrayList<int[]> list){
        double area = 0;
        for (int[] coordinateOfOneTriangles : list) {
            int Xa = coordinateOfOneTriangles[0];
            int Ya = coordinateOfOneTriangles[1];
            int Xb = coordinateOfOneTriangles[2];
            int Yb = coordinateOfOneTriangles[3];
            int Xc = coordinateOfOneTriangles[4];
            int Yc = coordinateOfOneTriangles[5];

            double AB = Math.sqrt((Xb - Xa) * (Xb - Xa) + (Yb - Ya) * (Yb - Ya));
            double AC = Math.sqrt((Xc - Xa) * (Xc - Xa) + (Yc - Ya) * (Yc - Ya));
            double BC = Math.sqrt((Xc - Xb) * (Xc - Xb) + (Yc - Yb) * (Yc - Yb));

            if (AB == AC) {
                area = BC/4 * Math.sqrt(4*AB*AB - BC*BC);
            } else if (AB == BC) {
                area = AC/4 * Math.sqrt(4*AB*AB - AC*AC);
            } else if (AC == BC) {
                area = AB/4 * Math.sqrt(4*AC*AC - AB*AB);
            }

            System.out.println(area);
        }
    }
}
