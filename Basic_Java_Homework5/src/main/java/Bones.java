public class Bones {
        // S = Pi * r^2
        //1 cm^2 = 40 kcal

    private double finalResult;
   private double result1;
   private double result2;
   public Bones(double l, double s){

       result1 = (d(c(b(j(l)))));
       result2 = (d(c(b(a(s)))));
       finalResult = result1 - result2;
       printResult();

   }

    private double j(double l){ return l / 2; }

    private double a(double s){ return s / 2; }

    private double b(double z){ return Math.pow(z,2); }

    private double c(double y){ return y * 3.14; }

    private double d(double t){ return t * 40;}

    public void printResult(){
        System.out.println("Your Extra kcal = " + finalResult);

    }

    public double getFinalResult() {
        return finalResult;
    }
}
