package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int res = 0;
        int skip = 0;
        if (numberToSkip<0){System.out.println("last number in row is negative");}
        if (numberToSkip>lastInRow){System.out.println("number to skip is bigger then the last");}
        if (numberToSkip>0&&numberToSkip<=lastInRow){

        for (int i = 0; i <= lastInRow; i++) {
            if (i <= numberToSkip) {
                skip+=i;
            }else{res+=i;}


        }

        System.out.println("skipped sum is "+ skip);
            System.out.println("counted sum is "+ res);}
    }
}
