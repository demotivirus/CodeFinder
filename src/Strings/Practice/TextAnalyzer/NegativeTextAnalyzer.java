package Strings.Practice.TextAnalyzer;

public class NegativeTextAnalyzer extends KeywordAnalyzer{
    private String[] keywords = {":(", "=(", ":|"};
    private Label label = Label.NEGATIVE_TEXT;

    public NegativeTextAnalyzer(){}

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return label;
    }
}
