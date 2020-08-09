package yuanbin.Observer;

/**
 * 具体观察者
 *
 * 具体的观察者可以是实现此接口的任意类。
 * 观察者必须注册具体主题，以便接收更新。
 */
public class ConcreteObserver implements Observer {
    public void update(float temperature, float humidity, float pressure){

    }
}
