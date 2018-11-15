public class Counter {

    public static void main(String[] args) {
        System.out.println(countingDown(5));
    }


        public static int countingDown (int n){
            if (n == 0) {
                return 0;
            } else {
                System.out.println(n);
                return countingDown(n-1);
            }
        }
    }


