package part01;

import java.util.stream.IntStream;

public class IntegerStreams {

    public IntStream numbersBetween(int from, int to) {
        return IntStream.rangeClosed(from, to);
    }

    public int sum(IntStream stream) {
        return stream.sum();
    }

    public long countNumbersInStream(IntStream stream) {
        return stream.count();
    }
}