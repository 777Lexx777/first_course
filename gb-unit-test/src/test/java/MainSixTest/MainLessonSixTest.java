package MainSixTest;
/**
 * 1. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
 * Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов,
 * идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку,
 * иначе в методе необходимо выбросить RuntimeException. Написать набор тестов для этого метода
 * (по 3-4 варианта входных данных). Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
 * 2. Написать метод, который проверяет состав массива из чисел 1 и 4.
 * Если в нем нет хоть одной четверки или единицы, то метод вернет false;
 * Написать набор тестов для этого метода (по 3-4 варианта входных данных).
 */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.geekbrains.Lesson6.MainSix;

public class MainLessonSixTest {

        MainSix mainLessonSix = new MainSix();
        public int[] array = {0, 5, 3, 1, 8, 2, 4, 1, 7} ;
        public int[] arrayNotFour = {1, 1, 1, 1,2} ;
        public int[] arrayOneFour = {1, 1, 1, 1,4} ;
        public int[] arrayNullIndex = new int[0] ;
        public int[] arrayNull = new int[8] ;

       //Test for method  array
        @Test
        public void testMainLessonMethodArrayNumbersAfterFour(){
            Assertions.assertArrayEquals(new int[]{7,1}, mainLessonSix.array(array));
        }
        @Test
        public void testMainLessonMethodArrayForFour(){
            Assertions.assertArrayEquals(new int[]{7,1}, mainLessonSix.array(arrayNotFour));
        }
        @Test
        public void testMainLessonMethodArrayNullIndex(){
            Assertions.assertArrayEquals(new int[]{7,1}, mainLessonSix.array(arrayNullIndex));
        }
        @Test
        public void testMainLessonMethodArrayArrayNull(){
            Assertions.assertArrayEquals(new int[]{7,1}, mainLessonSix.array(arrayNull));
        }
        //Test for method  arrayOnlyFour
        @Test
        public void testMainLessonMethodArrayOnlyFourForFour(){
            Assertions.assertTrue(Boolean.parseBoolean(String.valueOf(mainLessonSix.arrayOnlyFour(arrayOneFour))));
        } @Test
        public void testMainLessonMethodArrayOnlyFourNotFour(){
            Assertions.assertTrue(Boolean.parseBoolean(String.valueOf(mainLessonSix.arrayOnlyFour(arrayNotFour))));
        }
        @Test
        public void testMainLessonMethodArrayOnlyFourNull(){
            Assertions.assertTrue(Boolean.parseBoolean(String.valueOf(mainLessonSix.arrayOnlyFour(null))));
        }
        @Test
        public void testMainLessonMethodArrayOnlyFourArrayNullIndex(){
            Assertions.assertTrue(Boolean.parseBoolean(String.valueOf(mainLessonSix.arrayOnlyFour(arrayNullIndex))));
        }
        @Test
        public void testMainLessonMethodArrayOnlyFourArrayNull(){
            Assertions.assertTrue(Boolean.parseBoolean(String.valueOf(mainLessonSix.arrayOnlyFour(arrayNull))));
        }


}
