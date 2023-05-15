package ss6_inheritance.bai_tap.class_point2d_and_class_point3d;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }


    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }


    public float[] getXYZ() {
        return new float[]{getX(),getY(),this.z};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "xyz = " + Arrays.toString(getXYZ()) +
                "x= " + getX() +
                ", y= " + getY() +
                ", z= " + z +
                '}';
    }
}
