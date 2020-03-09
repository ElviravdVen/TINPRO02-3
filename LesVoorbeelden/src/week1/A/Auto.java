package week1.A;

public class Auto {
    protected int prijs;

    public Auto(int prijs) {
        this.setPrijs(prijs);
    }

    public void printData(){

        System.out.println("De prijs van deze auto is " + this.prijs + " euro.");
    }

    public int getPrijs() {
        return prijs;
    }

    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }
}
