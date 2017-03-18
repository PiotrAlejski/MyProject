package model;

/**
 * Created by RENT on 2017-03-15.
 */
public enum StreetPrefix {
    STREET("ul."), AVENUE("al."), SQUERE("pl."),;

    private final String prefix;

    public String getPrefix() {
        return prefix;
    }

    StreetPrefix(String prefix) {
        this.prefix = prefix;
    }
}
