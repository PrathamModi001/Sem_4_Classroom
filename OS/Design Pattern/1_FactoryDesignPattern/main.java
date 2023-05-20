import review.*;

public class main {
    public static void main(String[] args) {
        MovieFactory factory = new MovieFactory();
        IMDB obj = factory.getMovie("Science Fiction");
        obj.my_review();
    }
}
