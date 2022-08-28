package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if(salary <= 10000) {
            double taxes = (salary / 100) * 15;
            System.out.println(salary - taxes);
        } else if(salary > 10000 && salary <= 20000) {
            double taxes = (salary / 100) * 18;
            System.out.println(salary - taxes);
        } else if(salary > 20000) {
            double taxes = (salary / 100) * 20;
            System.out.println(salary - taxes);
        } else {
            System.out.println("wrong input!");
        }
    }
}
