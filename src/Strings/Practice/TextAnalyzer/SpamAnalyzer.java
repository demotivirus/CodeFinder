package Strings.Practice.TextAnalyzer;

public class SpamAnalyzer extends KeywordAnalyzer{
    private String[] keywords;
    private Label label = Label.SPAM;

    public SpamAnalyzer(String[] keywords){
        this.keywords = keywords;
    }

    @Override
    public String[] getKeywords() {
        return keywords;
    }

    @Override
    public Label getLabel() {
        return label;
    }
}
