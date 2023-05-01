import java.util.Optional;

public interface DataStructure <E> {
    public abstract void insert(E newElement);
    public abstract Optional<E> remove();
    public abstract Optional<E> peek();
    public abstract boolean empty();
    public abstract int size();
}
