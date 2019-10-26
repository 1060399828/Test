package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList){
        System.out.println("借阅图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书的id");
        String id =scanner.next();
        for (int i = 0; i <bookList.getSize() ; i++) {
            Book book = bookList.getBooks(i);
            if (!book.getId().equals(id)){
                continue;
            }
            if (book.isBorrowed()){
                System.out.println("书被借走");
                break;
            }
            book.setBorrowed(true);
        }
    }
}
