package egzaminoUzduotis;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
		
		Metodas();
		
		Staciakampis staciakampis = new Staciakampis();
		StatusisTrikampis statusistrikampis = new StatusisTrikampis();
		Kvadratas kvadratas = new Kvadratas();
		Skritulys skritulys = new Skritulys();
		
		List<GeometrineFigura> figuros = new ArrayList<GeometrineFigura>(); 
			figuros.add(staciakampis);
			figuros.add(statusistrikampis);
			figuros.add(kvadratas);
			figuros.add(skritulys);
			
			for (int i = 0; i < figuros.size(); i++) {
				
				if(figuros.get(i)instanceof Kvadratas) {
					kvadratas.skaiciuokPlota(4);
				}
				
				figuros.get(i).skaiciuokPlota(4, 7.5);
				
				Map<GeometrineFigura, String>
				
				
			}
			
		

	}

	public static void Metodas() {
		FigurosPasirinkimas figura = new FigurosPasirinkimas();
		figura.chooseFigure();
		
		if (figura.getFigura() == 1) {
			Staciakampis staciakampis = new Staciakampis();
			staciakampis.skaiciuokPlota(figura.getKrastine1(), figura.getKrastine2());
			System.out.println("Staciakampio plotas yra: " +staciakampis.getPlotas());
		}
		else if (figura.getFigura() == 2) {
			StatusisTrikampis statusistrikampis = new StatusisTrikampis();
			statusistrikampis.skaiciuokPlota(figura.getKrastine1(), figura.getKrastine2());
			System.out.println("Staciojo trikampio plotas yra: " +statusistrikampis.getPlotas());
		}
		else if (figura.getFigura() == 3) {
			Kvadratas kvadratas = new Kvadratas();
			kvadratas.skaiciuokPlota(figura.getKrastine1());
			System.out.println("Kvadrato plotas yra: " +kvadratas.getPlotas());
		}
		else if (figura.getFigura() == 4) {
			Skritulys skritulys = new Skritulys();
			skritulys.skaiciuokPlota(figura.getSpindulys(), Math.PI);
			System.out.println("Skritulio plotas yra: " +skritulys.getPlotas());
		}
		else {
			System.out.println("Tokio pasirinkimo nera");
		}
	}
	
	
	
}



