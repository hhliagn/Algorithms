package Array;

import org.junit.Test;

import java.util.Arrays;

public class 插入排序 {

    public void InsertSort(int[] a){


        for (int i=0;i<a.length-1;i++){

            //solve1
            /*int j=i+1;
            int v=a[j];
            while (v<=a[--j]){
                a[j+1]=a[j];
                if(j<=0){
                    break;
                }
            }

            a[j+1]=v;*/

            //solve2
            /*int j=i+1;
            int v=a[j];
            for (;j>0&&v<=a[j-1];j--){
                a[j]=a[j-1];
            }
            a[j]=v;*/

            //solve3
            for (int j=i+1;j>0&&a[j]<a[j-1];j--){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
            }
        }
    }

    @Test
    public void test(){
        int[] a={1,2,3,2,4,2,5,2,3};
        InsertSort(a);
        System.out.println(Arrays.toString(a));
    }
}
