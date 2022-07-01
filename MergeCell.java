package com.company.mergecell;

public class MergeCell {

    public static void main(String[] args) {
        // Inputs
        SquareCell s1 = Utils.getSquareCell1();
        SquareCell s2 = Utils.getSquareCell2();

        SquareCell s = MergeCellService.merge(s1,s2);
        System.out.println(s.getF1().printColour());
        System.out.println(s.getF2().printColour());
        System.out.println(s.getF3().printColour());
        System.out.println(s.getF4().getF1().printColour());
        System.out.println(s.getF4().getF2().getF1().printColour());
        System.out.println(s.getF4().getF2().getF2().printColour());
        System.out.println(s.getF4().getF2().getF3().printColour());
        System.out.println(s.getF4().getF2().getF4().printColour());
        System.out.println(s.getF4().getF3().printColour());
        System.out.println(s.getF4().getF4().printColour());

    }

}
