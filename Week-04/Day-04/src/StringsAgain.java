
// Given a string, compute recursively a new string where all the 'x' chars have been removed.

public class StringsAgain {
    public static void main(String[] args){

        System.out.println(stringRemover("Dexete axx the x fromx the xentence", 'x'));
    }

    public static String stringRemover(String str, char x){
        int index = str.indexOf(x);
        if(index == -1){
            return str;
        }
        else{
            return stringRemover(str.substring(0, index) + str.substring(index+1), x);
        }
    }
}
