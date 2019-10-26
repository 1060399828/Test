package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList){
        System.out.println("删除");
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入要删除书的id");
        String id = scanner.next();

        int i = 0;
        for (; i <bookList.getSize() ; i++) {
            Book book = bookList.getBooks(i);
            if (book.getId().equals(id)){
                break;
            }
        }
        if (i>=bookList.getSize()){
            System.out.println("不在范围内");
            return;
        }

        Book lastBook = bookList.getBooks(bookList.getSize()-1);
        bookList.setBooks(i,lastBook);
        bookList.setSize(bookList.getSize()-1);
        System.out.println("已删除");
    }
}
