package queue.labs;

import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import queue.data.Person;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Slf4j
public class QueueEx3 {
    public static void main(String[] args) {
        Queue<Person> codeList = new PriorityQueue<>();

        ExecutorService asyncExecutor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        asyncExecutor.execute(() -> {
            try {
                while (true) {
                    TimeUnit.SECONDS.sleep(1L);
                    Random random = new Random();
                    Integer result = random.nextInt(3);
                    Faker faker = new Faker();
                    codeList.add(new Person(faker.name().name(), result));
                    log.info("Adicionada pessoa a fila " + (result == 0 ? "VERDE" : (result == 1 ? "AMARELA" : "VERMELHA")));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        asyncExecutor.execute(() -> {
            try {
                while (true) {
                    TimeUnit.SECONDS.sleep(3L);
                    if (!codeList.isEmpty()) {
                        Person person = codeList.poll();
                        log.info("Pessoa da fila " + (person.getPriority() == 0 ? "VERDE" : (person.getPriority() == 1 ? "AMARELA" : "VERMELHA")) +" atendida");
                    }

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

    }


}
