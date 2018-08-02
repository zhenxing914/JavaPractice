package helloworld.DynamicPlanning;

/**
 *
 * 数量num为5 包的value体积为10
 *
 * Created by song on 2018/7/10.
 */
public class package0_1 {

    public static void main(String[] args) {

        int num =5;                       //数量
        int packageCapacity = 10;        //容量

        int weight[] = {0,2,2,6,5,4};
        int value[] = {0,6,3,5,4,6};

        int table[][] = new int[num+1][packageCapacity+1];

        for(int i=1;i<=num;i++){
            for(int j=1;j<=packageCapacity;j++){
                if(weight[i]>j) {
                    table[i][j] = table[i-1][j];
                }else {
                    table[i][j] = Math.max(table[i-1][j],table[i-1][j-weight[i]]+value[i]);
                }
            }
        }
        System.out.println("最大的价值是："+table[num][packageCapacity]);
    }
}
