public class Tax {
    public static void main(String[] argc) throws Exception  {
        double income = 120000;
        double contr = income * (8 / 100.0);
        double pension = income * (1 / 100.0);
        double allow = 33400;
    
        double basicTax = ((income - (contr + pension + allow)) * 0.06);
        System.out.println("Contribution is " + contr);
        System.out.println("Pension is " + pension);
        System.out.println("The Tax is " + basicTax);
        }
}
