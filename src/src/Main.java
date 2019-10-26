import book.BookList;
import user.Admin;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user =login();

        while(true){
            int choice = user.menu();
            user.doOperation(choice,bookList);
        }
    }
    public static User login(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入名称");
        String name = scanner.next();
        System.out.println("请输入身份");
        int role = scanner.nextInt();
        if (role == 1){
            return new NormalUser(name);
        }
        return new Admin(name);
    }
}
