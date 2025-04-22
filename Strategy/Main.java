public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        
        DigitalDisplay digitalDisplay = new DigitalDisplay();
        StatisticsBoard statisticsBoard = new StatisticsBoard();
        MobileAlertSystem mobileAlertSystem = new MobileAlertSystem();
        
        weatherStation.addObserver(digitalDisplay);
        weatherStation.addObserver(statisticsBoard);
        weatherStation.addObserver(mobileAlertSystem);

        // Set weather and notify observers
        weatherStation.setWeather(25.5f, 60.0f);

        // Dynamically add a new observer
        NewsChannel newsChannel = new NewsChannel();
        weatherStation.addObserver(newsChannel);

        // Update weather again
        weatherStation.setWeather(30.0f, 55.0f);
    }
}