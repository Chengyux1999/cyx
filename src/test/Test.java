package test;

import service.ServiceTest;
import service.Testimpl;

import java.util.concurrent.CompletableFuture;

public class Test {
    public static void main(String[] args) {
//        ServiceTest serviceTest=(int x)->{
//            System.out.println(x);
//        };
//        serviceTest.eat(10);

        Testimpl.cat(b->{
            System.out.println(b);
        });

//        ServiceTest serviceTest2=new ServiceTest() {
//            @Override
//            public void eat(int a) {
//                System.out.println(a);
//            }
//        };
//        serviceTest2.eat(100);
//
//        CompletableFuture.runAsync(()->{
//            System.out.println("sss");
//        });
//
//        CompletableFuture.runAsync(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(111);
//            }
//        });



    }
}
