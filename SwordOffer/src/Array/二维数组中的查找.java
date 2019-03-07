package Array;

import org.junit.Test;

public class 二维数组中的查找 {

    /**
     * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
     * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     */

    public boolean find(int[][] a,int key){

        int M=a.length;
        int N=a[0].length;

        //solve1
        /*for (int i=0;i<M;i++){
            for (int j=0;j<N;j++){
                if(key>a[i][j]){
                    continue;
                }else if(key==a[i][j]){
                    return true;
                }
            }
        }*/

        //solve2
        int i=0;
        int j=N-1;

        while (i<M&&j>=0){
            if(key<a[i][j]){
                j--; //如果这一列比key大,剔除这一列
            }else if(key>a[i][j]){
                i++; //如果这一行比key小,剔除这一行
            }else {
                return true;
            }
        }

        return false;
    }

    @Test
    public void test(){

        int[][] a = new int[10][5];

        int M=a.length;
        int N=a[0].length;

        for (int i=0;i<M;i++){
            for (int j=0;j<N;j++){
                a[i][j]=i+j;
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(find(a, 0));
    }

}
