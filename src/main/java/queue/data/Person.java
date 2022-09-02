package queue.data;

import lombok.Getter;

@Getter
public class Person implements Comparable<Person> {

    private String name;
    private Integer priority;

    public Person() {
    }

    public Person(String name, Integer priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Person person) {
        if (priority < person.priority)
            return 1;
        else if (priority > person.priority)
            return -1;
        return 0;
    }
}
