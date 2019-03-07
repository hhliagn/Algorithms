package 编程题;

import java.util.Random;

public class 字符串生成器 {
    public static void main(String[] args) {
        String[] strings=generate();
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static String[] generate(){
        char[] chars = new char[62];
        int z=0;
        for (int i=97;i<=122;i++){
            chars[z++]=(char)i;
        }
        for (int j=48;j<=57;j++){
            chars[z++]=(char)j;
        }
        for (int k=65;k<=90;k++){
            chars[z++]=(char)k;
        }

        Random r=new Random();
        StringBuilder stringBuilder=null;
        String[] strings = new String[100];
        int q=0;

        for (int k = 0; k < 100; k++) {
            stringBuilder=new StringBuilder();

            int length=4;
            for (int i = 0; i < length; i++) {
                int p = r.nextInt(62);
                stringBuilder.append(chars[p]);
            }
            strings[q++]=stringBuilder.toString();
        }

        return strings;
    }
}
