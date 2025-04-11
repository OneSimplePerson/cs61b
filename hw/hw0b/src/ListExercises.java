import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        if (L.isEmpty()){
            return 0;
        } else {
            int res = 0;
            for (int i: L){
                res += i;
            }
            return res;
        }
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        if (L.isEmpty()){
            return new ArrayList<>();
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            for (int l:L){
                if (l % 2 == 0){
                    list.add(l);
                }
            }
            return list;
        }
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        ArrayList<Integer> list = new ArrayList<>();
        for (int l: L1){
            if (L2.contains(l)){
                list.add(l);
            }
        }
        return list;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int count = 0;
        for (String w: words){
            if (w.equals(c)){
                count++;
            }
        }
        return count;
    }
}
