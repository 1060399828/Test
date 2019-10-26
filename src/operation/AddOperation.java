package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList){
        System.out.println("请输入你的操作");
        Scanner scanner = new Scanner(System.in);
        System.out.println("书名");
        String name = scanner.next();
        System.out.println("编号");
        String id = scanner.next();
        System.out.println("作者");
        String author = scanner.next();
        System.out.println("价格");
        int price = scanner.nextInt();
        System.out.println("类型");
        String type = scanner.next();
        Book book = new Book(name,id,author,price,type,false);
        bookList.setBooks(bookList.getSize(),book);
        bookList.setSize(bookList.getSize()+1);
    }
}
