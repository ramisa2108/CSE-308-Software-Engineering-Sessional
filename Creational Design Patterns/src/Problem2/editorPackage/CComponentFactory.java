package Problem2.editorPackage;

import Problem2.aestheticsPackage.AestheticsGroup;
import Problem2.aestheticsPackage.CAestheticsGroup;
import Problem2.parserPackage.CParser;
import Problem2.parserPackage.Parser;

public class CComponentFactory extends AbstractComponentFactory {
    public Parser getParser(){
        return new CParser();
    }
    public AestheticsGroup getAesthetics(){
        return new CAestheticsGroup();
    }
}
