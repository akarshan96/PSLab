package akarshan.pslab;
import java.util.*;

/**
 * Created by akarshan on 3/29/17.
 */

public class analog_initialize {
    public analog_initialize() {

        inputRanges.put("CH1", new double[]{16.5, -16.5});
        inputRanges.put("CH2", new double[]{16.5, -16.5});
        inputRanges.put("CH3", new double[]{-3.3, 3.3});
        inputRanges.put("MIC", new double[]{-3.3, 3.3});
        inputRanges.put("CAP", new double[]{0, 3.3});
        inputRanges.put("SEN", new double[]{0, 3.3});
        inputRanges.put("AN8", new double[]{0, 3.3});

        picADCMultiplex.put("CH1", 3);
        picADCMultiplex.put("CH2", 0);
        picADCMultiplex.put("CH3", 1);
        picADCMultiplex.put("MIC", 2);
        picADCMultiplex.put("AN4", 4);
        picADCMultiplex.put("SEN", 7);
        picADCMultiplex.put("CAP", 5);
        picADCMultiplex.put("AN8", 8);

    }
    static double gains[] = {1, 2, 4, 5, 8, 10, 16, 32, 1 / 11.};
    String[] allAnalogChannels = {"CH1", "CH2", "CH3", "MIC", "CAP", "SEN", "AN8"};
    String[] bipolars = {"CH1", "CH2", "CH3", "MIC"};
    static Map<String, double[]> inputRanges = new LinkedHashMap<>();
    static Map<String, Integer> picADCMultiplex = new LinkedHashMap<>();
}
