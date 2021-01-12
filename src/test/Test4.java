package test;

import pojo.BaoHanUser;
import pojo.User;

import java.util.HashMap;
import java.util.Map;

public class Test4 {
    public static void main(String[] args) {
        User user=new User();
        user.setAge(18);
        user.setName("limo");
        BaoHanUser baoHanUser=new BaoHanUser();
        baoHanUser.setUser(user);
        user.setName("momo");
        System.out.println(baoHanUser);


        Map<String,String> map=new HashMap<>();
        Test4 test4=new Test4();
        test4.test2(map);

    }

    public String test2(Map<String,String> map){
        map.put("cyx","ss");
        System.out.println(map);
        map.put("type","3");
        System.out.println(map);
        return map.get("cyx");
    }


}
