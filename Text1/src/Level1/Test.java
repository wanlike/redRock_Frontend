package Level1;

public class Test {
    public static void main(String[] args) {
        String str = "acbdw,1269547,AASIDX,AIUydjs,12sjaA,3819247,ausSHSzio,IUFISsi";
        String[] str1 = str.split(",");
        CheckString cs = new CheckString();
        cs.mySortString(str1[6]);
    }

}
