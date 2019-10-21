package egzaminoUzduotis;

public class StatusisTrikampis implements GeometrineFigura {
	
	double plotas;

	@Override
		public void skaiciuokPlota(double a, double b) {
			plotas = a*b/2;
		
	}

	@Override
	public double getPlotas() {
		return plotas;
		
	}

}
