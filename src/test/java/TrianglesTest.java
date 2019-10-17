import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;

public class TrianglesTest {
    private static ArrayList<int[]> triangles;

    @BeforeClass
    public static void createArray(){
        triangles = new ArrayList<>();
    }

    @Test
    public void areaOfTriangleShouldBeTheLargest(){
        int[] coordinateOfOneTriangles1 = {-1, -1, 10, -1, -1, 10};
        int[] coordinateOfOneTriangles2 = {0, 0, 1, 0, 0, 1};
        int[] coordinateOfOneTriangles3 = {-2, 2, 4, 2, 1, 6};
        int[] coordinateOfOneTriangles4 = {10, 22, -3, 7, 199, 200};

        triangles.add(coordinateOfOneTriangles1);
        triangles.add(coordinateOfOneTriangles2);
        triangles.add(coordinateOfOneTriangles3);
        triangles.add(coordinateOfOneTriangles4);

         Assert.assertEquals(coordinateOfOneTriangles1, Triangles.AreaOfTheLargestIsoscelesTriangle(triangles));
    }

    @Test
    public void areaOfTheLargestIsoscelesTriangleShouldHaveNull(){
        int[] coordinateOfOneTriangles1 = {0, 0, 0, 0, 0, 0};
        int[] coordinateOfOneTriangles2 = {-1, 1, 0, 0, 0, 0};
        int[] coordinateOfOneTriangles3 = {-1, 1, -1, 1, -1, 1};
        int[] coordinateOfOneTriangles4 = {10, 22, -3, 7, 199, 200};
        int[] coordinateOfOneTriangles5 = {0, 0, 0, 4, 0, 8};

        triangles.add(coordinateOfOneTriangles1);
        triangles.add(coordinateOfOneTriangles2);
        triangles.add(coordinateOfOneTriangles3);
        triangles.add(coordinateOfOneTriangles4);
        triangles.add(coordinateOfOneTriangles4);
        triangles.add(coordinateOfOneTriangles5);

        Assert.assertNull(Triangles.AreaOfTheLargestIsoscelesTriangle(triangles));
    }
}
