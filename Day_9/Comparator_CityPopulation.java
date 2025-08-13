package Day_9;
/*
Q9. Write a program that sorts a list of cities by population using Comparator.
*/
import java.util.*;

class City {
	String name;
	int population;
	City(String name,int population){
		this.name=name;
		this.population=population;
	}
	public String toString() {
		return name+" "+population;
	}
}

public class Comparator_CityPopulation {
	public static void main(String args[]) {
		List<City> cities=Arrays.asList(
				new City("Mumbai",20400000),
				new City("Delhi",16700000),
				new City("Bangalore",12300000),
				new City("Chennai",10000000)
				);
		Collections.sort(cities,(c1,c2)->Integer.compare(c1.population,c2.population));
		for(City c:cities) {
			System.out.println(c);
		}
	}
}
