
import java.util.Objects;


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

    @Override
    public int hashCode(){
        return Objects.hash(this.getName(), this.getX(), this.getY(), this.getZ(), this.magnitude);
    }

    public boolean equals(Star st){
        if (st != null){
            return false;
        }
        return this.hashCode() == st.hashCode(); 
    }

   
    @Override
    public String toString(){
        String out =  String.format("%s is positioned at (%.3f, %.3f, %.3f, %.3f)", this.getName(), this.getX(), this.getY(), this.getZ(), this.getMagnitude());
        return out;
    }
}
