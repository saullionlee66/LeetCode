package PermutationinString567;

import LongestRepeatingCharacterReplacement424.Solution;

public class Main {
    public static void main(String[] args) {
        Solution1 mySolution1 = new Solution1();
        Solution2 mySolution2 = new Solution2();

        String s1 = "ad";
        String s2 = "bcdda";

        System.out.println(mySolution1.checkInclusion(s1,s2));
        System.out.println(mySolution2.checkInclusion(s1,s2));

    }
}
