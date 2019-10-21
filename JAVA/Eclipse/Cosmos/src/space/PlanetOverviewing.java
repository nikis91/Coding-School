package space;
import java.util.*;

public class PlanetOverviewing {

	public static void main(String[] args) {
		
		Planet planet = new Planet();
		Planet earth = new Earth() ;
		Planet jupiter = new Jupiter();
//		Earth earthPlanet = new Earth();
//		Jupiter jupiterPlanet = new Jupiter();
		
//		earth.infoAboutThePlanet();
//		jupiter.infoAboutThePlanet();
//		planet.infoAboutThePlanet();
		
		ArrayList<Planet> planetList = new ArrayList<Planet>();{
			planetList.add(earth);
			planetList.add(jupiter);
		}
		
		for(int i=0; i<planetList.size(); i++){
			planetList.get(i).infoAboutThePlanet();
		}
		
		

	}

}
