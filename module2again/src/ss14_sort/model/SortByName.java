package ss14_sort.model;

import java.util.Comparator;

public class SortByName implements Comparator<Spending> {
    @Override
    public int compare(Spending o1, Spending o2) {
        if(o1.getNameSpending().compareTo(o2.getNameSpending())>0){
            return 1;
        } else if (o1.getNameSpending().compareTo(o2.getNameSpending())<0) {
            return -1;
        }else
        return o1.compareTo(o2);
    }
}
