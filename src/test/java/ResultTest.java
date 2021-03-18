import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResultTest {

    List<Integer> list = new ArrayList<>();
    List<Integer> expected = new ArrayList<>();
    List<Integer> actual = new ArrayList<>();

    @BeforeAll
    static void init() {

    }

    @BeforeEach
    void setUp() {

    }

    @Test
    void testResult_1(){ //ein Eintrag nicht aufrunden
        Integer[] array = {1, 56};
        list = Arrays.asList(array);
        expected.add(56);
        actual = Result.gradingStudents(list);
        assertEquals(expected, actual);
    }

    @Test
    void testResult_2(){ //Beispiel aus dem PDF (mit und ohne Aufrunden)
        Integer[] array = {4, 73, 67, 38, 33};
        list = Arrays.asList(array);
        Integer[] arrayEx = {75, 67, 40, 33};
        expected = Arrays.asList(arrayEx);
        actual = Result.gradingStudents(list);
        assertEquals(expected, actual);
    }

    @Test
    void testResult_3(){ //null übergeben
        list = null;
        expected = null;
        actual = Result.gradingStudents(list);
        assertEquals(expected, actual);
    }

    @Test
    void testResult_4(){ //leere Liste übergeben
        expected = null;
        actual = Result.gradingStudents(list);
        assertEquals(expected, actual);
    }

    @Test
    void testResult_5(){//erster Eintrag stimmt nicht mit der Anzahl an grades überein
        Integer[] array = {4, 53, 65, 61};
        list = Arrays.asList(array);
        expected = null;
        actual = Result.gradingStudents(list);
        assertEquals(expected, actual);
    }

    @Test
    void testResult_6(){//liste ist größer als 60
        Integer[] array = {61, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 ,21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61};
        list = Arrays.asList(array);
        expected = null;
        actual = Result.gradingStudents(list);
        assertEquals(actual, expected);
    }

    @Test
    void testResult_7(){//grade größer als 100
        Integer[] array = {4, 41, 45, 87, 101};
        list = Arrays.asList(array);
        expected = null;
        actual = Result.gradingStudents(list);
        assertEquals(expected, actual);
    }

    @Test
    void testResult_8(){//grade ist kleiner als 0
        Integer[] array = {3, -1, 42, 50};
        list = Arrays.asList(array);
        expected = null;
        actual = Result.gradingStudents(list);
        assertEquals(actual, expected);
    }


}
