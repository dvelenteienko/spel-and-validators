package my.dvelenteienko.SpeLAndPropsValidator.singletons;

public class SingletonsProbe {

    public static void main(String[] args) {

        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.setValue(2);
        System.out.println("Value: " + enumSingleton.getValue());
        enumSingleton.setValue(3);
        System.out.println("Value: " + enumSingleton.getValue());
    }
}
