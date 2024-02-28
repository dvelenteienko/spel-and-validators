package my.dvelenteienko.SpeLAndPropsValidator.singletons;

public enum EnumSingleton {

    INSTANCE;

    private Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
