import java.util.List;
import java.util.stream.Collectors;

public class ListFilter {
    public List<Integer> filterOdd(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0) // Chỉ lấy số chẵn
                .collect(Collectors.toList());
    }
}