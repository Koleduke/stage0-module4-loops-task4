package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {

        if (toBreakWith>0&&toBreakWith<=numberToGoUntil){

            for (int i = 1; i <= numberToGoUntil; i++) {

                if (i <= toBreakWith) {
                    System.out.println(i);

                }else{break;}
            }
            }else{
            System.out.println("iterating till the end");
            for (int j = 1; j <= numberToGoUntil; j++) {


                    System.out.println(j);


            }

        }
    }
}
