import java.util.ArrayList;
import java.util.Random;

public class task1 {

    public static void main(String[] args) {
        // Создать список рандомных чисел от 0 до 100 (20 чисел)
        // Отсортировать этот список
        // Вывести на экран

    }

    public static ArrayList<Integer> getRandomArrListFrom0To100(int len) {
        Random rand = new Random();
        ArrayList<Integer> randArr = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            randArr.add(rand.nextInt(100));
        }
        return randArr;
    }

}