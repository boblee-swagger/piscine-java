public class Star extends CelestialObject{
    private double magnitude;

    public Star(String name, double x, double y, double z, double magnitude){
        super(name, x, y, z);
        this.magnitude = magnitude;
    }

    public double getMagnitude(){
        return this.magnitude;
    }

    public void setMagnitude(double x){
        this.magnitude = x;
    }

}