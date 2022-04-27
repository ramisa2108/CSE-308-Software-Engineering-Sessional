package Problem1.frameworkPackage;

public class FrameworkFactory {
    public Framework getFramework(String type){
        if(type.equalsIgnoreCase("Django")){
            return new DjangoFramework();
        }
        else if(type.equalsIgnoreCase("Laraval")){
            return new LaravelFramework();
        }
        else if(type.equalsIgnoreCase("Spring")){
            return new SpringFramework();
        }
        else{
            return null;
        }
    }
}
