package Generics.Theory.Example_07;

public class Text {
    private String text;

    public <T extends String> Text(T text){
        this.text = text;
    }

    @Override
    public String toString() {
        return "Text: " +
                "text = " + text;
    }
}
