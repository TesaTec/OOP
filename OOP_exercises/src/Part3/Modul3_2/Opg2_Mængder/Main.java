package Part3.Modul3_2.Opg2_Mængder;

public class Main {
    public static void main(String[] args)
    {
        Integer[] set1 = {1,2,3,4,5,6,7,8,9,10};
        Integer[] set2 = {2,4,5,6,7,11,13,14,15};
        Integer[] set3 = {11, 12, 13, 14, 15 };

        NonDestructiveHashSet<Integer> a  = new NonDestructiveHashSet<Integer>(set1);
        NonDestructiveHashSet<Integer> b = new NonDestructiveHashSet<Integer>(set2);
        NonDestructiveHashSet<Integer> c = new NonDestructiveHashSet<Integer>(set3);

        NonDestructiveSet<Integer> a_intersects_b = a.intersection(b);
        NonDestructiveSet<Integer> b_intersects_a = b.intersection(a);
        NonDestructiveSet<Integer> a_unions_b = a.union(b);
        NonDestructiveSet<Integer> b_unions_a = b.union(a);
        NonDestructiveSet<Integer> a_difference_b = a.difference(b);
        NonDestructiveSet<Integer> b_difference_a = b.difference(a);

        System.out.println("set1: " + a);
        System.out.println("set2: " + b);
        System.out.println("-------------------------------------");

        System.out.println("Intersection:");
        System.out.println(a_intersects_b);
        System.out.println(b_intersects_a);
        System.out.println("---------------");

        System.out.println("Union");
        System.out.println(a_unions_b);
        System.out.println(b_unions_a);
        System.out.println("---------------");

        System.out.println("Difference");
        System.out.println(a_difference_b);
        System.out.println(b_difference_a);
        System.out.println("----------------");

        System.out.println("Is set1 disjoint from set2:");
        System.out.println(a.isDisjoint(c));

        System.out.println("Is set1 subset of set2:");
        System.out.println(a.isSubset(b));
        System.out.println("---------------");
        System.out.println("Is set3 subset of set4:");
        System.out.println(a.isSubset(a));
        System.out.println("---------------");

    }
}
