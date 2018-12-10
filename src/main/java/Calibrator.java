import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Calibrator {
    private int[] result = new int[2];

    int[] getResult(List<String> frequencyChanges) {
        return calculateFrequency(frequencyChanges);
    }

    private int[] calculateFrequency(List<String> frequencyChanges) {
        Set<Integer> frequenciesToCompare = new HashSet<>();

        while (result[1] == 0) {
            for (String freq : frequencyChanges) {
                int number = Integer.parseInt(freq);

                result[0] += number;

                if (frequenciesToCompare.contains(result[0])) {
                    result[1] = result[0];
                    break;
                }

                frequenciesToCompare.add(result[0]);
            }
        }

        return result;
    }
}
