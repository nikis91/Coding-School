package egzaminoUzduotis;

public class Kvadratas extends Staciakampis implements GeometrineFigura{
	
	double plotas;

	
	public void skaiciuokPlota(double a) {
		super.skaiciuokPlota(a, a);
		
		this.plotas = super.getPlotas();
		
		
	}

	
	public double getPlotas() {
		return plotas;
		
	}

}
