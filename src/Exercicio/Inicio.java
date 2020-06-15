package Exercicio;

public class Inicio {

	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		CurrentConditionsDisplays conditionsDisplay =
				new CurrentConditionsDisplays();
		ForecatDisplay forecatDisplay =
				new ForecatDisplay();
		StatsDisplay statsDisplay =
				new StatsDisplay();
		wd.registerObserver(conditionsDisplay);
		wd.registerObserver(forecatDisplay);
		wd.registerObserver(statsDisplay);
		wd.iniciar();
	}

}
