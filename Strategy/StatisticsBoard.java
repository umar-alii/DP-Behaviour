public class StatisticsBoard implements Observer {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("Statistics Board - Temperature: " + temperature + ", Humidity: " + humidity);
    }
}