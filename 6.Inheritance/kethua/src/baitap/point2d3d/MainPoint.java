package baitap.point2d3d;

import java.util.Arrays;

public class MainPoint {
    public static void main(String[] args) {
        Point2d point2d = new Point2d();
        Point3d point3d = new Point3d();
        point2d.setXY(3f,5f);
        point3d.setXYZ(4f,5f,6f);
        System.out.println(point2d.toString());
        System.out.println(point3d.toString());

        System.out.println(Arrays.toString(point3d.getXYZ()));
        System.out.println(Arrays.toString(point2d.getXY()));
    }
}
