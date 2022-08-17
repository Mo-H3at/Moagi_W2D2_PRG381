package PracticalQuestions.q6;

public class Q6Commercial implements Q6 {

    
    private double total;

    @Override
    public double bill(double unit) {
        this.total = unit * 7.50;
        return total;
    }

   
    
}
