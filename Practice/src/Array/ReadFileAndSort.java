package Array;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFileAndSort {
    public static void main(String[] args) throws IOException {
        File file1=new File("1.txt");
        File file2=new File("2.txt");

        FileInputStream fileInputStream=new FileInputStream(file1);
        StringBuilder stringBuilder1=new StringBuilder();
        int len=0;
        byte[] buffer=new byte[1024];
        while ((len=fileInputStream.read(buffer))!=-1){
            String s = new String(buffer, 0, len);
            stringBuilder1.append(s);
        }

        String str1 = stringBuilder1.toString();
        String[] strArray = str1.split(",");

        int[] a = new int[strArray.length];
        int i=0;
        for (String s : strArray) {
            a[i++]=Integer.valueOf(s);
        }

        for (int i1 = 0; i1 < a.length; i1++) {
            for (int i2=1;i2< a.length-i1;i2++){
                if(a[i2]>a[i2-1]){
                    int temp=a[i2];
                    a[i2]=a[i2-1];
                    a[i2-1]=temp;
                }
            }
        }


        StringBuilder stringBuilder2 = new StringBuilder();
        for (int i1 = 0; i1 < a.length; i1++) {
            String s = String.valueOf(a[i1]);
            stringBuilder2.append(s);
            if(i1+1!=a.length){
                stringBuilder2.append(",");
            }
        }

        String str2 = stringBuilder2.toString();
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        fileOutputStream.write(str2.getBytes(),0,str2.length());

    }
}
