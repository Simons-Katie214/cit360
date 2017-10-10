/**
 *
 * @author klsim
 */
package javacollections;
import java.util.*;

public class JavaCollections {

    public static void main(String[] args) {
       List a1 = new ArrayList();
		a1.add("BigBang");
		a1.add("Epik High");
		a1.add("EXO");
                a1.add("BTS");
                a1.add("iKon");
                a1.add("2NE1");
                a1.add("Got7");
                a1.add("2PM");
                a1.add("FT Island");
                a1.add("CNBlue");
		System.out.println("Kpop Bands");
		System.out.print("\t" + a1);
		List l1 = new LinkedList();
		l1.add("G-Dragon");
		l1.add("Dara");
		l1.add("Tablo");
                l1.add("Bobby");
                l1.add("JB");
                l1.add("V");
                l1.add("Luhan");
                l1.add("Hongki");
                l1.add("YoungHwa");
                l1.add("Junho");
		System.out.println();
		System.out.println("Singers");
		System.out.print("\t" + l1);
		Set s1 = new TreeSet(); 
		s1.add("G-Dragon at YG Entertainment");
		s1.add("Tablo at YG Entertainment");
		s1.add("Bobby at YG Entertainment");
		s1.add("Dara at YG Entertainment");
                s1.add("JB at JYP Entertainment");
                s1.add("V at BigHit Entertainment");
                s1.add("Luhan at SM Entertainment");
                s1.add("Hongki at FNC Entertainment");
                s1.add("YoungHwa at FNC Entertainment");
                s1.add("Junho at JYP Entertainment");
		System.out.println();
		System.out.println("Singers and Agencies");
		System.out.print("\t" + s1);
		Map m1 = new HashMap(); 
		m1.put("Tablo", "Epik High");
		m1.put("G-Dragon", "BigBang");
		m1.put("Dara", "2NE1");
		m1.put("Bobby", "iKon");
                m1.put("V", "BTS");
                m1.put("JB", "Got7");
                m1.put("Luhan", "EXO");
                m1.put("Hongki", "FT Island");
                m1.put("YoungHwa", "CNBlue");
                m1.put("Junho", "2PM");
		System.out.println();
		System.out.println("Singers and Bands");
		System.out.print("\t" + m1);
    }
    
}
