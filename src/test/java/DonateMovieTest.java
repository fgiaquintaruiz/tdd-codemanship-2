import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DonateMovieTest {

    Library library;
    Movie movie;

    public DonateMovieTest(){
        library = new Library();
        movie = new Movie();
    }

    @Test
    public void movieAddedToCatalogue(){
        library.donate(movie);
        Assertions.assertTrue(library.contains(movie));
    }

    @Test
    public void rentalCopyAdded(){
        library.donate(movie);
        Assertions.assertEquals(1, movie.getCopies());
    }

}
