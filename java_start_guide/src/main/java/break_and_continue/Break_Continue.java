package break_and_continue;

public class Break_Continue {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 43, -1, 76, 2, 8};
        int i = 0;
        while (arr[i] > 0){
            if (arr[i] < 0){
                break;
            }
            i++;
        }
        System.out.println("Найдено отрицательное число на позиций " + i);

        for (int j = 0; j < 100; j++){
            if (j % 2 == 0){
                continue; // После continue код не выполняется
                // Только обновляется счетчик
            }
            System.out.println("Это нечетное число " + j);
        }
    }
}
