package Java8Features.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.SplittableRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterMovie {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(new Movie("Maja", 2021, "adfd"),
                new Movie("yes", 2021, "ohoH"),
                new Movie("No", 2021, "Yahah"),
                new Movie("Maja", 2022, "adfd"));

        Stream<Movie> movieStream = movies.stream();
        // Filter method using here....
        Stream<Movie> filterYear = movieStream.filter(m -> m.lanchYear == 2021);

        Stream<String> movieType1 = filterYear.map(m -> m.movieType);

        movieType1.forEach(System.out::println);

        movies.stream()
                .filter(f -> f.lanchYear == 2022)
                .map(f -> f.movieType)
                .forEach(System.out::println);


        filterYear.collect(Collectors.toList()).forEach(System.out::println);


    }
}
