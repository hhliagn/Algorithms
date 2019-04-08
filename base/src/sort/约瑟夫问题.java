package Array;

import org.junit.Test;
import java.util.Arrays;

public class 约瑟夫问题 {

    /**
     * 有n个人,从第k个人开始报数,数到m的人出列,下一人继续从1开始数,数到m的人出列,求最后出列的人
     */

    private int n=25; //初始人数
    private int k=10; //开始位置
    private int m=5;  //报数长度

    @Test
    public void findLastOne(){

        int[] a = new int[n+1];

        for (int i=0;i<=n;i++){
            a[i]=1;
        }

        //辅助显示
        int[] c = new int[n+1];
        for (int i=0;i<=n;i++){
            c[i]=i;
        }

        while (true){

            if(n==1){
                break;
            }

            int out=k+m-1;

            if(out>n){
                out-=n;
            }

            for (int i=out;i<n;i++){
                a[i]=a[i+1];
            }

            n--;
            k=out;


            //显示效果
            c[out]=8; //显示出列者的位置
            for (int i=n+1;i<=25;i++){
                c[i]=5; //不为5的为剩下的队列
            }
            System.out.println(Arrays.toString(c));
        }
    }
}
