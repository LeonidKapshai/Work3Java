// Пусть дан произвольный список из 100 целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

import java.util.ArrayList;
import java.util.Random;

class Work {
    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            int val = rd.nextInt(0, 100);
            list.add(val);
        }
        System.out.println("Первоночальны массив: " + list);
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            } else {
                i++;
            }
        }
        System.out.println("Массив с удаленными четными числами: " + list);

        int max = list.get(0);
        int min = list.get(0);
        int sum = 0;
        for (int item: list){
            if (item > max){
                max = item;
            }
            if(item < min){
                min = item;
            }
            sum += item;
        }
        float av = (float) sum/list.size();

        System.out.println("Минимальное значение " + min);
        
        System.out.println("Максимальное значение " + max);
        
        System.out.println("Среднее значение " + av);
    }
}