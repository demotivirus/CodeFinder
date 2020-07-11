package Patterns.Facade.Example_01;

import java.io.File;

public class AudioMixer {
    public File fix(VideoFile res){
        System.out.println("Audio mixer mixing fixing file " + res);
        return new File("tmp");
    }
}
