package Problem1.processorPackage;

public class AtMega32 implements Processor {

    public AtMega32(){
        System.out.println("Microprocessor/ Microcontroller: AtMega32.");
    }
    public boolean hasEthernetModule(){
        return false;
    }
}
