/*
The 'Hamming distance' in two DNA strands is found by comparing the two
DNA strands and counting how many of the nucleotides are different from
their equivalent in the other string.

GAGCCTACTAACGGGAT
CATCGTAATGACGGCCT
^ ^ ^  ^ ^    ^^
The Hamming distance between these two DNA strands is 7.
 */
public class Hamming {

    private char[] leftStrand;
    private char[] rightStrand;

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        this.leftStrand = leftStrand.toCharArray();
        this.rightStrand = rightStrand.toCharArray();
    }

    public int getHammingDistance() {

        int distance = 0;

        for (int i = 0; i < leftStrand.length; i++) {
            if (leftStrand[i] != rightStrand[i]) {
                distance++;
            }
        }

        return distance;
    }

}