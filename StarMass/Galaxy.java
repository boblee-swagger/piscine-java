import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Galaxy {
    private List<CelestialObject> celestialObjects;

    public Galaxy(){
        this.celestialObjects = new ArrayList<>();
    }

    public List<CelestialObject> getCelestialObjects(){
        return this.celestialObjects;
    }

    public void addCelestialObject(CelestialObject obj){
        this.celestialObjects.add(obj);
    }

    public Map computeMassRepartition(){
        Map<String, Integer> celestObj =  new HashMap<>();
        int StarsMass = 0;
        int PlanetsMass = 0;
        int OthersMass = 0;

        
        for (CelestialObject celestialObj : this.celestialObjects){
            if (celestialObj instanceof Planet){
                PlanetsMass += celestialObj.getMass();
                celestObj.put("Planet", PlanetsMass);
            }else if (celestialObj instanceof Star){
                StarsMass += celestialObj.getMass();
                celestObj.put("Star", StarsMass);
            }else{
                OthersMass += celestialObj.getMass();
                celestObj.put("Other", OthersMass);
            }
        }

        return celestObj;
    }

}

