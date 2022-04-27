package Problem3a.SumCalculatorPackage;

import java.io.File;
import java.util.Scanner;

public class SumCalculator {

    public int calculateSum(File file) throws Exception{
        int sum = 0;
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextInt()){
            sum += scanner.nextInt();
        }
        return sum;
    }
}
