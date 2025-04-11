import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import static com.google.common.truth.Truth.assertThat;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ListExercisesTest {

    @Test
    @Order(0)
    @DisplayName("Test sum correctness")
    public void testSum() {
        List<Integer> lst1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> lst2 = new ArrayList<>();

        assertThat(ListExercises.sum(lst1)).isEqualTo(10);
        assertThat(ListExercises.sum(lst2)).isEqualTo(0);
    }

    @Test
    @Order(1)
    @DisplayName("Test evens correctness")
    public void testEvens() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> lstExpected = Arrays.asList(2, 4, 6);

        List<Integer> res = ListExercises.evens(lst);

        assertThat(res).isEqualTo(lstExpected);
    }

    @Test
    @Order(2)
    @DisplayName("Test common correctness")
    public void testCommon() {
        List<Integer> lst1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> lst2 = Arrays.asList(4, 5, 6, 7, 8, 9);
        List<Integer> lst3 = new ArrayList<>();
        List<Integer> lstExpected = Arrays.asList(4, 5, 6);

        List<Integer> res1 = ListExercises.common(lst1, lst2);
        List<Integer> res2 = ListExercises.common(lst2, lst3);

        assertThat(res1).isEqualTo(lstExpected);
        assertThat(res2).isEmpty();
    }

    @Test
    @Order(3)
    @DisplayName("Test countOccurrencesOfC correctness")
    public void testCountOccurrencesOfC() {
        List<String> lst = Arrays.asList("hello", "world", "welcome");

        assertThat(ListExercises.countOccurrencesOfC(lst, 'o')).isEqualTo(3);
        assertThat(ListExercises.countOccurrencesOfC(lst, 'a')).isEqualTo(0);
    }

}
