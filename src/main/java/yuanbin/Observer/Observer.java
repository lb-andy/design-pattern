package yuanbin.Observer;

/**
 * 观察者
 *
 * 所有潜在的观察者必须实现观察者接口，这个接口只有update()一个方法，当主题状态改变是它被调用。
 */
public interface Observer {
    public void update(float temperature, float humidity, float pressure);//当气象观测值改变时，主题会把这些状态值当作方法的参数，传递给观察者。
}
