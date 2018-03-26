import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Integer> listWithDuplicates = new ArrayList<>();
    int[] numbers = {1,1,2,2,2,3,4,5,5,6,7,7,8,9,9,1,3,5,7,9};

    fillList(numbers, listWithDuplicates);

    System.out.println(returnListWithoutDuplicates(listWithDuplicates));
  }

  private static List returnListWithoutDuplicates(List<Integer> listWithDuplicates) {
    return new ArrayList<>(new HashSet<>(listWithDuplicates));
  }

  private static void fillList(int[] numbers, List<Integer> listWithDuplicates) {
    for (int number : numbers) {
      listWithDuplicates.add(number);
    }
  }
}
