import java.util.ArrayList;
import java.util.List;

public class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> result = new ArrayList<>();

        if (grades != null && !grades.isEmpty()) {


            if (grades.get(0) <= 60 && grades.get(0) >= 1) {
                if (grades.get(0) == grades.size() - 1) {

                    for (int i = 1; i <= grades.get(0); i++) {

                        if (grades.get(i) <= 100 && grades.get(i) >= 0) {
                            if (grades.get(i) > 37) {
                                if (grades.get(i) % 5 > 2) {
                                    //wird aufgerunded
                                    result.add((int) Math.ceil(grades.get(i) / 5d) * 5);
                                } else {
                                    //wird nicht aufgerunded
                                    result.add(grades.get(i));
                                }
                            } else {
                                //failing grade
                                result.add(grades.get(i));
                            }
                        } else {
                            //grade ist falsch (größer als 100 oder kleiner als 0)
                            System.out.printf("grade ist falsch!");
                            return null;
                        }
                    }
                } else {
                    //erster eintrag stimmt nicht mit anzahl der grades überein
                    System.out.println("Erster eintrag stimmt nicht mit der Anzahl an grades überein");
                    return null;
                }
            } else {
                //erster eintrag ist größer als 60
                System.out.println("zu viel!!");
                return null;
            }
        }else{
            //null ist übergeben
            System.out.println("null übergeben");
            return null;
        }
        return result;
    }
}
