package 数组;

import org.junit.Test;

public class b旋转数组的最小数字 {

    /**
     * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
     * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
     *
     * 例如:
     *  数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
     *
     * NOTE：
     *  给出的所有元素都大于0
     *  若数组大小为0，请返回0
     */

    public int minNumberInRotateArray(int [] array) {

        if (array.length==0){
            return 0;
        }

        int l=0;
        int h=array.length-1;

        while (l<h){

            int m=l+(h-l)/2;
            if (array[l]==array[m]&&array[m]==array[h]){
                return minNumber(array,l,h);
            }else if (array[m]<=array[h]){
                h=m;
            }else {
                l=m+1;
            }
        }

        return array[l];
    }

    private int minNumber(int[] array, int l, int h) {

        for (int i=l;i<h;i++){
            if (array[i]>array[i+1]){
                return array[i+1];
            }
        }

        return array[l];
    }

    @Test
    public void test(){

        int[] a = {3,4,5,6,7,1,2};
        System.out.println(minNumberInRotateArray(a));
    }
}
