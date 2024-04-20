import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    // Тестирование метода add
    private static long testAddMethod(java.util.List<Integer> list, int numOperations) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            list.add(i);
        }
        return System.nanoTime() - startTime;
    }

    // Тестирование метода delete
    private static long testDeleteMethod(java.util.List<Integer> list, int numOperations) {
        // Наполним коллекцию элементами
        for (int i = 0; i < numOperations; i++) {
            list.add(i);
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            list.remove(list.size() - 1);
        }
        return System.nanoTime() - startTime;
    }

    // Тестирование метода get
    private static long testGetMethod(java.util.List<Integer> list, int numOperations) {
        // Наполним коллекцию элементами
        for (int i = 0; i < numOperations; i++) {
            list.add(i);
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            list.get(i);
        }
        return System.nanoTime() - startTime;
    }

    public static void main(String[] args) {
        int num_operations = 1000;

        // Создаем экземпляры ArrayList и LinkedList
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Тестируем метод add
        long arrayListAddTime = testAddMethod(arrayList, num_operations);
        long linkedListAddTime = testAddMethod(linkedList, num_operations);

        // Тестируем метод delete
        long arrayListDeleteTime = testDeleteMethod(arrayList, num_operations);
        long linkedListDeleteTime = testDeleteMethod(linkedList, num_operations);

        // Тестируем метод get
        long arrayListGetTime = testGetMethod(arrayList, num_operations);
        long linkedListGetTime = testGetMethod(linkedList, num_operations);

        // Выводим результаты
        System.out.println("Performance Comparison:");
        System.out.println("Operation\t\tNum repet\t\tArrayListTime\t\tLinkedListTime");
        System.out.println("------------------------------------------------------------");
        System.out.println("Add\t\t\t\t" + num_operations + "\t\t\t" + arrayListAddTime + "\t\t\t\t" + linkedListAddTime);
        System.out.println("Delete\t\t\t" + num_operations + "\t\t\t" + arrayListDeleteTime + "\t\t\t\t" + linkedListDeleteTime);
        System.out.println("Get\t\t\t\t" + num_operations + "\t\t\t" + arrayListGetTime + "\t\t\t\t" + linkedListGetTime);
    }


}
