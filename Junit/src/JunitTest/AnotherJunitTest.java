
package JunitTest;

import java.util.Arrays;

/**
 *
 * @author klsim
 */
public class AnotherJunitTest {
   public String[] moviesToSee() {

		String[] movies = {"Star Wars", "Zookeepers Wife", "Big Hero6"};

		System.out.println("Movies to watch: " + Arrays.toString(movies));

		return movies;
	}

	public String[] placesToGo() {

		String[] places = {"Korea", "Ireland", "Greece", "Japan", "China"};

		System.out.println("Places to visit: " + Arrays.toString(places));

		return places;
	}
    
    
}
