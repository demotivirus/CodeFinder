package Patterns.Flyweight.Example_01;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    static Map<String, TreeType> treeTypeMap = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherDate){
        TreeType res = treeTypeMap.get(name);

        if(res == null){
            res = new TreeType(name, color, otherDate);
            treeTypeMap.put(name, res);
        }

        return res;
    }
}
