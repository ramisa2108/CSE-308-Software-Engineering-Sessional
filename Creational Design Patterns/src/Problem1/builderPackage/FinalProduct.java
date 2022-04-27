package Problem1.builderPackage;

import Problem1.hardwareCombinationPackage.HardwareCombination;
import Problem1.frameworkPackage.Framework;
import Problem1.internetPackage.InternetModule;
import Problem1.weightPackage.WeightMeasurement;


public class FinalProduct {

    private HardwareCombination hardwareCombination;
    private Framework framework;
    private WeightMeasurement weightMeasurement;
    private InternetModule internetModule;

    public void setHardwareCombination(HardwareCombination hardwareCombination) {
        this.hardwareCombination = hardwareCombination;
    }
    public void setInternetModule(InternetModule internetModule){
        this.internetModule = internetModule;
    }
    public void setFramework(Framework framework) {
        this.framework = framework;
    }

    public void setWeightMeasurement(WeightMeasurement weightMeasurement) {
        this.weightMeasurement = weightMeasurement;
    }
}
