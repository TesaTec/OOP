package Part3.Modul3_2.Opg2_Mængder;

public class Main {
    public static void main(String[] args)
    {
        Integer[] set1 = {1,2,3,4,5,6,7,8,9,10};
        Integer[] set2 = {2,4,5,6,7,11,13,14,15};

        NonDestructiveHashSet<Integer> a  = new NonDestructiveHashSet<Integer>(set1);
        NonDestructiveHashSet<Integer> b = new NonDestructiveHashSet<Integer>(set2);

        NonDestructiveSet<Integer> a_intersects_b = a.intersection(b);
        NonDestructiveSet<Integer> b_intersects_a = b.intersection(a);
        NonDestructiveSet<Integer> a_unions_b = a.union(b);
        NonDestructiveSet<Integer> b_unions_a = b.union(a);
        NonDestructiveSet<Integer> a_difference_b = a.difference(b);
        NonDestructiveSet<Integer> b_difference_a = b.difference(a);

        System.out.println("");
    }
}
