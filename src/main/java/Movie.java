import org.sql2o.*;
import java.util.ArrayList;
import java.util.List;

public class Movie {
	private String name;
	private String yearOfPublish;
	private String aboutMovie;
	private String description;
	private  int id;
	private int rating;
	private String image;
	private int categoryId;

	public Movie(String name, String year, String aboutMovie, String description, int rating, String image, int categoryId) {
		this.name = name;
		this.yearOfPublish = year;
		this.aboutMovie = aboutMovie;
		this.description = description;
		this.rating = rating;
		this.image = image;
		this.categoryId = categoryId;
	}
//returns the name of movie
	public String getName() {
		return name;
	}
	//returns the year of publish
	public String getYear() {
		return yearOfPublish;
	}
	//returns a small description about the movie
	public String getAboutMovie() {
		return aboutMovie;
	}
	//returns the full description about the movie
	public String getDescription() {
		return description;
	}
	//returns the rating in integers
	public int getRating() {
		return rating;
	}
	//shows the image provided for the movie
	public String getImage() {
		return image;
	}
	//returns category Id
	public int getCategoryId() {
		return categoryId;
	}
}
