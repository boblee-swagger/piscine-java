
import java.util.Objects;


public class Star extends CelestialObject{
    private double magnitude;


    public Star(){
        this.magnitude = 0.0;
    }

    public Star(String name, double x, double y, double z, double magnitude, int mass){
        super(name, x, y, z, mass);
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
        return Objects.hash(super.hashCode(), this.magnitude);
    }

 
    @Override
    public boolean equals(Object obj) {
       if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        if (!super.equals(obj))
            return false;

        Star star = (Star) obj;
        return Double.compare(this.magnitude, star.magnitude) == 0;
    }

   
    @Override
    public String toString() {
        return String.format("%s shines at the %.3f magnitude", getName(), magnitude);
    }
}
