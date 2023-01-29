package oopSeminar5.V2.Model;

public class MultModel extends Model {

    @Override
    public String result(double a, double b) {
        
        return String.format("%f * %f = %f", a, b, a * b);
    }
    
}
