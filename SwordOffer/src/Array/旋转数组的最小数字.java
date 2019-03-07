package Array;

import org.junit.Test;

public class 旋转数组的最小数字 {

    /**
     * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
     * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
     * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
     * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
     */

    public int minNumberInRotateArray(int [] array) {

        //数组旋转后分为两个有序数组
        //最小值为第二个有序数组的第一个元素
        //可以用二分法查找,达到O(lgN)时间
        if(array.length==0){
            return 0;
        }

        int lo=0;
        int hi=array.length-1;
        int temp=0; //存放最小值的指针

        while (lo<hi){
            int mid=lo+(hi-lo)/2;
            if(array[mid]>array[hi]){
                lo=mid+1; //如果mid大于hi,那么mid位于第一个有序数组
            }else if(array[mid]<array[hi]){
                hi=mid-1; //如果mid小于hi,那么mid位于第二个有序数组
            }

            temp=mid;
        }

        return array[temp];
    }

    @Test
    public void test(){

        int[] a = {3,4,5,6,7,1,2};
        System.out.println(minNumberInRotateArray(a));
    }
}
