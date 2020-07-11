package Patterns.Facade.Example_01;

public class CodecFactory {
    public static Codec create(String str){
        switch (str.toLowerCase()){
            case "mp4":
                System.out.println("Create mp4 file");
                return new Mpeg();
            case "ogg":
                System.out.println("Create ogg file");
                return new Ogg();
            default: return new Mpeg();
        }
    }
}
