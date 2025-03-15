
import java.util.Objects;



public class CelestialObject {
    private double x;
    private double y;
    private double z;
    private String name;
    public static final double KM_IN_ONE_AU = 150000000;

    public CelestialObject(){
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
        this.name = "Soleil";
    }

    public CelestialObject ( String name,double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }

    public double getX(){
        return this.x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return this.y;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getZ(){
        return this.z;
    }

    public void setZ(double z){
        this.z = z;
    }


     public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public static double getDistanceBetween(CelestialObject ob1, CelestialObject ob2){
        double x = ob2.getX() - ob1.getX();
        double y = ob2.getY() - ob1.getY();
        double z = ob2.getZ() - ob1.getZ();
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }

    public static double getDistanceBetweenInKm(CelestialObject ob1, CelestialObject ob2){
        return (getDistanceBetween(ob1, ob2)) *  CelestialObject.KM_IN_ONE_AU;

    }

    @Override
    public String toString(){
        String out =  String.format("%s is positionned at (%.3f, %.3f, %.3f)", this.name, this.x, this.y, this.z);
        return out;
    }

    public boolean equals(CelestialObject ob){
        if (this.name.equals(ob.getName())){
            if ((this.x==ob.getX())){
                if ((this.y==ob.getY())){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.name, this.x, this.y, this.z);
    }
}