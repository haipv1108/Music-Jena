package vn.brine.haileader.musicjena.utils;

import java.util.ArrayList;

/**
 * Created by HaiLeader on 7/5/2016.
 */
public class DataAssistant {
    public static ArrayList<String> splitTextSearchToPhrase(String textSearch) {
        ArrayList<String> mListKeyWord = new ArrayList<String>();

        String[] splitWord = textSearch.split(" ");
        int lengthListWord = splitWord.length;
        for (int i = 0; i < lengthListWord; i++) {
            if (i + 2 < lengthListWord) {
                String pharse = splitWord[i] + " " + splitWord[i + 1] + " " + splitWord[i + 2];
                mListKeyWord.add(pharse);
            }
            if (i + 1 < lengthListWord) {
                String pharse = splitWord[i] + " " + splitWord[i + 1];
                mListKeyWord.add(pharse);
            }
            if (!splitWord[i].equals("film")) {
                mListKeyWord.add(splitWord[i]);
            }
        }
        return mListKeyWord;
    }
}