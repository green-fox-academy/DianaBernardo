package Sharpie;

public class Main {
    public static void main (String[] args){

        Sharpie one = new Sharpie();
        one.color = "blue";
        one.width = 23.90;
        one.inkAmount = 10.10;

        Sharpie two = new Sharpie();
        two.color = "yellow";
        two.width = 40.50;
        two.inkAmount = -23.00;

        Sharpie three = new Sharpie();
        three.color = "red";
        three.width = 50.15;
        three.inkAmount = 100.00;

        SharpieSet set = new SharpieSet();
        set.sharpieset.add(one);
        set.sharpieset.add(one);
        set.sharpieset.add(three);

        System.out.println(set.countUsable());
    }
}
