package 数组;

public class 最长连续子字符串 {

    public static void main(String[] args) {

        String src="GHbFVDeFgHIJCSZmKPoUY";
        System.out.println(findMaxString(src));;
    }

    public static String findMaxString(String src){

        String src0=src.toUpperCase();

        int length=1;//连续子串的长度
        int mark=0;  //连续子串开始的下标
        int max=0;   //最长子串的长度

        for (int i=0;i+1<src.length();i++){
            if((int)src0.charAt(i)==(int)src0.charAt(i+1)-1){
                length++;
            }else {
                if(length>max){
                    max=length;
                    length=1;
                    mark=i-max;
                }
            }

            continue;
        }

        String substring = src.substring(mark+1, mark+1 + max);
        return substring;

    }
}
