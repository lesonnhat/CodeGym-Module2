import java.util.List;

public interface IManager<E> {
    void addToCSV(E e);
    List<E> readFromCSV();
}
