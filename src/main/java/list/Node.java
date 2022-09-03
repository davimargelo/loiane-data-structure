package list;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Node<T> {
    private T element;
    private Node<T> next;

    public Node(T element) {
        this.element = element;
        this.next = null;
    }

    public Node(T element, Node<T> next) {
        this.element = element;
        this.next = next;
    }
}
