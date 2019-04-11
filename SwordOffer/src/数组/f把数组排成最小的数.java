package 数组;

import java.util.Arrays;
import java.util.Comparator;

public class f把数组排成最小的数 {

    /**
     * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
     * 打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
     */

    public String PrintMinNumber(int [] numbers) {

        if (numbers==null||numbers.length==0){
            return "";
        }

        int n=numbers.length;
        String[] nums=new String[n];
        for (int i=0;i<n;i++){
            nums[i]=numbers[i]+"";
        }

        Arrays.sort(nums, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1+s2).compareTo(s2+s1);
            }
        });

        String ret="";
        for (String num:nums){
            ret+=num;
        }

        return ret;
    }
}
