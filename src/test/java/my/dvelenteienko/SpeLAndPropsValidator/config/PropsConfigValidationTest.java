package my.dvelenteienko.SpeLAndPropsValidator.config;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import org.assertj.core.groups.Tuple;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class PropsConfigValidationTest {

    private static final Validator VALIDATOR = Validation.buildDefaultValidatorFactory().getValidator();

    @Test
    void validate_WhenAllValuesValid_ThenDoNotReturnValidationMessage() {
        PropsConfig testee = new PropsConfig();
        testee.setNotEmptyProperty("not empty");

        Set<ConstraintViolation<PropsConfig>> violations = VALIDATOR.validate(testee);

        assertThat(violations).isEmpty();
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"", "   "})
    void validate_WhenInvalidValid_ThenReturnValidationMessage(String value) {
        PropsConfig testee = new PropsConfig();
        testee.setNotEmptyProperty(value);

        Set<ConstraintViolation<PropsConfig>> violations = VALIDATOR.validate(testee);

        assertThat(violations)
                .extracting(valuation -> Tuple.tuple(valuation.getPropertyPath().toString(), valuation.getMessage()))
                .containsOnly(
                        Tuple.tuple("notEmptyProperty", "property cannot be null, blank, or empty")
                );
    }
}
