package Patterns.Facade.Example_01;

import java.io.File;

public class Facade {
    public File convertVideo(String fileName, String format){
        VideoFile videoFile = new VideoFile(fileName);

        Codec source = CodecFactory.create(fileName);

        Codec distinct;
        if (format.equals("mp4"))
            distinct = new Ogg();
        else distinct = new Mpeg();

        VideoFile buff = BitrateReader.convert(videoFile, source);
        VideoFile intermediatRes = BitrateReader.convert(videoFile, distinct);

        File res = (new AudioMixer()).fix(intermediatRes);
        return res;
    }
}
