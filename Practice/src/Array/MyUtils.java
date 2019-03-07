package Array;

import java.text.DecimalFormat;

public class MyUtils {
    private MyUtils(){
    }

    private static int count=0;
    private static final MyUtils myutils=new MyUtils();

    public static MyUtils getInstance(){
        return myutils;
    }

    public synchronized String getOnlyId(){
        count++;
        DecimalFormat decimalFormat = new DecimalFormat("00000000");
        String customerID = decimalFormat.format(count);
        return customerID;
    }
}
