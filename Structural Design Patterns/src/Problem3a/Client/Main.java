package Problem3a.Client;


import Problem3a.AdapterPackage.AsciiSumCalculator;
import Problem3a.AdapterPackage.SumCalculatorAdapter;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String path = "src/Problem3a/Client/input.txt";
        File file = new File(path);

        try{
            SumCalculatorAdapter adapter = new AsciiSumCalculator();
            int sum = adapter.calculateSum(file);
            System.out.println("Sum = "+sum);

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
