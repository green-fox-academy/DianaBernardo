package Sharpie;

public class Main {
    public static void main (String[] args){

        Sharpie one = new Sharpie();
        one.color = "blue";
        one.width = 23.90;

        Sharpie two = new Sharpie();
        two.color = "yellow";
        two.width = 40.50;

        one.use();
        System.out.println(one.inkAmount);
    }
}
