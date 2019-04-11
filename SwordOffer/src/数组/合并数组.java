package 数组;

import org.testng.annotations.Test;
import java.util.Arrays;

public class 合并数组 {

    @Test
    public void test() {
        //两个有序（倒序）整型数组A和B，将数组A和B合并，并要求合并后的数组依然是倒序
        int[] a=new int[]{98,96,90,88,78};
        int[] b=new int[]{97,95,94,82,80};

        mergeArray(a,b);
    }

    public void mergeArray(int[] a,int[] b){
        int N=a.length;
        int M=b.length;
        int[] c = new int[N + M];

        int i=0;
        int j=0;

        //比较两个数组的值,大的放进合并后的数组
        //一边取完取另一边
        for (int k=0;k<c.length;k++){

            if(i>=N){
                c[k]=a[j++];
            }else if(j>=M){
                c[k]=a[i++];
            }else if(a[i]>b[j]){
                c[k]=a[i++];
            }else {
                c[k]=b[j++];
            }
        }

        System.out.println(Arrays.toString(c));
    }
}
