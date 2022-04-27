package Problem2.editorPackage;

import Problem2.aestheticsPackage.AestheticsGroup;
import Problem2.parserPackage.Parser;

public class Editor {
    private static Editor instance;
    private AestheticsGroup aesthetics;
    private Parser parser;

    private Editor(){
        System.out.println("Editor instantiated.");
    }
    public static Editor getInstance(){
        if(instance == null) {
            instance = new Editor();
        }
        return instance;
    }
    public void openFile(String filename){
        AbstractComponentFactory factory = GetFactory.getFactory(filename);
        try {
            this.parser = factory.getParser();
            this.aesthetics = factory.getAesthetics();
            System.out.println(filename+" file opened in editor.");

        }catch (Exception e){
            System.out.println("File type not supported.");
        }

    }
}
