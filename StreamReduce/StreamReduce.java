import java.util.stream.Stream;

public class StreamReduce {
    public static Integer sumAll(Stream<Integer> s) {
        return s.reduce(0, Integer::sum);
    }

    public static Integer divideAndAddElements(Stream<Integer> s, int divider) {
        return s.map(num -> num / divider)
                .reduce(0, Integer::sum);
    }
}