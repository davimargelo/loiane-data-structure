package queue.labs;

import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import queue.data.Person;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

@Slf4j
public class QueueEx4 {
    public static void main(String[] args) throws InterruptedException {
        Queue<Person> people = new LinkedList<>();
        Faker faker = new Faker();

        people.addAll(List.of(
                new Person(faker.funnyName().name(), 0),
                new Person(faker.funnyName().name(), 0),
                new Person(faker.funnyName().name(), 0),
                new Person(faker.funnyName().name(), 0)
        ));

        log.info("Pessoas que irão participar: ");
        for (Person person : people) {
            log.info(person.toString());
        }

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            Integer milliseconds = random.nextInt(2000);
            Thread.sleep(milliseconds);
            people.add(people.poll());
            log.warn("A batata está com " + people.peek());
        }

        log.warn("Queimou em " + people.peek());
    }
}
