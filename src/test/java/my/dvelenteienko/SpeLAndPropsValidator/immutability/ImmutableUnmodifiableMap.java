package my.dvelenteienko.SpeLAndPropsValidator.immutability;

import java.util.Collections;
import java.util.Map;

public record ImmutableUnmodifiableMap(int id, String data, Map<String, String> metadata) {

    public ImmutableUnmodifiableMap(int id, String data, Map<String, String> metadata) {
        this.id = id;
        this.data = data;
        this.metadata = Collections.unmodifiableMap(metadata);
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
