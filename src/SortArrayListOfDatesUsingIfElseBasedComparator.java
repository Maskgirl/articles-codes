import java.util.*;

public class SortArrayListOfDatesUsingIfElseBasedComparator {
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
                if (date1.before(date2)) {
                    return -1;
                } else if (date1.after(date2)) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println("ArrayList sorted in ascending order: ");
        for (Date date : dateList) {
            System.out.println(date);
        }
    }
}
