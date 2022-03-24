package bookShelf;

public class AppRunner {

    public static void main(String[] args) {
        Book book = new Book(11, "Object oriented programming", "knoxxie");

//        Review review =  new Review(10, "text", 9);
//        book.addReview(review);
        book.addReview(new Review(123, "Very informative ", 9));
        book.addReview(new Review(1122, "Not very usefull for experts", 6));


        System.out.println(book);
    }
}
