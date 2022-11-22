package arrayListTyped;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("İstanbul");
		cities.add("Ankara");
		cities.add("Nevşehir");
		cities.add("Mardin");
		
	    cities.remove("İstanbul");
	    Collections.sort(cities);
	  for(String city:cities) {
		  System.out.println(city);
	  }
	}

}
