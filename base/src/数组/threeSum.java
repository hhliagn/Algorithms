package 数组;

import org.junit.Test;

public class threeSum {

    public int threeSum(int[] a){

        int n=a.length;
        int count=0;

        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                for (int k=j+1;k<n;k++){
                    if(a[i]+a[j]+a[k]==0){
                        System.out.println(a[i]+" "+a[j]+" "+a[k]);
                        count++;
                    }
                }
            }
        }

        return count;
    }

    @Test
    public void test(){

        int[] a={-123,24,96,112,38,120,3,-5,17,-19};
        System.out.println(threeSum(a));
    }
}
