package pl.zzpj2021.solid.dip.weathertracker.solution;

public class Phone implements Device {
    @Override
    public void generateWeatherAlert(String weatherConditions) {
        if ("rainy".equals(weatherConditions)) {
            System.out.println("It is " + weatherConditions);
        }
    }
}
