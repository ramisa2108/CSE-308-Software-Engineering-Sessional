package Problem1.builderPackage;

public interface PackageBuilder {
    public void buildHardware();
    public void addFramework(String frameworkType);
    public void addInternetModule(String internetType) throws Exception;
    public void addWeightMeasurement();
    public FinalProduct getProductPackage();

}
