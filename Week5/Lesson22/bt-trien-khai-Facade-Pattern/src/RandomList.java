import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList {
    private Random random = new Random();

    public List<Integer> generateList(int size) {
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            randomNumbers.add(random.nextInt(100)); // Số ngẫu nhiên từ 0 đến 99
        }
        return randomNumbers;
    }
}