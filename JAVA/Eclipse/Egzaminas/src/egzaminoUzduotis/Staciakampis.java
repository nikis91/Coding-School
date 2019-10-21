package egzaminoUzduotis;



public class Staciakampis implements GeometrineFigura {
	
	double plotas;

	@Override
	public void skaiciuokPlota(double a, double b) {
		plotas = a*b;
		
	}

	@Override
	public double getPlotas() {
		return plotas;
		
	}
	
	

}
