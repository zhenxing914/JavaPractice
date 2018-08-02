package helloworld.DynamicPlanning;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by song on 2018/7/9.
 *
 */
public class CrossRiver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =scanner.nextInt();

        int veryOneSpentTime[] = new int[num];
        scanner = new Scanner(System.in);
        for(int i=0;i<num;i++)
        {
           veryOneSpentTime[i] = scanner.nextInt();
        }
        Arrays.sort(veryOneSpentTime);

        int opt[] = new int[num];

        opt[0]=0;
        opt[1]= veryOneSpentTime[1];

        for(int i=2 ;i<num;i++) {
            opt[i]=min(opt[i-1]+veryOneSpentTime[0]+veryOneSpentTime[i],
                    opt[i-2]+veryOneSpentTime[0]+veryOneSpentTime[i]+2*veryOneSpentTime[1]);
        }
        System.out.println(opt[num-1]);
    }

    public static int min(int a,int b )
    {
        if(a<b)
        {
            return a;
        }
        else
            return b;
    }
}
