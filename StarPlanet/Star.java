
import java.util.Objects;


public class Star extends CelestialObject{
    private double magnitude;


    public Star(){
        this.magnitude = 0.0;
    }

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

     @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), magnitude);
    }

 
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            Star star = (Star) obj;
            return this.hashCode() == star.hashCode();
        }
        return false;
    }

   
    @Override
    public String toString() {
        return String.format("%s shines at the %.3f magnitude", getName(), magnitude);
    }
}
