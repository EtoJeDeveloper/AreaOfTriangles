import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class TrianglesTest {

    @Test
    public void areaOfTriangleShouldBeTheLargest(){
        ArrayList<int[]> triangles = new ArrayList<>();

        int[] coordinateOfOneTriangles1 = {-1, -1, 10, -1, -1, 10};
        int[] coordinateOfOneTriangles2 = {0, 0, 1, 0, 0, 1};

        triangles.add(coordinateOfOneTriangles1);
        triangles.add(coordinateOfOneTriangles2);

        Assert.assertEquals(coordinateOfOneTriangles1, Triangles.AreaOfTheLargestIsoscelesTriangle(triangles));
    }

    @Test
    public void areaOfTheLargestIsoscelesTriangleShouldHaveNull(){
        ArrayList<int[]> triangles = new ArrayList<>();

        int[] coordinateOfOneTriangles = {0, 0, 0, 0, 0, 0};

        triangles.add(coordinateOfOneTriangles);

        Assert.assertNull(Triangles.AreaOfTheLargestIsoscelesTriangle(triangles));
    }
}
