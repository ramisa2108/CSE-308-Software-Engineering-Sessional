package Problem2.editorPackage;

public class GetFactory {

    public static AbstractComponentFactory getFactory(String filename){

        String [] parts = filename.split("\\.");
        String extension = parts[parts.length-1];

        if(extension.equals("py")){
            return new PythonComponentFactory();
        }
        else if(extension.equals("cpp")){
            return new CppComponentFactory();
        }
        else if(extension.equals("c")){
            return new CComponentFactory();
        }
        else{
            return null;
        }
    }
}
