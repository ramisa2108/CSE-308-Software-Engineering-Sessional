package Problem1.internetPackage;

public class InternetModuleFactory {

    public InternetModule getInternetModule(String type){
        if(type.equalsIgnoreCase("Wifi")){
            return new WifiModule();
        }
        else if(type.equalsIgnoreCase("GSM")){
            return new GSMModule();
        }
        else if(type.equalsIgnoreCase("Ethernet")){
            return new Ethernet();
        }
        else return null;

    }
}
