package Exercicio;

import java.util.ArrayList;
import java.util.List;

public class StatsDisplay implements Observer, DisplayElement{
	private List <Double> temps = new ArrayList <> ();
	public void update (double temp, double humidity, double pressure) {
		temps.add(temp);
		display(temp, humidity, pressure);
	}

	@Override
	public void display(double t, double h, double p) {
		historicoTemp(t);
	}

	private void historicoTemp (double t) {
		double total=0;
		int cont = 0;
		for (var temp : temps) {
			cont = cont+1;			
			total += t;
			if(cont == 10) {
				System.out.printf("Historico 10 ultimas temperaturas: %.2f\n", total/cont);
			}
			
				
		}

	}

}

