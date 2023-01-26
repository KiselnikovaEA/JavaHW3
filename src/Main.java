import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> ar1 = new ArrayList<>();
        ArrayList<Integer> ar2 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            ar1.add(new Random().nextInt(100));
            ar2.add(new Random().nextInt(100));
        }

        System.out.println("Список 1: " + ar1);
        System.out.println("Список 2: " + ar2);

        ar1.retainAll(ar2);
        System.out.println("Список 1 после удаления элементов: " + ar1);     // Удаление элементов, отсутствующих в 2 списке
        Collections.sort(ar1, Comparator.naturalOrder());
        System.out.println("Список 1 после сортировки методом sort: " + ar1);     // Сортировка элементов первого массива

        Collections.sort(ar2, comparator);
        System.out.println("Список 2 после сортировки компаратором: " + ar2);

        Integer temp;
        for (int i = ar2.size() - 1; i >= 1; i--){
            for (int j = 0; j < i; j++){
                if(ar2.get(j) > ar2.get(j + 1)) {
                    temp = ar2.get(j + 1);
                    ar2.set(j + 1, ar2.get(j));
                    ar2.set(j, temp);
                }
            }
        }

        System.out.println("Список 2 после сортировки пузырьком: " + ar2);

    }

    public static Comparator<Integer> comparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer num1, Integer num2) {
            return num2 - num1;
        }
    };
}