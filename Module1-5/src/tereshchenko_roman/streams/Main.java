package tereshchenko_roman.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static tereshchenko_roman.streams.Gender.MAN;
import static tereshchenko_roman.streams.Gender.WOMAN;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Stream.<Integer>iterate(10, i -> i+10)
                .limit(10).map(x -> x/2)
                .collect(Collectors.toList());

        System.out.println("List: " + list);

        System.out.println();

        List<String> list1 = Arrays.asList("sdjhf", "bjdsf;", "kjdhfa", "blkajd", "fjlaj", "dlkfj", "bdjk", "flds");

        list1.stream().filter(s -> s.startsWith("b"))
                .sorted().forEach(System.out::println);

        System.out.println();

        List<Person> people = Arrays.asList( new Person("Ivan", 16, MAN), new Person("Peter", 23, MAN),
                new Person("Helena", 22, WOMAN), new Person("Alexander", 69, MAN),
                new Person("Nina", 42, WOMAN), new Person("Igor", 26, MAN),
                new Person("Olena", 30, WOMAN), new Person("Maxsim", 34, MAN));

        System.out.println("Military:");
        people.stream().filter((p)-> p.getAge() >= 18 && p.getAge() < 27 && p.getGender() == Gender.MAN).
                forEach(System.out::println);

        System.out.print("\nThe average age of women: ");
        double averageWomen = people.stream().filter((p) -> p.getGender() == Gender.MAN).
                mapToInt(Person::getAge).average().getAsDouble();
        System.out.println(averageWomen);
}}
