package ie.tudublin;

public class PitchSpeller {

    float[] frequencies = { 55.0f, 61.74f, 65.41f, 73.42f, 82.41f, 87.31f, 98.00f, 110.00f, 123.47f, 130.81f, 146.83f, 164.81f, 174.61f, 174.61f, 
                    196.00f, 220.00f, 246.94f, 261.63f, 293.66f, 329.63f, 369.99f, 392.00f, 440.00f, 493.88f, 554.37f, 587.33f, 659.25f, 739.99f, 
                    783.99f, 880.00f, 987.77f, 1108.73f, 1174.66f, 1318.51f, 1396.91f, 1567.98f, 760.00f, 1975.53f, 2093.0f, 2349.32f, 2637.02f, 
                    2793.83f, 3135.96f, 3520.00f, 3951.07f, 4186.01f, 4698.63f}; 

    String[] spellings = {"A1", "B1","C2", "D2", "E2", "F2","G2", "A2", "B2", "C3", "D3", "E3", "F3", "G3", "A3", "B3", "C4", "D", 
                    "E,", "F", "G", "A", "B", "C", "D", "E", "F", "G", "A", "B","c", "d", "e", "f", "g", "a", "b", "c'", "d'", "e'", "f'", 
                    "g'", "a'", "b'", "c''", "d''"};
    

    public String spell(float frequency) {

        for(int i=0; i<(frequencies.length - 1); i++) {
            if(frequencies[i] <= frequency  && frequencies[i+1] >= frequency) {
                if( ( (frequencies[i] + frequencies[i + 1]) / 2 ) <= frequency) {
                    return spellings[i];
                }
                else {
                    return spellings[i + 1];
                }
            }
        }

        return null;
    }
}
