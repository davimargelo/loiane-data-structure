package queue.labs;

import lombok.extern.slf4j.Slf4j;
import queue.data.Person;

import java.util.*;

@Slf4j
public class QueueEx4 {
    public static void main(String[] args) throws InterruptedException {
        Queue<Person> people = new LinkedList<>();

        people.addAll(List.of(
                new Person("Cleyton", 0),
                new Person("Papaleguas", 0),
                new Person("Jasmine", 0),
                new Person("Jorge", 0)
        ));

        log.info("Pessoas que irão participar: ");
        for (Person person : people) {
            log.info(person.getName());
        }

        while (people.size() > 1)
            rodarABatata(people);

        log.info("O vencedor é " + Objects.requireNonNull(people.peek()).getName());
    }

    static void rodarABatata(Queue<Person> people) throws InterruptedException {
        Random random = new Random();
        Integer potatoTimes = random.nextInt(10);
        for (int i = 0; i < potatoTimes; i++) {
            Thread.sleep(1000);
            people.add(people.poll());
            log.warn("A batata está com " + Objects.requireNonNull(people.peek()).getName());
        }

        log.warn("Queimou em " + Objects.requireNonNull(people.poll()).getName() + "\n");
    }
}
