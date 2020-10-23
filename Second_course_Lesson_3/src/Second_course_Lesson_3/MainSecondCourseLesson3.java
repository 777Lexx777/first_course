package Second_course_Lesson_3;
//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
//   Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//   Посчитать сколько раз встречается каждое слово.
//2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и
//   телефонных номеров.
//   В этот телефонный справочник с помощью метода add() можно добавлять записи.
//   С помощью метода get() искать номер телефона по фамилии.
//   Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
//   тогда при запросе такой фамилии должны выводиться все телефоны.
//!!!Желательно как можно меньше добавлять своего, чего нет в задании
// (т.е. не надо в телефонную запись добавлять еще дополнительные поля (имя, отчество, адрес),
// делать взаимодействие с пользователем через консоль и т.д.).
// Консоль желательно не использовать (в том числе Scanner),
// тестировать просто из метода main() прописывая add() и get().

import java.util.*;
import java.util.Map;

public class MainSecondCourseLesson3 {

    public static void main(String[] args) {

       // The Task 1
        String [] words = {"Gun","Array" ,"Words", "Array" ,"Words", "Gun", "int","char","war","byte"};

        List<String> arrayWords = new ArrayList<>(Arrays.asList(words));
        System.out.println("\nAll words - " + arrayWords);

        Set<String> arrayWordsUnique = new HashSet<>(Arrays.asList(words));
        System.out.println("\nList of unique words - " + arrayWordsUnique);
        System.out.printf("\nRepeating word list = %d\n ", Integer.valueOf(arrayWords.size() - arrayWordsUnique.size()));

        Map<String,Integer> hashWords = new HashMap<>();
        for (String a : arrayWords) {
            if (hashWords.containsKey(a)) {
                Integer hashWord = hashWords.get(a);
                hashWord++;
                hashWords.put(a, hashWord);
            } else {
                hashWords.put(a, 1);
            }
        }
        System.out.println("\n" + hashWords +"\n");

    //===========================================================================================================

        new PhoneBook().add("Ivan", "555555");
        new PhoneBook().add("Ivan", "655555");
        new PhoneBook().add("Ivan", "755555");
        new PhoneBook().add("Petr", "855555");
        new PhoneBook().add("Seva", "955555");
        new PhoneBook().add("Katya", "855555");

        System.out.println("\n" + new PhoneBook().get("Ivan"));

    }


}
