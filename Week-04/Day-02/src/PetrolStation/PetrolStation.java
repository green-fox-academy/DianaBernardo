package PetrolStation;

public class PetrolStation {

    public static void main(String[] args){

        Station station1 = new Station();
        Car car1 = new Car();

        System.out.println(car1.gasAmount);
        station1.refill(car1);
        System.out.println(car1.gasAmount);
        station1.refill(car1);
        System.out.println(car1.gasAmount);
        System.out.println(station1.gasAmount);
    }
}
