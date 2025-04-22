public class NewsChannel implements Observer {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("News Channel - Breaking Weather Update: Temperature = " + temperature + ", Humidity = " + humidity);
    }
}