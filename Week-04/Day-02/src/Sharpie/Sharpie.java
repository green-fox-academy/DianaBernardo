package Sharpie;

public class Sharpie {

    String color;
    Double width;
    Double inkAmount = 100.00;

    public void use(){
        inkAmount-=1;
    }
}
