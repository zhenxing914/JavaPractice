package helloworld;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {


        String a = "0,1,2,3,4";

        String strArray[] = a.split(",");
        int[] inputArray = new int[5];
        int[] sortedArray = null;
        for(int i =0 ;i < strArray.length ; i ++ ){
            inputArray[i] =Integer.valueOf(strArray[i]);
        }
        Arrays.sort(inputArray);

        boolean  zero = (inputArray[0]==0);

        int diffnum= 0;
        if(zero  ) System.out.println();
        if(diffnum > 2 ) System.out.println();
        else if(diffnum == 1 ) System.out.println();
        else{
            System.out.println("Test");
        }



//        char[] chars = a.toCharArray();
//
//        System.out.println(chars[0]);
//
//        System.out.println(a.substring(0,2));

    }
}
