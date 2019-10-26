package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("查找");
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入要找的书的名称");
        String name = scanner.next();
        int count = 0;
        for (int i = 0; i <bookList.getSize() ; i++) {
            Book book =bookList.getBooks(i);
            if (book.getName().equals(name)){
                System.out.println(book);
                count++;
            }
        }
        if (count == 0){
            System.out.println("没找到");
        }else {
            System.out.println("这本书有"+count+"本");
        }
    }
}
