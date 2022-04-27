package Problem1.hardwareCombinationPackage;

import Problem1.controllerPackage.ButtonController;
import Problem1.controllerPackage.Controller;
import Problem1.displayPackage.Display;
import Problem1.displayPackage.LEDDisplay;
import Problem1.identificationPackage.IDCard;
import Problem1.identificationPackage.RFIDCard;
import Problem1.processorPackage.ArduinoMega;
import Problem1.processorPackage.Processor;
import Problem1.storagePackage.SDCardStorage;
import Problem1.storagePackage.Storage;

public class ArduinoCombinationFactory extends HardwareCombinationFactory {

    public Processor getProcessor(){
        return new ArduinoMega();
    }
    public Display getDisplay(){
        return new LEDDisplay();
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
