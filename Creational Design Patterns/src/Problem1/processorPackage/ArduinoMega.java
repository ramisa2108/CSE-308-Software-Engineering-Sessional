package Problem1.processorPackage;

public class ArduinoMega implements Processor {
    public ArduinoMega(){
        System.out.println("Microprocessor/ Microcontroller: Arduino Mega.");
    }
    public boolean hasEthernetModule(){
        return false;
    }
}
