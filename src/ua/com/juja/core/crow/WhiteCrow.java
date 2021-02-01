package ua.com.juja.core.crow;

public class WhiteCrow {

    public static int find(int[] array) {
    //пройтись по каждому элементу
        for (int first = 0; first < array.length; first++) {
            int current = array[first];
    //найтив остальной части массива его пару
    //пройтись по каждому элементу начиная с индекса +1 от текущей позиции
            boolean find = false;
            for (int second = 0; second < array.length; second++) {
    //если мы находимся в той же позиции пропускаем
                if (first == second) continue;
    //если элемент в новой позии равен
                if (array[second] == current) {
    //то нашли
                    find = true;
    //иначе ищим дальше
                } else {
                    continue;//говорит циклу в текущем месте бдальше ничего не выполнять
                             //сделать инкремент секонда, если мы не дошли до конца массива
                }

            }
            if (find == true){
                continue;
            } else {
                return first;
            }
        }
            return -1;
    }
}
