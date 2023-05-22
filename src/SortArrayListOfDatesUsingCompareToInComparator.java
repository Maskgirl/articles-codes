import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class SortArrayListOfDatesUsingCompareToInComparator {
    public static void main(String[] args) {
        ArrayList<Date> dateList = new ArrayList<>();
        dateList.add(new Date(2021, 10, 15));
        dateList.add(new Date(2022, 5, 20));
        dateList.add(new Date(2020, 12, 31));

        System.out.println("Original ArrayList: ");
        for (Date date : dateList) {
            System.out.println(date);
        }

        Collections.sort(dateList, new Comparator<Date>() {
            @Override
            public int compare(Date date1, Date date2) {
                return date1.compareTo(date2);
            }
        });

        System.out.println("ArrayList sorted in ascending order: ");
        for (Date date : dateList) {
            System.out.println(date);
        }
    }
}
