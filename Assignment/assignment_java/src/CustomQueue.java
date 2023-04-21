import java.util.Optional;

public class CustomQueue<E> implements DataStructure<E> {

    private E[] elements;
    private int maxSize;
    private int frontIndex;
    private int backIndex;

    public CustomQueue(int dataSize) {
        this.elements = (E[]) new Object[dataSize];
        this.maxSize = dataSize;
        this.frontIndex = 0;
        this.backIndex = 0;
    }

    @Override
    public void insert(E newElement) {
        elements[backIndex++] = newElement;
    }

    @Override
    public Optional<E> remove() {
        Optional<E> ret = peek();
        if(!empty()) {
            ++frontIndex;
        }
        return ret;
    }

    @Override
    public Optional<E> peek() {
        if(empty()) {
            return Optional.empty();
        } else {
            return Optional.of(elements[frontIndex]);
        }
    }

    @Override
    public boolean empty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return backIndex - frontIndex;
    }

    public Optional<E> back() {
        if(empty()) {
            return Optional.empty();
        } else {
            return Optional.of(elements[backIndex-1]);
        }
    }
}
