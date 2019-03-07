package Array;

import org.junit.Test;

import java.util.Arrays;

public class 快速排序 {

    @Test
    public void test(){

        int[] a = {10, 20, 55, 24, 33, 46, 58, 70};
        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public void quickSort(int[] a,int lo,int hi){

        if(lo>=hi){
            return;
        }

        int j=patrition(a,lo,hi); //切分指针
        quickSort(a,lo,j-1);
        quickSort(a,j+1,hi);

    }

    private int patrition(int[] a, int lo, int hi) {

        int i=lo;
        int j=hi+1;
        int v=a[lo];

        while (true){

            while (a[++i]<v){
                if(i==hi){
                    break;
                }
            }
            while (a[--j]>v){
                if(j==lo){
                    break;
                }
            }

            if(i>=j){
                break;
            }

            exch(a,i,j);
        }

        exch(a,lo,j);
        return j;
    }

    private void exch(int[] a, int i, int j) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
