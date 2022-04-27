package Problem1.weightPackage;

public class WeightMeasurementFactory {

    public WeightMeasurement getWeightMeasurement(String type){
        if(type.equalsIgnoreCase("load sensor")){
            return new LoadSensor();
        }
        else if(type.equalsIgnoreCase("weight module")){
            return new WeightModule();
        }
        else {
            return null;
        }
    }
}
