package bookStore;

public class BookStore {

    public static void main (String[] args) {

        Author james = new Author("James Horne");
        Author mike = new Author("Mike Kearns");
        Author chris = new Author("Chris Dare");

        Book bestUncle = new Book("Best Uncle", 500, james);
        Book partner = new Book("Keeping My Partner Alive", 200, mike);
        Book soundingBoard = new Book("How to be an Extreme Sounding Board", 400, chris);



    }

}
