package point;


public class Point3D extends Point2D{
    private float z = 5;
    public Point3D(){};
    public Point3D(float z){
        this.z = z;
    }
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setX(float x){
        super.setX(x);
    }
    public void setY(float y){
        super.setY(y);
    }
    @Override
    public String toString(){
        return super.toString()+"(" + getZ()+")";
    }
}
