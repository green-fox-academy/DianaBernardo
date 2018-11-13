package PostIt;

/*
Create a PostIt class that has
a backgroundColor
a text on it
a textColor

Create a few example post-it objects:
an orange with blue text: "Idea 1"
a pink with black text: "Awesome"
a yellow with green text: "Superb!"
 */

import java.awt.*;
import java.util.List;

public class PostIt {
    Color backgroundColor;
    String text;
    Color textColor;


    public static void main(String[] args){

        PostIt one = new PostIt();
        one.backgroundColor = Color.ORANGE;
        one.text = "Idea 1";
        one.textColor = Color.BLUE;

        PostIt two = new PostIt();
        two.backgroundColor = Color.PINK;
        two.text = "Awesome";
        two.textColor = Color.BLACK;

        PostIt three = new PostIt();
        three.backgroundColor = Color.YELLOW;
        three.text = "Superb";
        three.textColor = Color.GREEN;

    }

}

