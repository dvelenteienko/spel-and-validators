package my.dvelenteienko.SpeLAndPropsValidator.singletons;

public class DoubleCheckedLockedSingleton {

    private static volatile DoubleCheckedLockedSingleton instance;

    private Integer value;

    private DoubleCheckedLockedSingleton() {
        super();
    }

    public static DoubleCheckedLockedSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockedSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockedSingleton();
                }
            }
        }
        return instance;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
