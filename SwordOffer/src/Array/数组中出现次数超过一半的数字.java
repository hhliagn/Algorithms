package Array;

import org.junit.Test;

public class 数组中出现次数超过一半的数字 {

    /**
     * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
     * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
     * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
     */

    public int MoreThanHalfNum_Solution(int [] array) {

        int count=0; //记录各个数出现的次数
        int max=0;   //记录出现最多的次数
        int num=0;   //记录出现次数最多的数

        for (int j=0;j<array.length;j++){

            //遍历数组,找到一个和当前数相等的数,count+1
            for (int i=0;i<array.length;i++){
                if(array[i]==array[j]){
                    count++;
                }
            }

            //该数出现的次数是否最大
            if(count>max){
                max=count;
                num=array[j];
            }

            //计数器清零
            count=0;
        }

        //是否超过数组长度的一半
        if(max>array.length/2){
            return num;
        }else {
            return 0;
        }
    }

    @Test
    public void test(){
        int[] a={1,2,3,2,4,2,5,2,3};
        System.out.println(MoreThanHalfNum_Solution(a));
    }
}
