// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

public class Strings {
    public static void main(String[] args){

        System.out.println(string("xtring to replaxe the x", 'x', 'y'));
    }

    public static String string(String str, char x, char y){
    if(str.indexOf(x) == -1){
        return str;
    }
    else{
        char[] strArray = str.toCharArray();
        strArray[str.indexOf(x)] = y;
        return string(new String(strArray), x, y);
    }
    }
}
