package PR320232;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aashgar
 */
public class MainApp101 {
    public static void main(String[] args) {
//        String s = "A";
//        StringBuilder sb = new StringBuilder("A");
//        long now = System.currentTimeMillis();
//        for(int i=0; i<100000; i++)
////            s+= "A";
//            sb.append("A");
//        long later = System.currentTimeMillis();
//        System.out.println(later - now);
//    int[] ar = {1,2,33,11,56,14,90};
//        List<String> list = new ArrayList<>();
//        list.add("Prog1");
//        list.add("Prog2");
//        list.add("prog3");
//        processCollection(list);

//    Operation<Integer, Integer> operation1 = (n1, n2) -> n1 + n2; 
    Operation<Integer, Integer> operation1 = (n1, n2) -> {return n1 + n2;}; 
    
        System.out.println(operation1.add(10, 20));
        
   Operation<String, Boolean> operation2 = (s1, s2) -> {
       
       return s1.equals(s2);
   };
        System.out.println(operation2.add("Programming 3", "Not hellow world"));
    Operation2<Integer> op2 = () -> {return 30;};
    }
    
    
    private  static <S> void processCollection(Collection<S> items){
        for(S t: items )
            System.out.print(t+",");
    }
    
    private interface Operation<T,S>{
        S add(T x, T Y);
    }
    
     private interface Operation2<T>{
        T add();
    }
    
}
