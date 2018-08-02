package helloworld.Enum;

/**
 * Created by song on 2018/7/9.
 */
public enum Color {

    RED("red"),YELLOW("yellow");

    private  String value ;

    private Color(String value){

        this.value=value;
    }

    @Override
    public String toString() {
        return value;
    }


}


