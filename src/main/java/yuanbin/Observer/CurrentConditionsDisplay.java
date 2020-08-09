package yuanbin.Observer;

/**
 * 目前状况布告板
 *
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    //当气象观测值改变时，主题会把这些状态值当作方法的参数，传递给观察者。
    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Current conditions: "+temperature+"F degrees adn "+humidity+"% humidity");
    }
}
