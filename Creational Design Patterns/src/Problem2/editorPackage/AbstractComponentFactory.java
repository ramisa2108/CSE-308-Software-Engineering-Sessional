package Problem2.editorPackage;

import Problem2.aestheticsPackage.AestheticsGroup;
import Problem2.parserPackage.Parser;

public abstract class AbstractComponentFactory {
    public abstract AestheticsGroup getAesthetics();
    public abstract Parser getParser();

}
