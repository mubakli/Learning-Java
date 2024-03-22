public class Point3D extends Point2D{
 private  float z = 0f;
 Point3D(){}

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
    public void setXYZ(float x, float y, float z){
     this.z = z;
     setX(x);
     setY(y);
    }
    public float[] getXYZ(){
     float[] array = new float[3];
     float[] xy =getXY();
     array[0] = xy[0];
     array[1] = xy[1];
     array[2] = z;
        return array;
    }
}
