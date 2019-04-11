package 数组;

import org.junit.Test;
import java.util.Arrays;

public class c调整数组顺序使奇数位于偶数前面 {

    /**
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
     * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
     * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
     */

    //冒泡
    public void reOrderArray(int [] array) {

        int n=array.length-1;

        while (true){

            boolean b=false;

            for (int i=0;i<n;i++){
                if (array[i]%2==0 && array[i+1]%2==1){
                    b=true;
                    swap(array,i,i+1);
                }
            }

            if (!b){
                break;
            }
        }
    }
    private void swap(int[] array, int i, int j) {

        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    //辅助数组复制
    public void reOrderArray1(int [] array){

        int oddCnt=0;
        for (int num:array){
            if (num%2==1){
                oddCnt++;
            }
        }

        int[] nums=array.clone();
        int i=0,j=oddCnt;
        for (int num:nums){
            if (num%2==1){
                array[i++]=num;
            }else {
                array[j++]=num;
            }
        }
    }


    @Test
    public void test(){

        int[] ints = {1, 2, 3, 4, 5, 6, 7};
        reOrderArray(ints);
        //reOrderArray1(ints);
        System.out.println(Arrays.toString(ints));
    }
}
