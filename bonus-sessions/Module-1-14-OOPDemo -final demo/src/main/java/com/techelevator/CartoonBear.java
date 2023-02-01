package com.techelevator;

public abstract class CartoonBear implements Bear {

    private String name;
    private double height;
    private String furColor;
    private String catchphrase;

    public CartoonBear(String name, double height, String furColor, String catchphrase) {
        this.name = name;
        this.height = height;
        this.furColor = furColor;
        this.catchphrase = catchphrase;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public String getFurColor() {
        return furColor;
    }

    public String getCatchphrase() {
        return catchphrase;
    }

    public abstract String speaks();
}
