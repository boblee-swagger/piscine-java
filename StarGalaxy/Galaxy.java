import java.util.ArrayList;
import java.util.List;

public class Galaxy extends CelestialObject {
    private final List<CelestialObject> celestialObject;

    public Galaxy(){
        this.celestialObject = new ArrayList<>();
    }

    public List<CelestialObject> getCelestialObjects(){
        return this.celestialObject;
    }

    public void addCelestialObject(CelestialObject obj){
        this.celestialObject.add(obj);
    }



}