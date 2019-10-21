package egzaminoUzduotis;

public class Skritulys implements GeometrineFigura{
	
	double plotas;

	
		

	
	public double getPlotas() {
		return plotas;
	

}





	public void skaiciuokPlota(double a, double b) {
		b = Math.PI;
		
		this.plotas = (Math.pow(a, 2) * b);
		
	}




	
	
}
