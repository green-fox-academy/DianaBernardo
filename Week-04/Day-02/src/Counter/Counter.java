package Counter;

public class Counter {
    int counter;
    int initialCounter;

    public Counter(int counter){
        this.counter = counter;
        initialCounter = counter;
    }

    public Counter(){
        counter = 0;
        initialCounter = 0;
    }


    public void add(int number) {
        counter = counter + number;
    }

    public void add() {
        counter++;
    }

    public int get() {
        return counter;
    }

    public void reset() {
        counter = initialCounter;
    }
}
