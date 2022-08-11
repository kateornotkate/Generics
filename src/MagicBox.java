import java.util.Random;

public class MagicBox<T> {
    private T[] items;
    private int numberOfItems;
    private Random random = new Random();

    public MagicBox(int SIZE) {
        items = (T[]) new Object[SIZE];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                numberOfItems++;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        if (numberOfItems != items.length) {
            throw new RuntimeException("Внимание! Необходимо полностью заполнить коробку. Наличие свободных мест: "
                    + (items.length - numberOfItems));
        }
        return items[random.nextInt(items.length)];
    }
}