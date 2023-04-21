import java.util.Optional;

public class CustomStack<E> implements DataStructure<E> {
    private E[] elements;
    private int maxSize;
    private int index;

    public CustomStack(int dataSize) {
        this.elements = (E[]) new Object[dataSize];
        this.index = 0;
        this.maxSize = dataSize;
    }

    @Override
    public void insert(E newElement) {
        elements[index++] = newElement;
    }

    @Override
    public Optional<E> remove() {
        Optional<E> ret = peek();
        if(!empty()) {
            --index;
        }
        return ret;
    }

    @Override
    public Optional<E> peek() {
        if(empty()) {
            return Optional.empty();
        } else {
            return Optional.of(elements[index-1]);
        }
    }

    @Override
    public boolean empty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return index;
    }

    public Optional<E> front() {
        if(empty()) {
            return Optional.empty();
        } else {
            return Optional.of(elements[0]);
        }
    }
}
