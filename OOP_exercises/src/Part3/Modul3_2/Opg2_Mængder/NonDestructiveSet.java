package Part3.Modul3_2.Opg2_Mængder;

import java.util.Set;

public interface NonDestructiveSet<T> extends Set<T> {

    NonDestructiveSet<T> intersection(NonDestructiveSet<T> set1);
    NonDestructiveSet<T> union(NonDestructiveSet<T> set1);
    NonDestructiveSet<T> difference(NonDestructiveSet<T> set1);
    boolean isDisjoint(NonDestructiveSet<T> set1);
    boolean isSubset(NonDestructiveSet<T> set1);
}
