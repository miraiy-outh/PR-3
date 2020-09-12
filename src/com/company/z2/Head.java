package com.company.z2;

public class Head {
    private String eyeColour;
    private String hairColour;

    public Head(String eyeColour, String hairColour) {
        this.eyeColour = eyeColour;
        this.hairColour = hairColour;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public String getHairColour() {
        return hairColour;
    }

    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }

    public void out() {
        System.out.println("I have " + eyeColour + " eyes and " + hairColour + " hair.");
    }
}
