package it.unibo.collections.sets;

import java.util.Collection;
import java.util.TreeSet;

/**
 * Example class using {@link java.util.Set}.
 *
 */
public final class UseSet {

    private static final int ELEMS = 20;

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         *
         * 1) Builds a TreeSet containing Strings
         */
        TreeSet<String> set = new TreeSet<>();
        StringBuilder stringBuilder = new StringBuilder();

        /*
         * 2) Populates such Collection with all the Strings representing numbers ranging from "1" to
         * "20" (both included)
         */

        for (int i = 1; i <= ELEMS; i++) {
            set.add(Integer.toString(i));
            stringBuilder.append(i);
            if (i < ELEMS){
                stringBuilder.append(",");
            }
        }
        /*
         * 3) Prints its content
         */
        System.out.println(stringBuilder);
        /*
         * 4) Removes all those strings whose represented number is divisible by three.
         * Note: the method removeIf(Predicate) is not allowed.
         */
        stringBuilder.setLength(0);
        final TreeSet<String> tempSet = new TreeSet<>();
        for (final String i : set){
            if (Integer.parseInt(i) % 3 == 0){
                tempSet.add(i);
                stringBuilder.append(i);
                stringBuilder.append(",");

            }
        }
        set = tempSet;
        System.out.println(set);
        System.out.println(stringBuilder);
        /*
         * 5) Prints the content of the Set using a for-each construct
         */
        for (var element : set){
            System.out.println(element);
        }
        /*
         * 6) Verifies whether all the numbers left in the set are even
         */
    }
}
