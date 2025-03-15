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
        return (ob1.getX() + ob2.getX()) + (ob1.getY() + ob2.getY());
    }

    public static double getDistanceBetweenInKm(CelestialObject ob1, CelestialObject ob2){
        return (getDistanceBetween(ob1, ob2)) *  CelestialObject.KM_IN_ONE_AU;

    }

     public static void main(String[] args) {
        CelestialObject defaultStar = new CelestialObject();
        CelestialObject earth = new CelestialObject("Terre", 1.0, 2.0, 2.0);

        System.out.println(CelestialObject.getDistanceBetween(defaultStar, earth));
        System.out.println(CelestialObject.getDistanceBetweenInKm(defaultStar, earth));
        System.out.println(CelestialObject.KM_IN_ONE_AU);
    }
}