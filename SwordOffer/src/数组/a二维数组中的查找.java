package 数组;

import org.junit.Test;

public class a二维数组中的查找 {

    /**
     * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
     * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     */

    public boolean find(int[][] a,int key){

        if (a==null||a.length==0||a[0].length==0){
            return false;
        }

        int rows=a.length;
        int cols=a[0].length;

        int r=0;
        int c=cols-1;

        while (r<=rows-1&&c>=0){
            if (key==a[r][c]){
                return true;
            }else if (key<a[r][c]){
                c--;
            }else {
                r++;
            }
        }

        return false;
    }

    @Test
    public void test(){

        int[][] a =
                {
                        {1,4,7,11,15},
                        {2, 5, 8, 12, 19},
                        {3, 6, 9, 16, 22},
                        {10, 13, 14, 17, 24},
                        {18, 21, 23, 26, 30}
                };

        System.out.println(find(a, 18));
    }
}
