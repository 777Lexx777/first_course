package Second_course_Lesson_3;

import java.util.*;

public class  PhoneBook {

    private Map<String,Set<String>> phoneBook = new HashMap<>();

    public  void add(String name, String number){

        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(number);
        }else {
            HashSet<String> numbers = new HashSet<>();
            numbers.add(number);
            phoneBook.put(name,numbers);
        }
        System.out.println(phoneBook);
    }

    public Set<String> get(String name){

        if (phoneBook.containsKey(name)){
            return phoneBook.get(name);
        }

        return new HashSet<>();
    }

}
