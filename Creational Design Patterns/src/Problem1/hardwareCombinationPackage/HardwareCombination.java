package Problem1.hardwareCombinationPackage;

import Problem1.controllerPackage.Controller;
import Problem1.displayPackage.Display;
import Problem1.identificationPackage.IDCard;
import Problem1.internetPackage.InternetModule;
import Problem1.internetPackage.InternetModuleFactory;
import Problem1.processorPackage.Processor;
import Problem1.storagePackage.Storage;


public class HardwareCombination {
    private Processor processor;
    private IDCard idCard;
    private Display display;
    private Controller controller;
    private Storage storage;

    public HardwareCombination(HardwareCombinationFactory factory){
        this.processor = factory.getProcessor();
        this.idCard = factory.getIDCard();
        this.controller = factory.getController();
        this.storage = factory.getStorage();
        this.display = factory.getDisplay();
    }




}
