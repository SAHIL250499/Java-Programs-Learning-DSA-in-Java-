package Strings;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name="   Sahil              Patil    ";
        System.out.println(reverseWords(name));
    }
    static String reverseWords(String s) {
        String[] stippedarr=s.strip().split("\\s+");
        StringBuilder res=new StringBuilder();
        for(int i=stippedarr.length-1;i>=0;i--){
            res.append(stippedarr[i]);
            if(i!=0){
                res.append(" ");
            }
        }
        return res.toString();
    }
}
