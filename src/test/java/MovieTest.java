import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;

public class MovieTest {
	// @Rule
  // public DatabaseRule database = new DatabaseRule();

	private Movie testMovie;
	@Before
	public void instanciate() {
			testMovie = new Movie("the great debaters", "1990", "a movie about ", "my full description", 5, "my image", 1);
	}

	// creating an instance of Movie successfully
	@Test
	public void Movie_instantiatesCorrectly_true() {
		assertEquals(true, testMovie instanceof Movie);
	}

}
