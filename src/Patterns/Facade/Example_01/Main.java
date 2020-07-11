package Patterns.Facade.Example_01;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Facade converter = new Facade();
        File mp4 = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
