import java.util.ArrayList;

public class Triangles {
    public static int[] IsoscelesTriangles(ArrayList<int[]> list){
        double area = 0;
        double areaBuf = 0;

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

            if (AB == AC & AB != 0 & AC != 0 & BC != 0) {
                areaBuf = BC/4 * Math.sqrt(4*AB*AB - BC*BC);
            } else if (AB == BC & AB != 0 & AC != 0 & BC != 0) {
                areaBuf = AC/4 * Math.sqrt(4*AB*AB - AC*AC);
            } else if (AC == BC & AB != 0 & AC != 0 & BC != 0) {
                areaBuf = AB/4 * Math.sqrt(4*AC*AC - AB*AB);
            }

            if (area < areaBuf){
                CoordinatesOfTheLargestTriangle = TriangleCoordinates;
                area = areaBuf;
                areaBuf = 0;
            }
        }

        return CoordinatesOfTheLargestTriangle;
    }
}
