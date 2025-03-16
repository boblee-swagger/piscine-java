import java.util.ArrayList;
import java.util.List;

public class Galaxy extends CelestialObject {
    private final List<CelestialObject> celestialObjects;

    public Galaxy(){
        this.celestialObjects = new ArrayList<>();
    }

    public List<CelestialObject> getCelestialObjects(){
        return this.celestialObjects;
    }

    public void addCelestialObject(CelestialObject obj){
        this.celestialObjects.add(obj);
    }



}