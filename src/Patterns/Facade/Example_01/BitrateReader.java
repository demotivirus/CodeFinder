package Patterns.Facade.Example_01;

public class BitrateReader {
    public static VideoFile read(VideoFile videoFile, Codec codec){
        System.out.println("Bitrate reader read file " + videoFile);
        return videoFile;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec){
        System.out.println("Bitrate reader convert file " + buffer);
        return buffer;
    }
}
