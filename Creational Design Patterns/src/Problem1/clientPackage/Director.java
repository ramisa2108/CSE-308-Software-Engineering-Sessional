package Problem1.clientPackage;

import Problem1.builderPackage.GetBuilder;
import Problem1.builderPackage.PackageBuilder;
import Problem1.builderPackage.FinalProduct;

public class Director {

    private String [] availablePackages;
    private String [] availableInternetConnections;
    private String [] availableFrameworks;

    public Director(){
        availablePackages = new String[]{ "Silver", "Gold", "Diamond", "Platinum"};
        availableFrameworks = new String[]{"Django", "Laravel", "Spring"};
        availableInternetConnections = new String[]{"GSM", "Wifi", "Ethernet"};

    }
    public FinalProduct construct(int packageNum, int internetNum, int frameworkNum) throws Exception{

        PackageBuilder packageBuilder = GetBuilder.getPackageBuilder(availablePackages[packageNum]);
        packageBuilder.buildHardware();
        packageBuilder.addInternetModule(availableInternetConnections[internetNum]);
        packageBuilder.addWeightMeasurement();
        packageBuilder.addFramework(availableFrameworks[frameworkNum]);
        return packageBuilder.getProductPackage();
    }


}
