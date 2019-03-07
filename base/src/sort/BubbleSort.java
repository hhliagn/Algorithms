package sort;

public class BubbleSort {

    public void sort(int[] a){

        //第一轮,相邻的数两两比较,最大的数移动到数组末尾
        //第二轮,从头开始,相邻数两两比较,最大的数移动到数组末尾-1

        //冒泡排序是稳定的
        //时间复杂度O(n2)

        for (int i=0;i<a.length;i++){
            for (int j=1;j<a.length-i;j++){
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
    }
}
