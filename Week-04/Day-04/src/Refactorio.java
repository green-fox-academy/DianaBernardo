// Create a recursive function called `refactorio`
// that returns it's input's factorial

public class Refactorio {
    public static void main(String[] args){
        System.out.println(refactorio(6));
    }

    public static int refactorio(int input){
        if(input < 1) {
            return 1;
        }
        else{
            return input * refactorio(input-1);
        }
    }
}
