package Patterns.Flyweight.Example_01;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherDate){
        TreeType treeType = TreeFactory.getTreeType(name, color, otherDate);
        Tree tree = new Tree(x, y, treeType);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics){
        for (Tree tree : trees)
            tree.draw(graphics);
    }
}
