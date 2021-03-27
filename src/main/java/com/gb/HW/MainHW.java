package com.gb.HW;
/*
1. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов,
идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку,
иначе в методе необходимо выбросить RuntimeException.
Написать набор тестов для этого метода (по 3-4 варианта входных данных).
Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
Вх: [ 1 2 4 4 ] -> вых: [ ].
Вх: [ 4 4 2 3 4 1 7 5 1 ] -> вых: [ 1 7 5 1].
Вх: [ 7 5 1 ] -> RuntimeException.

2. Написать метод, который проверяет состав массива из чисел 1 и 4.
Если в нем нет хоть одной четверки или единицы, то метод вернет false;
Если содержиться число отличное от 1 и 4, то метод вернет false;
Написать набор тестов для этого метода (по 3-4 варианта входных данных).
[ 1 1 1 4 4 1 4 4 ] -> true
[ 1 1 1 1 1 1 ] -> false
[ 4 4 4 4 ] -> false
[ 1 4 4 1 1 4 3 ] -> false

3. * Добавить на серверную сторону сетевого чата логирование событий
(сервер запущен, произошла ошибка, клиент подключился, клиент прислал сообщение/команду).
 */

import java.util.Arrays;

public class MainHW {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrFour(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7})));
        System.out.println(Arrays.toString(arrFour(new int[]{1, 2, 4, 4})));
        System.out.println(Arrays.toString(arrFour(new int[]{4, 4, 2, 3, 4, 1, 7, 5, 1})));
        // System.out.println(Arrays.toString(arrFour(new int[]{7, 5, 1})));
        System.out.println(OneAndFour(new int[]{1, 1, 1, 4, 5, 1, 4, 4}));
        System.out.println(OneAndFour(new int[]{1, 1, 1, 4, 4, 1, 4, 4}));
        System.out.println(OneAndFour(new int[]{1, 1, 1}));
        System.out.println(OneAndFour(new int[]{4, 4, 4, 4}));


    }

    public static int[] arrFour(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            if (a[i] == 4) return Arrays.copyOfRange(a, i + 1, a.length);
        }
        throw new RuntimeException("4-ки не найдены");
    }

    public static boolean OneAndFour(int[] arr) {
        int sim1 = 1;
        int sim2 = 4;
        int count1=0;
        int count4=0;
        for (int i = 0; i < arr.length; i++) {
            if ((Arrays.asList(arr[i]).contains(sim1)))count1++;
            if ((Arrays.asList(arr[i]).contains(sim2)))count4++;
            if (!(Arrays.asList(arr[i]).contains(sim1))&&(!(Arrays.asList(arr[i]).contains(sim2)))){
                return false;
            }


        }if((count1==arr.length)||(count4==arr.length))return false;
        return true;
    }

}
