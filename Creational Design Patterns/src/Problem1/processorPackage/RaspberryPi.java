package Problem1.processorPackage;

public class RaspberryPi implements Processor {
    public RaspberryPi(){
        System.out.println("Microprocessor/ Microcontroller: Raspberry Pi.");
    }
    public boolean hasEthernetModule(){
        return true;
    }

}
