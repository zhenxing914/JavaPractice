package helloworld.Enum;

import java.util.Collections;

/**
 * Created by song on 2018/7/9.
 */
public class EnumTest {
    public static void main(String args[]){

        Color[] colors= Color.values();
        for(Color color :colors)
        {
            System.out.println(color.toString());
            System.out.println(color.name());
            System.out.println(color.ordinal());
        }

    }
}
