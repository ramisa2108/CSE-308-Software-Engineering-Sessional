package Problem2.editorPackage;

import Problem2.aestheticsPackage.AestheticsGroup;
import Problem2.aestheticsPackage.CppAestheticsGroup;
import Problem2.parserPackage.CppParser;
import Problem2.parserPackage.Parser;

public class CppComponentFactory extends AbstractComponentFactory {
    public Parser getParser(){
        return new CppParser();
    }
    public AestheticsGroup getAesthetics(){
        return new CppAestheticsGroup();
    }
}
