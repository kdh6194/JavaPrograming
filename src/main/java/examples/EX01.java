package examples;

public class EX01 {
    public static void main(String[] args){
        System.out.println("*   *    **    ****    ****    *   *      /////    ");
        System.out.println("*   *   *  *   *   *   *   *   *   *     | o o |   ");
        System.out.println("*****  *    *  ****    ****     * *     (|  ^  |)  ");
        System.out.println("*   *  ******  *   *   *   *     *       | [_] |   ");
        System.out.println("*   *  *    *  *    *  *    *    *        _____    ");

        System.out.println("  ");
        System.out.println("            +---+ ");
        System.out.println("            |   | ");
        System.out.println("        +---+---+ ");
        System.out.println("        |   |   | ");
        System.out.println("    +---+---+---+      /\\_/\\       -----     ");
        System.out.println("    |   |   |   |     (  ' ' )    / Hello \\   ");
        System.out.println("+---+---+---+---+     (   -  )   <  Junior |  ");
        System.out.println("|   |   |   |   |      | | |     \\ Coder /   ");
        System.out.println("+---+---+---+---+     (__|__)      -----     ");

        int soju = 3000;
        int sj_qty = 2;
        int chicken = 12000;
        int chck_qty = 1;

        int total = (soju * sj_qty) + (chicken * chck_qty);
        double vat = total * 0.1;

        int money = 50000;
        int charge = money - total;

        System.out.println("  ");
        System.out.print(" [ 음식나라 ] \n");
        System.out.print(" ------------------------ \n");
        System.out.println(" 소주\t\t"+sj_qty+"\t\t"+soju*sj_qty);
        System.out.println(" 너나치킨\t"+chck_qty+"\t\t"+chicken);
        System.out.print(" ------------------------ \n");
        System.out.printf(" 과세합계\t\t\t%d\n",total);
        System.out.printf(" 부가세\t\t\t\t%.0f\n",vat);
        System.out.print(" ------------------------ \n");
        System.out.printf(" 총합계\t\t\t\t%d\n",money);
        System.out.printf(" 받은금액\t\t\t%d\n",total);
        System.out.printf(" 잔돈\t\t\t\t%d\n",charge);
        System.out.print(" ------------------------ \n");
        System.out.println(" 2023. 01. 20\t 13:06:24 ");


    }

}
