import javax.swing.JFrame;

public class Netflix {

	public static void main(String[] args) {
		// Question 1
	Movie starwars  = new Movie("Star Wars", 5);
	Movie thor = new Movie("Thor", 4);
	Movie Kung_Fu_Panda = new Movie("Kung Fu Panda", 3);
	Movie batman = new Movie("Batman", 2);
	Movie IndianaJones = new Movie("Indiana Jones", 1);
	
	
	
//Question 2	
	System.out.println("Batman  " +  starwars.getTicketPrice());
	//Question 3
	NetflixQueue netflixqueue = new NetflixQueue();
	//Question 4
	netflixqueue.addMovie(batman);
	netflixqueue.addMovie(thor);
	netflixqueue.addMovie(starwars);
	netflixqueue.addMovie(IndianaJones);
	netflixqueue.addMovie(Kung_Fu_Panda);
	//Question 5
	netflixqueue.printMovies();
	//Question 6
	System.out.println("the best movie is" +  netflixqueue.getBestMovie());
	//Question 7
	netflixqueue.sortMoviesByRating();
	System.out.println("The second best movie is" + netflixqueue.getMovie(1));
	}

}
