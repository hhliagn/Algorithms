package 携程;

import java.util.*;

public class Main2 {

    public void countClass(){

        Scanner sc=new Scanner(System.in);
        int pathNum = sc.nextInt();
        String[] strings = new String[pathNum];
        int k=0;
        while (sc.hasNext()){
            String next = sc.next();
            strings[k++]=next;
        }

        List<Map> list=new ArrayList<>();
        for (String str:strings){
            String substring = str.substring(1, str.length());
            String[] split = substring.split("/");

            Map<String,Integer> map=new HashMap<>();
            for (String s:split){
                map.put(s,1);
            }

            list.add(map);
        }

        for (int i=1;i<strings.length;i++){

            if (strings[i].equals(strings[i-1])){

               list.get(i);
            }


        }


    }
}
