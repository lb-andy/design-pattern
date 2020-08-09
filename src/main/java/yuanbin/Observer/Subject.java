package yuanbin.Observer;

/**
 * 主题接口
 *
 * 对象使用此接口注册为观察者，或者把自己从观察者里删除。
 *
 * 每个主题可以有许多观察者
 */
public interface Subject {
    public void registerObserver(Observer o);//这两个方法都需要一个观察者作为变量，该观察者是用来注册或被删除的。
    public void removeObserver(Observer o);// ⬆
    public void notifyObservers();//当主题状态改变时，这个方法会被调用，以通知所有的观察者。
}
