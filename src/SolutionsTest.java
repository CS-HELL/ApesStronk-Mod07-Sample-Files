import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Test Class
 */
public class SolutionsTest {

    /**
     * Test for the Watermelon Codeforces problem.
     */
    @Test
    public void WatermelonTest() {
        System.out.println("Watermelon Test");
        Assert.assertEquals("YES", Solutions.Watermelon(8));
        System.out.println();
    }

    /**
     * Test for the DigitsSum Codeforces problem.
     */
    @Test
    public void DigitsSumTest() {
        System.out.println("Digits Sum Test");
        Assert.assertArrayEquals(new int[]{0, 1, 1, 3, 88005553}, Solutions.DigitsSum(5, new int[]{1, 9, 10, 34, 880055535}));
        System.out.println();
    }

    /**
     * Test for the InSearchOfAnEasyProblem Codeforces problem.
     */
    @Test
    public void InSearchOfAnEasyProblemTest() {
        System.out.println("In Search Of An Easy Problem Test");
        Assert.assertEquals("HARD", Solutions.InSearchOfFanEasyProblem(3, new int[]{0,0,1}));
        System.out.println();
    }

    /**
     * Test for the WateVusTheCossackAndAContestTest Codeforces problem.
     */
    @Test
    public void VusTheCossackAndAContestTest() {
        System.out.println("Vus The Cos Sack and A Contest Test");
        Assert.assertEquals("Yes", Solutions.VusTheCossackAndAContest(4,4,5));
        System.out.println();
    }

    /**
     * Test for the WordCorrection Codeforces problem.
     */
    @Test
    public void WordCorrectionTest() {
        System.out.println("Word Correction Test");
        Assert.assertEquals("word", Solutions.WordCorrection(4, "word"));
        System.out.println();
    }

    /**
     * Test for the BinaryDecimal Codeforces problem.
     */
    @Test
    public void BinaryDecimalTest() {
        System.out.println("Binary Decimal Test");
        Assert.assertArrayEquals(new int[]{2, 5, 1}, Solutions.BinaryDecimal(3, new int[]{121, 5, 1000000000}));
        System.out.println();
    }

    /**
     * Test for the NewYearAndCountingCard Codeforces problem.
     */
    @Test
    public void NewYearAndCountingCardTest() {
        System.out.println("New Year and Counting Test");
        Assert.assertEquals("2", Solutions.NewYearAndCountingCard("ee"));
        System.out.println();
    }

    /**
     * Test for the IAmBoredWithLife Codeforces problem.
     */
    @Test
    public void IAmBoredWithLife() {
        System.out.println("I am Bored with LIFE Test");
        Assert.assertEquals("6", Solutions.IAmBoredWithLife(3, 4));
        System.out.println();
    }

    /**
     * Test for the WayTooLongWords Codeforces problem.
     */
    @Test
    public void WayTooLongWordsTest() {
        System.out.println("Way Too Long Words Test");
        Assert.assertArrayEquals(new String[]{"word", "l10n", "i18n", "p43s"}, Solutions.WayTooLongWords(4, new String[]{"word", "localization", "internationalization", "pneumonoultramicroscopicsilicovolcanoconiosis"}));
        System.out.println();
    }

    /**
     * Test for the BoyOrGirl Codeforces problem.
     */
    @Test
    public void BoyOrGirlTest(){
        System.out.println("\nBoy Or Girl Test");
        Assert.assertEquals("CHAT WITH HER!", Solutions.BoyOrGirl("wjmzbmr"));
        System.out.println("\n");
    }

    /**
     * Test for the LuckyTicket Codeforces problem.
     */
    @Test
    public void LuckyTicketTest(){
        System.out.println("Luck Ticket Test");
        Assert.assertEquals("YES", Solutions.LuckyTicket(6, 474747));
        System.out.println();
    }

    /**
     * Test for the FakeNews Codeforces problem.
     */
    @Test
    public void FakeNewsTest(){
        System.out.println("Fake News Test");
        Assert.assertEquals("YES", Solutions.FakeNews("heidi"));
        System.out.println();
    }

    /**
     * Test for the DominoPiling Codeforces problem.
     */
    @Test
    public void DominoPilingTest(){
        System.out.println("Domino Piling Test");
        System.out.println("Test 1:");
        Assert.assertEquals(4, Solutions.DominoPiling(2,4));
        System.out.println("\nTest 2:");
        Assert.assertEquals(4, Solutions.DominoPiling(3,3));
        System.out.println("\n");
    }

    /**
     * Test for the BallGame Codeforces problem.
     */
    @Test
    public void BallGameTest(){
        System.out.println("\nBall Game Test");
        System.out.println("Test 1:");
        Assert.assertEquals("2 4 7 1 6 2 9 7 6", Solutions.BallGame(10));
        System.out.println("\nTest 2:");
        Assert.assertEquals("2 1", Solutions.BallGame(3));
        System.out.println("\n");
    }
}
