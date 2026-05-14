package cn.hnzj.Ldl;

import java.util.Random;
import java.util.Scanner;

public class Randomtest 


{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Hellw");
        System.out.print("请输入要猜的数字：");
        Random r = new Random();

        int b = r.nextInt(100);
        while(true){
            int a = sc.nextInt();
            if(a>b){
                System.out.println("偏大了");
            }
           if (a<b){
               System.out.println("偏小了");
           }
           if (a==b){
               System.out.println("猜中了");
               break;
           }

        }

    }

}
