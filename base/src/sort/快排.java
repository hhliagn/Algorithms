package sort;

public class 快排 {

    //分治思想
    //选取一个切分点
    //一轮排序结束后,左边的数都比切分点小,右边的数都比切分点大

    //快排是不稳定的
    //最坏情况下时间复杂度为O(n2)
    //平均情况下时间复杂度为O(nlogn)

    public void sort(int[] a){
        sort(a,0,a.length-1);
    }


    public void sort(int[] a,int lo,int hi){

        //规模=1为退出条件
        if(hi<=lo){
            return;
        }

        //切分点
        int j=partition(a,lo,hi);

        //递归解决两个子问题
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }

    private int partition(int[] a, int lo, int hi) {

        //两个指针
        int i=lo;
        int j=hi+1;

        //选取首元素为切分点
        int v=a[lo];

        while (true){

            while (a[++i]<v){ //直到遇到一个比v大的数
                if(i==hi){
                    break;
                }
            }

            while (a[--j]>v){ //直到遇到一个比v小的数
                if(j==lo){
                    break;
                }
            }

            //指针相遇退出
            if (i > j) {
                break;
            }

            //交换i,j
            exch(a,i,j);
        }

        //切分点归位
        exch(a,lo,j);
        return j;
    }

    private void exch(int[] a, int i, int j) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
