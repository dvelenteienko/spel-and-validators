package my.dvelenteienko.SpeLAndPropsValidator.singletons;

public class EarlyInitSingleton {

    private static final EarlyInitSingleton INSTANCE = new EarlyInitSingleton();

    private Integer value;

    public static EarlyInitSingleton getInstance() {
        return INSTANCE;
    }

    private EarlyInitSingleton() {
        super();
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
