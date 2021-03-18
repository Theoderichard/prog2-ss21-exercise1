import java.util.ArrayList;
import java.util.List;

public class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> result = new ArrayList<>();

        if (grades == null || grades.isEmpty()) {
            return null;
        }
        if (grades.get(0) > 60 || grades.get(0) < 1) {
            return null;
        }

        if (grades.get(0) != grades.size() - 1) {
            return null;
        }
        for (int i = 1; i <= grades.get(0); i++) {
            if (grades.get(i) > 100 || grades.get(i) < 0) {
                return null;
            }
            if (grades.get(i) < 38) {
                result.add(grades.get(i));
            } else {
                if (grades.get(i) % 5 > 2) {
                    //wird aufgerunded
                    result.add((int) Math.ceil(grades.get(i) / 5d) * 5);
                } else {
                    //wird nicht aufgerunded
                    result.add(grades.get(i));
                }
            }
        }

        return result;
    }
}
