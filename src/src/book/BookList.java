package book;

public class BookList {
    private Book[] books = new Book[100];
    private int size;

    public BookList(){
        books[0] = new Book("西游记","001","吴承恩",
                100,"古典名著",false);
        books[1] = new Book("水浒传","002","施耐庵",
                100,"古典名族",false);
        books[2] = new Book("红楼梦","003","曹雪芹",
                100,"古典名著",false);
        size = 3;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Book getBooks(int index) {
        return books[index];
    }

    public void setBooks(int index,Book book) {
        books[index] = book;
    }
}
