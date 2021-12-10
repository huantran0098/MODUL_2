package baitap.point2d3d;

public class Point3d extends Point2d{
    public float z = 0.0f ;

    public Point3d() {
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        setXY(x,y);
        this.z = z ;
    }
    public float[] getXYZ(){
        return new float[]{getX(), getY(), getZ()};
    }

    @Override
    public String toString() {
        return "Point3d{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + z +
                '}';
    }



}
