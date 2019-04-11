package 数组;

public class g数组中的逆序对 {

    /**
     * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
     * 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
     *
     *
     * 题目保证输入的数组中没有的相同的数字   数据范围：
     * 对于%50的数据,size<=10^4
     * 对于%75的数据,size<=10^5
     * 对于%100的数据,size<=2*10^5
     *
     * 输入: 1,2,3,4,5,6,7,0
     * 输出: 7
     */

    private long cnt=0; //注意这里要用long
    private int[] tmp;

    public int InversePairs(int[] a) {
        tmp = new int[a.length];
        mergeSort(a, 0, a.length - 1);
        return (int) (cnt % 1000000007);
    }

    private void mergeSort(int[] a, int l, int h) {
        if (h<=l){
            return;
        }

        int m=l+(h-l)/2;
        mergeSort(a,l,m);
        mergeSort(a,m+1,h);
        merge(a,l,m,h);
    }

    private void merge(int[] a, int l, int m, int h) {

        int i=l;int j=m+1;int k=l;

        while (i<=m||j<=h){

            if (i>m){
                tmp[k]=a[j++];
            }else if (j>h){
                tmp[k]=a[i++];
            }else if (a[i]<a[j]){
                tmp[k]=a[i++];
            }else {
                tmp[k]=a[j++];
                this.cnt+=m-i+1; //a[i]>=a[j],说明 nums[i...mid] 都大于 nums[j]
            }

            k++;
        }

        for (k=l;k<=h;k++){
            a[k]=tmp[k];
        }
    }
}
