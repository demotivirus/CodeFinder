package Collections.Map.Practice.NumsPopularWordsInBook;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        SearchPopularWords search = new SearchPopularWords();
        search.searchInFile("src/Collections/Map/Practice/NumsPopularWordsInBook/1984.txt");
    }
}
