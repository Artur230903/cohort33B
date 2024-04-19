package cohort33.homeworks.homework58_01_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  private static List<String> list01 = new ArrayList<>();

  private static List<Integer> numbersInteger = new ArrayList<>();

//  Фильтрация списка: Создайте список строк. Используя лямбда-выражения и метод filter из
//  Stream API, отфильтруйте и выведите на экран все строки, которые начинаются на букву "А".
//
//  Преобразование элементов списка: Имеется список целых чисел. Используя лямбда-выражение,
//  преобразуйте каждое число в его квадрат и сохраните результаты в новом списке.
//
//  Лямбда-выражение для работы с потоком данных: Используя поток данных (Stream) из
//  списка целых чисел, напишите лямбда-выражение для фильтрации всех четных чисел и
//  их последующего вывода на экран.
//
//  Использование forEach с лямбда-выражениями: Имеется список целых чисел.
//  Используя лямбда-выражение в методе forEach, напечатайте каждый элемент списка.
//
//  Работа с потоками (Streams): Используйте потоки для обработки коллекций с
//  помощью лямбда-выражений,преобразуйте все строки в списке в верхний регистр.

  public static void main(String[] args) {
    list01.add("DDF");
    list01.add("BBT");
    list01.add("ANA");
    list01.add("PAL");
    list01.add("AAX");

    numbersInteger.add(9);
    numbersInteger.add(22);
    numbersInteger.add(1);
    numbersInteger.add(4);

    int counterForSeparate = 1;
    System.out.println("-----" + (counterForSeparate++) + "-----");
    System.out.println(list01);

    System.out.println("-----" + (counterForSeparate++) + "-----");
    list01.stream().filter(letter -> letter.startsWith("A")).forEach(System.out::println);

    List<String> letters = Arrays.asList("DDF", "BBT", "ANA", "PAL", "AAX");
    letters.stream().filter(letter -> letter.startsWith("A")).forEach(System.out::println);

    System.out.println(letters.stream().filter(letter -> letter.startsWith("A")).toList());

    System.out.println("-----" + (counterForSeparate++) + "-----");
    List<Integer> resultNumbers = numbersInteger.stream().map(numInt -> numInt * numInt).toList();
    resultNumbers.forEach(System.out::println);

    System.out.println(numbersInteger.stream().map(numInt -> numInt * numInt).toList());

    System.out.println("-----" + (counterForSeparate++) + "-----");
    List<Integer> numbersToSelect = Arrays.asList(10, 55, 70, 33, 4);
    numbersToSelect.stream().filter(selectedNumber -> selectedNumber % 2 == 0).
        forEach(System.out::println);

    System.out.println("-----" + (counterForSeparate++) + "-----");
    List<Integer> listOfIntegers = Arrays.asList(8,9,23,65,74,2,11);
    listOfIntegers.stream().forEach(System.out::println);
    System.out.println(listOfIntegers.stream().toList());

    System.out.println("-----" + (counterForSeparate++) + "-----");
    List<String> stringsToUpperCase = Arrays.asList("Apple", "Samsung", "Sony", "LG", "Huawei");
    stringsToUpperCase.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
    stringsToUpperCase.stream().map(String::toUpperCase).forEach(System.out::println);
    System.out.println(stringsToUpperCase.stream().map(s -> s.toUpperCase()).toList());
    System.out.println(stringsToUpperCase.stream().map(String::toUpperCase).toList());


  }

}
