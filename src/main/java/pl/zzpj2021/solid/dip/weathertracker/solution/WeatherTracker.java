package pl.zzpj2021.solid.dip.weathertracker.solution;

import java.util.Arrays;
import java.util.List;

public class WeatherTracker {
    List<Device> devices;
    String currentConditions;

    public WeatherTracker(Device... devices) {
        this.devices = Arrays.asList(devices);
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        for (Device device: devices) {
            device.generateWeatherAlert(weatherDescription);
        }
    }
}
