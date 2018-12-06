import java.util.ArrayList;
import java.util.List;

class Calibrator {
    private int[] result = new int[2];

    int[] getResult(List<String> frequencyChanges) {
        return calculateFrequency(frequencyChanges);
    }

    private int[] calculateFrequency(List<String> frequencyChanges) {
        List<Integer> frequenciesToCompare = new ArrayList<>();

        while (result[1] == 0) {
            for (int i = 0; i < frequencyChanges.size(); i++) {
                int number = Integer.parseInt(frequencyChanges.get(i).substring(1));

                if (frequencyChanges.get(i).charAt(0) == '+') {
                    result[0] += number;
                } else {
                    result[0] -= number;
                }

                if (frequenciesToCompare.contains(result[0])) {
                    result[1] = result[0];
                    i = frequencyChanges.size();
                }

                frequenciesToCompare.add(result[0]);
            }
        }

        return result;
    }
}
