package my.dvelenteienko.SpeLAndPropsValidator.immutability;

import java.util.HashMap;
import java.util.Map;

public record ImmutableDeepCopyMap(int id, String data, Map<String, String> metadata) {

    public ImmutableDeepCopyMap(int id, String data, Map<String, String> metadata) {
        this.id = id;
        this.data = data;
        this.metadata = new HashMap<>(metadata);
    }

    @Override
    public Map<String, String> metadata() {
        return new HashMap<>(this.metadata);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ImmutableUnmodifiableMap{");
        sb.append("id=").append(id);
        sb.append(", data='").append(data).append('\'');
        sb.append(", metadata=").append(metadata);
        sb.append('}');
        return sb.toString();
    }
}
