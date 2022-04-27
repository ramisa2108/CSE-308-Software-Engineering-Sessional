package Problem1.hardwareCombinationPackage;

import Problem1.controllerPackage.Controller;
import Problem1.controllerPackage.ScreenController;
import Problem1.displayPackage.Display;
import Problem1.displayPackage.TouchScreenDisplay;
import Problem1.identificationPackage.IDCard;
import Problem1.identificationPackage.NFCCard;
import Problem1.processorPackage.Processor;
import Problem1.processorPackage.RaspberryPi;
import Problem1.storagePackage.BuiltInStorage;
import Problem1.storagePackage.Storage;

public class RaspberryPiCombinationFactory extends HardwareCombinationFactory {
    public Processor getProcessor(){
        return new RaspberryPi();
    }
    public Display getDisplay(){
        return new TouchScreenDisplay();
    }
    public Controller getController(){
        return new ScreenController();
    }
    public IDCard getIDCard(){
        return new NFCCard();
    }
    public Storage getStorage(){
        return new BuiltInStorage();

    }
}
