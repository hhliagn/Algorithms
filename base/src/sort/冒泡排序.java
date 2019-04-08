package Array;

import org.junit.Test;

import java.util.Arrays;

public class 冒泡排序 {

    //1.从头开始,把相邻的两个数一一比较,把最大的放在最右边
    //2.从头开始...
    //时间为:O(N^2)
    public void BubbleSort(int[] a){
        int N=a.length;
        for (int i=0;i<N;i++){
            for (int j=1;j<N-i;j++){
                if(a[j]<a[j-1]){
                    int temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }
        }
    }

    @Test
    public void test(){
        int[] a = {32, 48, 66, 55, 27, 16, 5, 10};
        BubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
