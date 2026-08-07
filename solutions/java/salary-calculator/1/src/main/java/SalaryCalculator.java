public class SalaryCalculator {

    double baseSalary = 1000.00;
    
    public double salaryMultiplier(int daysSkipped) {
        // prüft Zahl der Fehltage
        return (daysSkipped < 5) ? 1.0 : 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        // prüft  Zahl der verkauften Produkte
        return (productsSold >= 20) ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        // berechne den gesamten Bonus
        return productsSold * bonusMultiplier(productsSold);
    }
    public double finalSalary(int daysSkipped, int productsSold) {
        //
        double gehalt = salaryMultiplier(daysSkipped) * baseSalary + bonusForProductsSold(productsSold);
        
        return (gehalt > 2000) ? 2000 : gehalt;
            
    } 
}
