
import org.junit.Test;

import java.util.*;
import java.util.stream.StreamSupport;


public class Main {

    public static void main(String[] args) {
        //int [] a = {1,2,3,4};
        //int n = 2;
        //System.out.println(Arrays.toString(decreto(a, n)));

        //marketPlanetTest();

     /*   int[] A = new int[100000];

        int c = 1;
        for (int i=0;i<A.length;i++)
            A[i] = c++;*/


        //System.out.println("array is:"+Arrays.toString(A));

        //System.out.println("missing element is: "+missingElement(A));

        //new InheritTests();
    }


    private static int missingElement(int[] pA) {

        int sum = (pA.length +1) * (pA.length + 2)/2;



        for (int a : pA)
            sum = sum - a;

        return (int)sum;
    }

    private static int[] decreto(int[] A, int n) {

        int [] result = new int[A.length];
        int j = 0;

        for (int i = n; i < A.length; i++){
            result[j++] = A[i];
        }

        for (int i = 0; i < (A.length - n);i++){
            result[j++] = A[i];
        }

        return result;
    }
    private static void decreto2(int[] A, int n) {


        // 1 2 3 4 5 6
        // 5 6 1 2 3 4

        int a;
        for (;;){

        }
    }


    public static void marketPLanet(List<String> strings){

        assert strings == null;

        if (strings != null) System.out.println("");

        Map<Character, List<Integer>> map = new TreeMap<Character,List<Integer>>();

        Set<Integer> set = new TreeSet<Integer>();

        for (String s : strings){

            Character c = s.charAt(0);

                if (!map.containsKey(c))
                    map.put(c,new ArrayList<Integer>());

                map.get(c).add(Integer.valueOf(s.charAt(1)));

        }

        for ( Map.Entry<Character,List<Integer>> entry: map.entrySet() ) {

            List<Integer> list = entry.getValue();
            Collections.sort(list);
            System.out.println(entry.getKey() + list.toString());
        }

    }

    public static void marketPlanetTest(){

        System.out.println("marketPLanetTest started");
        List<String> list = new ArrayList<String>();

        list.add("A8");
        list.add("C7");
        list.add("B6");
        list.add("Z3");
        list.add("X3");
        list.add("F3");
        list.add("A3");
        list.add("B1");
        list.add("B1");



        Main.marketPLanet(list);

    }

    private class SortedString {

        public SortedString(char letter, int a) {
            this.letter = letter;

            addInt(a);
        }

        public char letter;

        private int [] integers;

        public void addInt(int integer){
            integers[integers.length+1] = integer;
        };

        public void sort(){
            Arrays.sort(integers);
        }
    }
}
