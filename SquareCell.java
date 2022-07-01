package com.company.mergecell;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
class SquareCell {
    SquareCell f1;
    SquareCell f2;
    SquareCell f3;
    SquareCell f4;
    // 0 = BLACK and 1=WHITE , could have used ENUM as well
    // since black can overlap incase of merge, so we can easily do a bitwise 'AND'

    // it can be null incase - it has subsquares
    // the otherway would be to take white i.e. '1' as its default value
    Integer colour;
    int processed =0;

    /**
     * @return
     * keeping a isProcessed check just to make sure,
     * we don't execute the same logic again
     * Incase a square is coloured, it is assumed that the colour field is present
     * and its sub-squares can be taken as null
     * To avoid processed- we can initialise the colour with 'white' as default.
     */
    public Integer getColour(){

        if(colour!=null){
            processed = 1;
            return colour;
        }
        if(processed==1){
            return colour;
        }
        processed = 1;
        Boolean isNull = f1.getColour()==null || f2.getColour()== null || f3.getColour() == null || f4.getColour()== null;
        if(isNull){
            return null;
        }
        int sum = f1.getColour()+ f2.getColour() +f3.getColour() + f1.getColour() + f4.getColour();
        colour = sum%4==0?f1.getColour():null;
        return colour;
    }

    public String printColour(){
        if(colour==1){
            return "WHITE";
        }
        return "BLACK";
    }

}
