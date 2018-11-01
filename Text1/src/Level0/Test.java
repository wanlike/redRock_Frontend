package Level0;

import com.google.gson.Gson;

public class Test {
    public static void main(String[] args) {
        Girfriend girfriend = new Girfriend();
        girfriend.setAge(22);
        girfriend.setHeight("160");
        girfriend.setName("小红");
        String json = new Gson().toJson(girfriend);
        System.out.println(json);
    }
}
