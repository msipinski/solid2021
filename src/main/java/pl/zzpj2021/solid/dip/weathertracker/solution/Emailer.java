package pl.zzpj2021.solid.dip.weathertracker.solution;

public class Emailer implements Device {
    @Override
    public void generateWeatherAlert(String weatherConditions) {
        if ("sunny".equals(weatherConditions)) {
            System.out.println("It is " + weatherConditions);
        }
    }
}
