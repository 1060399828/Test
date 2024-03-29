package user;

import operation.*;

import java.util.Scanner;

public class NormalUser extends User{
    public NormalUser(String name){
        super(name);
        operations = new IOperation[]{
          new ExitOperation(),
          new FindOperation(),
          new BorrowOperation(),
          new ReturnOperation()
        };
    }

    @Override
    public int menu(){
        System.out.println("==========");
        System.out.println("1.查找书籍");
        System.out.println("2.借阅书籍");
        System.out.println("3.归还书籍");
        System.out.println("0.退出");
        System.out.println("==========");
        System.out.println("请输入你的选择");
        Scanner scanner =new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
