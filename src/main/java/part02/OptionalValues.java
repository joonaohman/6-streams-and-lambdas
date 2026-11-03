package part02;

import java.util.stream.IntStream;

public class OptionalValues {

    public double average(IntStream stream) {
        return stream.average().orElse(0.0);
    }

    public int maximum(IntStream stream) {
        return stream.max().orElse(0);
    }
}