package helloworld.DynamicPlanning;

import java.util.Scanner;

/**
 * Created by song on 2018/7/9.
 *
 * 求插入最少的树获得一个回文数
 *
 */
public class PalindromicNumber {

    public static void main(String[] args) {

        String str;
        Scanner scanner =new Scanner(System.in);
        str = scanner.next();
        int num = str.length();
        char charactors[] = str.toCharArray();
        System.out.println(str+"length:"+num);
        int dp[][]= new int[num][num];

        for(int i = num-1;i >=0;i--) {
            for (int j = i + 1; j < num ; j++) {
                if (charactors[i] == charactors[j]) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = min(dp[i + 1][j], dp[i][j - 1]) + 1;
                }
            }
        }

        System.out.println("result :"+ dp[0][num-1]);

    }

    public static int min(int a,int b){
        if(a<b)
            return a;
        else
            return b;
    }

}
