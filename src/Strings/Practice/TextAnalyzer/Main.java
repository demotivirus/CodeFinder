package Strings.Practice.TextAnalyzer;

import javax.xml.soap.Text;

public class Main {
    public static void main(String[] args) {
        String[] spam = {"spam", "bad", "evil"};
        int commentMaxLength = 40;
        TextAnalyzer[] textAnalyzers1 = {new SpamAnalyzer(spam), new NegativeTextAnalyzer(), new TooLongTextAnalyzer(commentMaxLength)};
        TextAnalyzer[] textAnalyzers2 = {
                new SpamAnalyzer(spam),
                new TooLongTextAnalyzer(commentMaxLength),
                new NegativeTextAnalyzer()
        };
        TextAnalyzer[] textAnalyzers3 = {
                new TooLongTextAnalyzer(commentMaxLength),
                new SpamAnalyzer(spam),
                new NegativeTextAnalyzer()
        };
        TextAnalyzer[] textAnalyzers4 = {
                new TooLongTextAnalyzer(commentMaxLength),
                new NegativeTextAnalyzer(),
                new SpamAnalyzer(spam)
        };
        TextAnalyzer[] textAnalyzers5 = {
                new NegativeTextAnalyzer(),
                new SpamAnalyzer(spam),
                new TooLongTextAnalyzer(commentMaxLength)
        };
        TextAnalyzer[] textAnalyzers6 = {
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(commentMaxLength),
                new SpamAnalyzer(spam)
        };

        String[] tests = new String[8];
        tests[0] = "This comment is so good.";
        tests[1] = "This comment is so Loooooooooooooooooooooooooooong.";
        tests[2] = "Very negative comment !!!!=(!!!!;";
        tests[3] = "Very BAAAAAAAAAAAAAAAAAAAAAAAAD comment with :|;";
        tests[4] = "This comment is so bad....";
        tests[5] = "The comment is a spam, maybeeeeeeeeeeeeeeeeeeeeee!";
        tests[6] = "Negative bad :( spam.";
        tests[7] = "Very bad, very neg =(, very ..................";

        TextAnalyzer[][] textAnalyzers = {textAnalyzers1, textAnalyzers2, textAnalyzers3,
                textAnalyzers4, textAnalyzers5, textAnalyzers6};

        Main testObj = new Main();
        int numberOfAnalyzer;
        int numberOfTest = 0;

        for (String test : tests){
            numberOfAnalyzer = 1;
            System.out.print("Test # " + numberOfTest + ": ");
            System.out.println(test);
            for (TextAnalyzer[] analyzers : textAnalyzers){
                System.out.print(numberOfAnalyzer + ": ");
                System.out.println(testObj.checkLabels(analyzers, test));
                numberOfAnalyzer++;
            }
            numberOfTest++;
        }
    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text){
        for (TextAnalyzer analyzer : analyzers){
            Label res;
            if ((res = analyzer.processText(text)) != Label.OK)
                return res;
        }
        return Label.OK;
    }
}
