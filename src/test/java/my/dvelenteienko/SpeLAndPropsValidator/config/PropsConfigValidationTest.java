package my.dvelenteienko.SpeLAndPropsValidator.config;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import org.assertj.core.groups.Tuple;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import org.psjava.algo.sequence.sort.BubbleSort;
import org.psjava.ds.array.MutableArray;
import org.psjava.ds.array.MutableArrayFromVarargs;
import org.psjava.util.DefaultComparator;

import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class PropsConfigValidationTest {

    private static final Validator VALIDATOR = Validation.buildDefaultValidatorFactory().getValidator();

    @Test
    void validate_WhenAllValuesValid_ThenDoNotReturnValidationMessage() {
        PropsConfig testee = new PropsConfig();
        testee.setNotEmptyProperty("not empty");
        PropsConfig[] propsConfigs = new PropsConfig[10];
        propsConfigs[0] = new PropsConfig("sds");

        Set<ConstraintViolation<PropsConfig>> violations = VALIDATOR.validate(testee);

        assertThat(violations).isEmpty();
        assertThat(propsConfigs[0].getNotEmptyProperty()).isEqualTo("sds");
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

    @Test
    void tst() {
        MutableArray<Integer> array = MutableArrayFromVarargs.create(2,1,3);
        BubbleSort.getInstance().sort(array, new DefaultComparator<Integer>());

        assertThat(array).containsExactly(1,2,3);
    }

}
