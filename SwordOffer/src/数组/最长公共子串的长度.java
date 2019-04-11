package 数组;

public class 最长公共子串的长度 {

    public static void main(String[] args)  {

        String s2= "GCCCTAGCCAGDE";
        String s1= "GCGCCAGTGDE";

        System.out.println(getMaxLength(s1,s2));
        System.out.println(getMaxLength(s1,s2).length());
    }

    public static String getMaxLength(String str1, String str2) {

        //flag for break
        boolean flag = false;

        String s1 = str1;
        String s2 = str2;
        String string = new String("");

        //find the shorter str
        if (s1.length() > s2.length()) {
            string = s1;
            s1 = s2;
            s2 = string;
        }

        //core
        for (int i = s1.length(); i > 0; i--) {
            for (int n = 0; n<= s1.length() - i; n++) {
                if (s2.contains(s1.substring(n, n + i))) {
                    string = s1.substring(n, n + i);  //substring():[ , )
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
        }

        return string;
    }
}
