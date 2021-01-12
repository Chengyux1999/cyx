package test;

import pojo.User;
import pojo.UserDto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<User> list=new ArrayList<>();
        User user1=new User(18,"zhangsan");
        User user2=new User(17,"lisi");
        User user3=new User(16,"wangwu");
        User user4=new User(19,"lisi");
        User user5=new User(11,"ccc");
        User user6=new User();
        User user7=new User();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

//        List<Integer> output = list.stream().map(User::getAge).distinct().collect(Collectors.toList());
//        output.forEach(System.out::println);
//
//paralleStream是异步的
        List<Integer> output2 = list.parallelStream().map(User::getAge).limit(1).collect(Collectors.toList());
        output2.forEach(System.out::println);
//
        Map<Integer, Integer> collect2 = list.parallelStream().collect(Collectors.toMap(User::getAge, User::getAge));
        Integer integer = collect2.get(16);
        System.out.println(integer);

        list.stream().limit(2).map(User::getName).collect(Collectors.toList());
        List<User> collect = list.stream().filter(t -> t.getAge() > 16).collect(Collectors.toList());
        collect.forEach(System.out::println);
        List<UserDto> collect1 = list.parallelStream().map(user -> {
            int age = user.getAge();
            String name = user.getName();
            UserDto userDto = new UserDto();
            userDto.setU_age(age);
            userDto.setU_name(name);
            return userDto;
        }).collect(Collectors.toList());
        collect1.forEach(System.out::println);

//        list.sort(new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                if (o1.getAge()> o2.getAge()){
//                    return 1;
//                }
//                else {
//                    return -1;
//                }
//            }
//        });
//        list.forEach(System.out::println);




    }
}
