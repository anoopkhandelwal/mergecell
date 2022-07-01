package com.company.mergecell;

public class Utils {

    public static SquareCell getSquareCell1(){
        return SquareCell.builder()
                .f1(SquareCell.builder()
                        .colour(1).build())
                .f2(SquareCell.builder()
                        .colour(0).build())
                .f3(SquareCell.builder()
                        .colour(0).build())
                .f4(SquareCell.builder()
                        .colour(1).build())
                .build();
    }

    public static SquareCell getSquareCell2(){

        return SquareCell.builder()
                .f1(SquareCell.builder()
                        .colour(1).build())
                .f2(SquareCell.builder()
                        .colour(0).build())
                .f3(SquareCell.builder()
                        .colour(0).build())
                .f4(SquareCell.builder()
                        .f1(
                                SquareCell.builder().colour(1).build()
                        )
                        .f2(
                                SquareCell.builder()
                                        .f1(
                                                SquareCell.builder().colour(0).build()
                                        )
                                        .f2(
                                                SquareCell.builder().colour(1).build()
                                        )
                                        .f3(
                                                SquareCell.builder().colour(1).build()
                                        )
                                        .f4(
                                                SquareCell.builder().colour(0).build()
                                        ).build()
                        )
                        .f3(
                                SquareCell.builder().colour(1).build()
                        )
                        .f4(
                                SquareCell.builder().colour(0).build()
                        )
                        .build())
                .build();
    }

    public static SquareCell getSquareCell3(){
        return SquareCell.builder()
                .f1(
                        SquareCell.builder().colour(1).build()
                )
                .f2(
                        SquareCell.builder().colour(0).build()
                ).f3(
                        SquareCell.builder().colour(0).build()
                ).f4(
                        SquareCell.builder().colour(1).build()
                ).build();
    }
}
