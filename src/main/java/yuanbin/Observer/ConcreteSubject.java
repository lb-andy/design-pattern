package yuanbin.Observer;

/**
 * 具体主题接口
 *
 * 一个具体主题接口总是实现主题接口，除了注册和撤销方法之外，具体主题还实现了notifyObservers()方法，此方法用于在状态改变时更新所有当前观察者。
 *
 * 具体主题也可能有设置和获取状态的方法。
 */
public class ConcreteSubject implements Subject {

    public void registerObserver(Observer o){

    }

    public void removeObserver(Observer o){

    }

    public void notifyObservers(){

    }


}
