package sort;

public class Insertsort {

    public void sort(int[] a){

        //构建有序序列
        //对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入

        //插入排序
        //最优时间复杂度O(n)
        //平均时间复杂度O(n2)

        for (int i=0;i<a.length;i++){
            for (int j=i;j>0&&a[j]<a[j-1];j--){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
            }
        }
    }
}
