package Part3.Modul3_2.Opg2_Mængder;

import java.util.HashSet;
class NonDestructiveHashSet<T> extends HashSet<T>
                                      implements NonDestructiveSet<T> {
    public NonDestructiveHashSet () {}
    public NonDestructiveHashSet (T[] elements) {
        for (T element: elements) {
            add(element);
        }
    }
    @Override
    public NonDestructiveSet<T> intersection(NonDestructiveSet<T> set2)
    {
        NonDestructiveSet<T> result = new NonDestructiveHashSet<T>();
            result.addAll(this);
            result.retainAll(set2);
            return result;
    }

    @Override
    public NonDestructiveSet<T> union(NonDestructiveSet<T> set2)
    {
        NonDestructiveSet<T> result = new NonDestructiveHashSet<T>();
        result.addAll(this);
        result.addAll(set2);
        return result;
    }

    @Override
    public NonDestructiveSet<T> difference(NonDestructiveSet<T> set2)
    {
        NonDestructiveSet<T> result = new NonDestructiveHashSet<T>();
        result.addAll(this);
        result.removeAll(set2);
        return result;
    }

    @Override
    public boolean isDisjoint(NonDestructiveSet<T> set2)
    {
        NonDestructiveSet<T> a = new NonDestructiveHashSet<T>();
        a.addAll(this);
        a.retainAll(set2);

        if(a.isEmpty())
        {
            return true;
        } else
        {
            return false;
        }

    }

    @Override
    public boolean isSubset(NonDestructiveSet<T> set2)
    {
        NonDestructiveSet<T> a = new NonDestructiveHashSet<T>();
        a.addAll(this);
        return a.containsAll(set2);
    }

}