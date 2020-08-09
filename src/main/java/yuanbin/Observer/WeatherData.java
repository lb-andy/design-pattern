package yuanbin.Observer;

import java.util.ArrayList;

/**
 * 具体主题接口
 *
 * 一个具体主题接口总是实现主题接口，除了注册和撤销方法之外，具体主题还实现了notifyObservers()方法，此方法用于在状态改变时更新所有当前观察者。
 *
 * 具体主题也可能有设置和获取状态的方法。
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }
    }

    //在这里，我们把状态告诉每一个观察者，因为观察者们都实现了update()，所以我们知道如何通知他们。
    public void notifyObservers(){
        observers.forEach(e -> e.update(temperature, humidity, pressure));
    }

    //当从气象站得到更新观测值时，我们通知观察者
    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
