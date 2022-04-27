package Problem3a.AdapterPackage;

import Problem3a.SumCalculatorPackage.SumCalculator;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class AsciiSumCalculator implements SumCalculatorAdapter{

    private SumCalculator sumCalculator;
    public AsciiSumCalculator(){
        sumCalculator = new SumCalculator();
    }
    public int calculateSum(File file) throws Exception{

        File asciiFile = convertToAscii(file);
        int sum = sumCalculator.calculateSum(asciiFile);
        removeFile(asciiFile);
        return sum;
    }
    private File convertToAscii(File charFile) throws Exception{

        File asciiFile = new File("src/Problem3a/Client/ascii.txt");
        FileWriter fileWriter = new FileWriter(asciiFile);
        Scanner scanner = new Scanner(charFile);

        while(scanner.hasNext()){
            String next = scanner.next();
            if(next.length() == 1)
            {
                char c = next.charAt(0);
                fileWriter.write((int)c + " ");
            }
        }
        fileWriter.close();
        return asciiFile;

    }
    private void removeFile(File file) throws Exception{
        file.delete();
    }
}
