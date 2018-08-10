package com.codewars.kata;

public class Dictionary {

    private String word;
    private String definition;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public Dictionary() {
    }

    void newEntry(String word, String definition ) {
        setWord(word);
        setDefinition(definition);
    }

    String look(String word) {
        if (word.equals(getWord())) {
            return getDefinition();
        } else return "Cant find entry for ".concat(word);
    }
}

