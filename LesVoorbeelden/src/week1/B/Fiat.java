package week1.B;

import week1.A.Auto;

public class Fiat extends Auto {
    private String type;

    public Fiat(int prijs) {
        super(prijs);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void printType(){
        this.setType("500");
        System.out.println("Dit is een Fiat " + this.type);
    }

    public void printPrijs(){
        System.out.println("De prijs van deze auto is "
                + this.prijs + " euro.");
    }
}
