package Problem1.hardwareCombinationPackage;

import Problem1.controllerPackage.ButtonController;
import Problem1.controllerPackage.Controller;
import Problem1.displayPackage.Display;
import Problem1.displayPackage.LCDDisplay;
import Problem1.identificationPackage.IDCard;
import Problem1.identificationPackage.RFIDCard;
import Problem1.processorPackage.AtMega32;
import Problem1.processorPackage.Processor;
import Problem1.storagePackage.SDCardStorage;
import Problem1.storagePackage.Storage;

public class AtMegaCombinationFactory extends HardwareCombinationFactory {

    public Processor getProcessor(){
        return new AtMega32();
    }
    public Display getDisplay(){
        return new LCDDisplay();
    }
    public Controller getController(){
        return new ButtonController();
    }
    public IDCard getIDCard(){
        return new RFIDCard();
    }

    public Storage getStorage(){
        return new SDCardStorage();

    }
}
