package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
//        Map<String,String> beanMap=new HashMap<>();
//        beanMap.put("Query_Flag","1");
//        String[] signParam = {beanMap.get("Query_Flag")};
//        List<String> strings = Arrays.asList(signParam);
//        strings.forEach(System.out::println);
        String ss="是否已单独断网：是不是哇";
        System.out.println(ss.indexOf("是否已单独断网："));
        System.out.println(ss.indexOf("是否已单独断网：")+9);
        String substring = ss.substring(ss.indexOf("是否已单独断网"), ss.indexOf("是否已单独断网：")+9);
        System.out.println(substring);

    }
}
