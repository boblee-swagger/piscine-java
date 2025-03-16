import java.util.ArrayList;
import java.util.List;

public class Galaxy {
    private List<CelestialObject> celestialObjects;

    public Galaxy(){
        this.celestialObjects = new ArrayList<>();
    }

    public String getCelestialObjects(){
        return this.celestialObjects.toString();
    }

    public void addCelestialObject(CelestialObject obj){
        this.celestialObjects.add(obj);
    }

}

