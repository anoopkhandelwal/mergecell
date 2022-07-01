package com.company.mergecell;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.company.mergecell.Utils.*;

public class MergeCellTest {



    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void mergeWhites(){
        SquareCell s = MergeCellService.merge(
                getSquareCell1().getF1(),getSquareCell2().getF1()
        );
        Assert.assertEquals(String.valueOf(s.getColour()),"1");
    }

    @Test
    public void mergeBlacks(){
        SquareCell s = MergeCellService.merge(
                getSquareCell1().getF3(),getSquareCell2().getF3()
        );
        Assert.assertEquals(String.valueOf(s.getColour()),"0");
    }

    @Test
    public void mergeBlackWithSubSquares(){
        SquareCell s = MergeCellService.merge(
                getSquareCell1().getF2(),getSquareCell2().getF2()
        );
        Assert.assertEquals(String.valueOf(s.getColour()),"0");
    }

    @Test
    public void mergeWhiteWithSubSquares(){
        SquareCell s = MergeCellService.merge(
                getSquareCell1().getF4(),getSquareCell2().getF4()
        );
        Assert.assertNotNull(s.getF1());
        Assert.assertNotNull(s.getF2());
        Assert.assertNotNull(s.getF3());
        Assert.assertNotNull(s.getF4());
    }

    @Test
    public void mergeBlackAndWhite(){
        SquareCell s = MergeCellService.merge(
                getSquareCell1().getF1(),getSquareCell2().getF3()
        );
        Assert.assertEquals(String.valueOf(s.getColour()),"0");
    }

    @Test
    public void mergeSubsquares(){
        SquareCell s = MergeCellService.merge(
                getSquareCell2().getF4(),getSquareCell2().getF4()
        );
        Assert.assertNotNull(s.getF1());
        Assert.assertNotNull(s.getF2());
        Assert.assertNotNull(s.getF3());
        Assert.assertNotNull(s.getF4());

        Assert.assertEquals(String.valueOf(s.getF1().getColour()),"1");
        Assert.assertEquals(String.valueOf(s.getF4().getColour()),"0");
        Assert.assertEquals(String.valueOf(s.getF2().getF3().getColour()),"1");
        Assert.assertNull(s.getF2().getColour());
    }

    @Test
    public void mergeSubsquares2(){
        SquareCell s = MergeCellService.merge(
                getSquareCell2().getF4(),getSquareCell3()
        );
        Assert.assertNotNull(s.getF1());
        Assert.assertNotNull(s.getF2());
        Assert.assertNotNull(s.getF3());
        Assert.assertNotNull(s.getF4());

        Assert.assertEquals(String.valueOf(s.getF1().getColour()),"1");
        Assert.assertEquals(String.valueOf(s.getF2().getColour()),"0");
        Assert.assertEquals(String.valueOf(s.getF3().getColour()),"0");
        Assert.assertEquals(String.valueOf(s.getF4().getColour()),"0");

        Assert.assertNotNull(s.getF4().getColour());
    }

}
