package org.worldcubeassociation.workbook.parse;

/**
 * @author Lars Vandenbergh
 */
public enum Gender {

    FEMALE("f"), MALE("m"), OTHER("o");

    private String fText;

    private Gender(String aText) {
        fText = aText;
    }

    @Override
    public String toString() {
        return fText;
    }

}
