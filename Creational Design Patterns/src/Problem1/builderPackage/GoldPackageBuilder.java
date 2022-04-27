package Problem1.builderPackage;

import Problem1.hardwareCombinationPackage.ArduinoCombinationFactory;
import Problem1.hardwareCombinationPackage.HardwareCombination;
import Problem1.frameworkPackage.Framework;
import Problem1.frameworkPackage.FrameworkFactory;
import Problem1.internetPackage.InternetModule;
import Problem1.internetPackage.InternetModuleFactory;
import Problem1.weightPackage.WeightMeasurement;
import Problem1.weightPackage.WeightMeasurementFactory;

import javax.swing.plaf.IconUIResource;

public class GoldPackageBuilder implements PackageBuilder{

    private FinalProduct finalProduct;
    public GoldPackageBuilder(){
        finalProduct = new FinalProduct();
    }

    public void buildHardware(){
        HardwareCombination hardwareCombination = new HardwareCombination(new ArduinoCombinationFactory());
        finalProduct.setHardwareCombination(hardwareCombination);
    }
    public void addInternetModule(String internetType){
        InternetModule internetModule = new InternetModuleFactory().getInternetModule(internetType);
        finalProduct.setInternetModule(internetModule);
    }
    public void addFramework(String frameworkType){

        Framework framework = new FrameworkFactory().getFramework(frameworkType);
        finalProduct.setFramework(framework);
    }

    public void addWeightMeasurement(){
        WeightMeasurement weightMeasurement = new WeightMeasurementFactory().getWeightMeasurement("weight module");
        finalProduct.setWeightMeasurement(weightMeasurement);
    }

    public FinalProduct getProductPackage(){
        return finalProduct;
    }

}
