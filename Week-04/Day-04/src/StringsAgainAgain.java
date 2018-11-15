// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".

public class StringsAgainAgain {
    public static void main(String[] args){
        System.out.println(again("String to try"));
    }

    public static String again(String str){
        int index = 0;
        if(index == str.length() - 1) {
            return str;
        } else {
            return str.charAt(0) + "*" + again(str.substring(1));
        }
    }
}
