import java.util.concurrent.Executors;

public class testhashcode {
    public static void main(String[] args) {
        String s1=new String("monday");
        String s2=new String("monday");

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode()==s2.hashCode());

        StringBuilder stringBuilder;
        StringBuffer stringBuffer;
        String str;

        int c=10;
        int b=12;
        int i = testReturn(c,b);
        System.out.println(i);
    }

    public static int testReturn(int c,int b){
        try {
            c++;
            return c;
        }catch (Exception e){

        }finally {
            b++;
            return b;
        }
    }
}
