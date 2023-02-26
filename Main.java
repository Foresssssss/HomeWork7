package HW7;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;
public class Main {
    public static void main(String[] args) {
        /**
         * 1. Написать свой метод для сравнения строк, который принимает две строки, а возвращает значение типа Boolean
         *
         * 2. Генерируется набор случайных чисел. С помощью Stream API определить количество нечётных чисел.
         *
         * 3. Задано множество слов. Пользователь вводит букву.
         *      С помощью Stream API вывести все слова, начинающиеся на эту букву.
         */
        //пункт первый
        Sravnenie var;
        var =(str1, str2) -> {
            if(str1.equals(str2)){
                return true;
            }else{
                return false;
            }
        };
        System.out.println(var.Sravnenie("Дыня","Яблоко"));
        System.out.println(" ");

        //пункт второй
        ArrayList<Integer> myIntegerArrayList=new ArrayList<>();
        IntStream.range(0,10).forEach((index -> myIntegerArrayList.add((int)(Math.random()*10))));
        long count=myIntegerArrayList.stream().filter(variable->variable%2!=0).count();
        System.out.println(myIntegerArrayList);
        System.out.println(count);
        System.out.println(" ");

        //пункт третий
        Scanner sc=new Scanner(System.in);
        ArrayList<String> myNamesList=new ArrayList<>();
        ArrayList<String> names=new ArrayList<>();
        for(int i=0;i<5;i++){
            names.add(sc.nextLine());//убрать чувствительность к регистру
        }
        myNamesList.addAll(names);
        char myChar=sc.next().charAt(0);
        myNamesList.stream().filter(s->s.charAt(0)==Character.toLowerCase(myChar)||s.charAt(0)==Character.toUpperCase(myChar)).forEach(s-> {
            System.out.println(s);
        });
    }
}