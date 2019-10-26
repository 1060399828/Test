package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("还书操作");
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入要归还的书的id");
        String id =scanner.next();
        for (int i = 0; i <bookList.getSize() ; i++) {
            Book book =bookList.getBooks(i);
            if (!book.getId().equals(id)){
                continue;
            }
            if (!book.isBorrowed()){
                System.out.println("已归还");
                break;
            }
            book.setBorrowed(false);
        }
    }
}
