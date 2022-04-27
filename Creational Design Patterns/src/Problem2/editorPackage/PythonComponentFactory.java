package Problem2.editorPackage;

import Problem2.aestheticsPackage.AestheticsGroup;
import Problem2.aestheticsPackage.PythonAestheticsGroup;
import Problem2.parserPackage.Parser;
import Problem2.parserPackage.PythonParser;

public class PythonComponentFactory extends AbstractComponentFactory {
    public Parser getParser(){
        return new PythonParser();
    }
    public AestheticsGroup getAesthetics(){
        return new PythonAestheticsGroup();

    }
}
