package my.dvelenteienko.SpeLAndPropsValidator.immutability;

import java.util.Map;

public class ImmutabilityProbe {
    public static void main(String[] args) {

        var mapp = Map.of("1", "1");

        ImmutableDeepCopyMap immutableDeepCopyMap = new ImmutableDeepCopyMap(1, "Data", mapp);
        System.out.println("ImmutableDeepCopyMap - Before put");
        System.out.println(immutableDeepCopyMap);
        immutableDeepCopyMap.metadata().put("2", "2");
        System.out.println("ImmutableDeepCopyMap - After put");
        System.out.println(immutableDeepCopyMap);

        ImmutableUnmodifiableMap immutableUnmodifiableMap = new ImmutableUnmodifiableMap(1, "Data", mapp);
        System.out.println("ImmutableUnmodifiableMap - Before put");
        System.out.println(immutableUnmodifiableMap);
        // RTE - UnsupportedOperationException
        immutableUnmodifiableMap.metadata().put("2", "2");
        System.out.println("ImmutableUnmodifiableMap - After put");
        System.out.println(immutableUnmodifiableMap);

    }
}
