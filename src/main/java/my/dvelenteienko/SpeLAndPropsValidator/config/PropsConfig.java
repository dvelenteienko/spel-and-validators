package my.dvelenteienko.SpeLAndPropsValidator.config;

import jakarta.validation.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;


@Validated
@Component
@ConfigurationProperties(prefix = "app.props")
public class PropsConfig {

    @NotBlank(message = "property cannot be null, blank, or empty")
    private String notEmptyProperty;

    public String getNotEmptyProperty() {
        return notEmptyProperty;
    }

    public void setNotEmptyProperty(String notEmptyProperty) {
        this.notEmptyProperty = notEmptyProperty;
    }
}
