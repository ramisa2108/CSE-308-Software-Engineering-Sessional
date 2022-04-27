package Problem1.builderPackage;

public class GetBuilder {

    public static PackageBuilder getPackageBuilder(String packageName){
        if(packageName.equalsIgnoreCase("Gold")){
            return new GoldPackageBuilder();
        }
        else if(packageName.equalsIgnoreCase("Silver")){
            return new SilverPackageBuilder();
        }
        else if(packageName.equalsIgnoreCase("Diamond")){
            return new DiamondPackageBuilder();
        }
        else if(packageName.equalsIgnoreCase("Platinum")){
            return new PlatinumPackageBuilder();
        }
        else return null;
    }
}
