import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CalibratorTest {
    private Calibrator calibrator;

    @Before
    public void initialize() {
        calibrator = new Calibrator();
    }

    @Test
    public void that_resulting_frequency_is_correct() {
        List<String> frequencyChanges = Arrays.asList("+1", "-2", "+3", "+1", "-4");

        int[] result = calibrator.getResult(frequencyChanges);

        assert result[0] == -1;
    }

    @Test
    public void that_duplicate_frequency_is_found() {
        List<String> frequencyChanges = Arrays.asList("+1", "-2", "+3", "+1", "-1", "+5", "-72", "+8433");

        int[] result = calibrator.getResult(frequencyChanges);

        assert result[1] == 2;
    }
}
