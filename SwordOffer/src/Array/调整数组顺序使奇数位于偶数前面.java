package Array;

import org.junit.Test;
import java.util.Arrays;

public class 调整数组顺序使奇数位于偶数前面 {

    /**
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
     * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
     * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
     */

    public void reOrderArray(int [] array) {

        //solve1
        //冒泡排序解法
        boolean isChange=false;

        while (true){

            isChange=false;

            //一一比较两个数,前偶后奇则交换
            for (int i=0;i< array.length-1;i++){
                if (array[i]%2==0&&array[i+1]%2!=0){
                    int temp=array[i+1];
                    array[i+1]=array[i];
                    array[i]=temp;

                    //发生交换
                    isChange=true;
                }
            }

            //如果没有再发生交换说明符合条件则可以退出
            if (!isChange){
                break;
            }
        }


        //solve2
        //插入排序思路
        for (int i=1;i<array.length;i++){

            //如果是奇数,需要调整
            int target=array[i];
            if(target%2!=0){

                int j;
                for (j=i-1;j>=0;j--){

                    //遇到一个偶数,后移一位
                    if (array[j]%2==0){
                        array[j+1]=array[j];
                    }else {

                        //遇到一个奇数,退出
                        break;
                    }
                }

                //把原来的奇数放到空出的位置上
                array[j+1]=target;
            }
        }
    }

    @Test
    public void test(){

        int[] ints = {1, 2, 3, 4, 5, 6, 7};
        reOrderArray(ints);
        System.out.println(Arrays.toString(ints));
    }
}
