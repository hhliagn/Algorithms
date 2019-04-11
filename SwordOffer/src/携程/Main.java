package 携程;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public void reverse(){
        Scanner sc=new Scanner(System.in);
        String next = sc.next();
        String[] nums = next.split(",");

        int length=nums.length;
        int k = sc.nextInt();
        int n=length/k;

        int[] ints = new int[length];
        int t=0;
        for (String num:nums){
            ints[t++]=Integer.valueOf(num);
        }

        for (int i=1;i<=n;i++){
            swap(ints,(i-1)*k,i*k-1);
        }

        System.out.println(Arrays.toString(ints));
    }

    private void swap(int[] ints, int i, int j) {
        while (i<j){
            int temp=ints[i];
            ints[i]=ints[j];
            ints[j]=temp;

            i++;
            j--;
        }
    }
}
