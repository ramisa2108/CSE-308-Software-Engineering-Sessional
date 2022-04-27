package Problem1.hardwareCombinationPackage;
import Problem1.displayPackage.Display;
import Problem1.controllerPackage.Controller;
import Problem1.identificationPackage.IDCard;
import Problem1.processorPackage.Processor;
import Problem1.storagePackage.Storage;

public abstract class HardwareCombinationFactory {
    public abstract Processor getProcessor();
    public abstract Display getDisplay();
    public abstract Controller getController();
    public abstract IDCard getIDCard();
    public abstract Storage getStorage();
}
