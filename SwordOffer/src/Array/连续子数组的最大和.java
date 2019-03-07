package Array;

import org.junit.Test;

public class 连续子数组的最大和 {

    /**
     * HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。
     * 今天测试组开完会后,他又发话了:在古老的一维模式识别中,
     * 常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
     * 但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？例如:{6,-3,-2,7,-15,1,2,2},
     * 连续子向量的最大和为8(从第0个开始,到第3个为止)。
     * 给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)
     */

    public int FindGreatestSumOfSubArray(int[] array) {

        int sum=0;
        int max=0;
        int count=0;


        for (int i=0;i<array.length;i++){

            int h=array.length-i;
            for (int j=0;j<=array.length-h;j++){
                for (int k=j;k<j+h;k++){
                    sum+=array[k];
                }

                if(count==0){
                    max=sum;
                    count+=1;
                }

                if(sum>max){
                    max=sum;
                }

                sum=0;
            }
        }

        return max;
    }

    @Test
    public void test(){
        int[] a={-2,-8,-1,-5,-9};
        System.out.println((FindGreatestSumOfSubArray(a)));
    }
}
