package ru.geekbrains.Lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainSix {

   private final List<Integer> transformList = new ArrayList<>();;
   public int [] arrayNotFour;

    public  int[] array(int [] array){
        if (array == null || array.length == 0) {
            throw new NullPointerException("SWW");}

                boolean s = false;
                    for (int k : array) {
                        s= Arrays.asList(k).contains(4);
                        if ( s ) { break;}
                    }
                        if (! s ) { throw new RuntimeException("SWW");}

                    for (int j = array.length-1; j >= 0 ; j--) {
                        if (array[j] == 4) { break; }
                        transformList.add(array[j]);
                    }

                int [] arrayNotFour = new int[transformList.size()];
            for (int i = 0; i < transformList.size() ; i++) {
                arrayNotFour [i] = transformList.get(i);
            }
        return arrayNotFour;
    }

    public boolean arrayOnlyFour(int [] arrayOneFour){
        if (arrayOneFour == null || arrayOneFour.length == 0) {
            throw new NullPointerException("SWW");}
                boolean s = false;
                for (int k : arrayOneFour) {
                    s= Arrays.asList(k).contains(4);
                    if ( s ) { break;}
                }
           if (! s ) { return false;}
        return true;
    }



}
