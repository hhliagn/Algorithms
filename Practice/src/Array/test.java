package Array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class test {
    public static void main(String[] args) {

        String str=null;

        try {
            if(str.equals(null)){
                System.out.println("1");
            }

            ArrayList<Object> objects = new ArrayList<>();
            Iterator<Object> iterator = objects.iterator();
        }catch (Exception e){
            System.out.println("2");
        }
    }

    @Test
    public void test(){
        MyUtils myUtils = MyUtils.getInstance();
        for (int i=0;i<500;i++){
            System.out.println(myUtils.getOnlyId());
        }
    }
}
