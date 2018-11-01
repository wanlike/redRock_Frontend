package Level1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class CheckString {
    public boolean isNumber(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }
    public boolean isUpperLetter(String str){
        Pattern pattern = Pattern.compile("[A-Z]*");
        return pattern.matcher(str).matches();
    }
    public boolean isLowerLetter(String str){
        Pattern pattern = Pattern.compile("[a-z]*");
        return pattern.matcher(str).matches();
    }
    private boolean isLetter(String str){
        Pattern pattern = Pattern.compile("[a-zA-Z]*");
        return pattern.matcher(str).matches();
    }
    public String UpperStr(String str){
        if(isLetter(str)){
            return str.toUpperCase();
        }else {
            return null;
        }
    }
    public int[] mySortNumber(String str){
        if(isNumber(str)){
            List<String> arry = new ArrayList<>();
            for(int i=0;i<str.length()-1;i++){
                arry.add(String.valueOf(str.charAt(i)));
            }
            Collections.sort(arry);
            int[] arry1 = new int[arry.size()];
            for(int i=0;i<arry.size();i++){
                arry1[i] = Integer.parseInt(arry.get(i));
                System.out.print(arry.get(i));
            }
            return arry1;
        }else {
            return null;
        }
    }
    public String[] mySortString(String str){
        if(isLetter(str)){
            List<String> arry = new ArrayList<>();
            for(int i=0;i<str.length()-1;i++){
                arry.add(String.valueOf(str.charAt(i)));
            }
            Collections.sort(arry);
            String[] arry1 = new String[arry.size()];
            for(int i=0;i<arry.size();i++){
                arry1[i] = arry.get(i);
                System.out.print(arry.get(i));
            }
            return arry1;
        }else {
            return null;
        }
    }
}
