import java.util.List;

public class RandomListFacade {
    private RandomList randomList;
    private ListFilter listFilter;
    private ListPrinter listPrinter;

    public RandomListFacade() {
        randomList = new RandomList();
        listFilter = new ListFilter();
        listPrinter = new ListPrinter();
    }

    public void printRandomEvenList(int size) {
        List<Integer> randomNumbers = randomList.generateList(size);
        List<Integer> evenNumbers = listFilter.filterOdd(randomNumbers);
        listPrinter.printList(evenNumbers);
    }
}