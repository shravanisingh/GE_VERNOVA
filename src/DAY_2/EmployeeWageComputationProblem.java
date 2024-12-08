package src.DAY_2;

public class EmployeeWageComputationProblem {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        // uc-1
        boolean present = Math.random()>0.5;
        int wagePerHr = 20;
        int empHrs, empWage;
        if(present){
            System.out.println("Employee is PRESENT");
            empHrs = 8;
        }
        else {
            System.out.println("Employee is ABSENT");
            empHrs = 0;
        }
        empWage = empHrs * wagePerHr;
        System.out.println("Employee's Hours are: " + empHrs);
        System.out.println("Employee's Wage is: " + empWage);
    }
}

