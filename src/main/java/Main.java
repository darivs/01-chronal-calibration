import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Calibrator calibrator = new Calibrator();
        FileReader fileReader = new FileReader();

        List<String> frequencyChanges = fileReader.getListOfChanges();

        String duplicateFrequency = String.valueOf(calibrator.getResult(frequencyChanges)[1]);

        System.out.println(duplicateFrequency);
    }
}