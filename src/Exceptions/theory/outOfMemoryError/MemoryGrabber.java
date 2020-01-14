package Exceptions.theory.outOfMemoryError;

import java.util.LinkedList;
import java.util.List;

public class MemoryGrabber {
    static final List<Object[]> arr = new LinkedList<>();

    public void grabAllMemory(){
        for (;;)
            arr.add(new Object[500]);
    }
}
