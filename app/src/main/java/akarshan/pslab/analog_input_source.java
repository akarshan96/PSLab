package akarshan.pslab;

/**
 * Created by akarshan on 3/29/17.
 */

public class analog_input_source {
    double[] gain_values = analog_initialize.gains;
    Boolean gainEnabled = false;
    double gain = -1;
    int gainPGA;
    Boolean inverted = false;
    double inversion = 1.;
    //1d polynomials
    Boolean calibrationReady = false;
    int defaultOffsetCode = 0;
    analog_input_source(String name) {

        int CHOSA = analog_initialize.picADCMultiplex.get(name);
        double[] adc_shifts;
        double[] R = analog_initialize.inputRanges.get(name);

        if (R[1] - R[0] < 0) {
            inverted = true;
            inversion = -1;
        }
        int scaling = 1;
        if (name.equals("CH1")) {
            gainEnabled = true;
            gainPGA = 1;
            gain = 0;
        } else if (name.equals("CH2")) {
            gainEnabled = true;
            gainPGA = 2;
            gain = 0;
        }
        gain = 0;
        regenerateCalibration(R);
    }

    void regenerateCalibration(double[] R)
    {
        double A,B,intercept,slope;
        A = R[1];
        B = R[0];
        intercept = R[0];
        if (gain != -1)
        {

            gain = gain_values[(int)gain];
            B/=gain;
            A/=gain;
    }
        slope = B - A;
        intercept = A;
        if (calibrationReady && gain!=8)
        {
            //polynomial related functions
        }
        else
        {
            //polynomial related functions
        }
        //polynomial
    }


}
