package com.company.mergecell;

public class MergeCellService {

    /**
     * @param s1
     * @param s2
     * this function will bse used incase we need to calculate the
     * sub-square logic with one of the square being null
     * @return
     */
    private static SquareCell getOverrideSquareCell(SquareCell s1, SquareCell s2){
        if(s1==null && s2!=null){
            return s2;
        }else{
            return null;
        }
    }

    /**
     * Handles all the scenarios for merging the squares recursively
     * @param s1
     * @param s2
     * @return
     */
    private static SquareCell mergeSquareCell(SquareCell s1, SquareCell s2){
        SquareCell s;
        if(s1==null && s2==null){
            return null;
        }
        s = getOverrideSquareCell(s1,s2);
        s = s!=null?s:getOverrideSquareCell(s2,s1);
        if(s!=null){
            return s;
        }
        if(s1.getColour()!=null && s2.getColour()!=null){
            return SquareCell.builder()
                    .colour(s1.getColour()&s2.getColour())
                    .processed(1).build();

        }else{
            s = merge(s1,s2);
        }
        return s;
    }

    public static SquareCell merge(SquareCell s1,SquareCell s2){

        if(s1.getColour()!=null && s1.getColour()==0){
            return s1;
        }
        else if(s2.getColour()!=null && s2.getColour()==0){
            return s2;
        }

        if(s1!=null && s1.getColour()!=null && s2!=null && s2.getColour()!=null){
            return SquareCell.builder().colour(s1.getColour() & s2.getColour() )
                    .processed(1)
                    .build();
        }

        return SquareCell.builder()
                .f1(mergeSquareCell(s1.f1,s2.f1))
                .f2(mergeSquareCell(s1.f2,s2.f2))
                .f3(mergeSquareCell(s1.f3,s2.f3))
                .f4(mergeSquareCell(s1.f4,s2.f4))
                .build();

    }

}
