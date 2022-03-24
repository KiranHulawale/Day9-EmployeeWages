package com.bridgelabz;

public class EmployeeWages {

    // class constants
    static final int PART_TIME = 1;
    static final int FULL_TIME = 2;
    // instance constants
     String COMPANY_NAME;
     int WAGE_PER_HR;
     int MAX_WORKING_DAYS;
     int MAX_WORKING_HRS;
    // instance variable
    int totalWage;

    void EmployeeWageComputation(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
    {
        COMPANY_NAME = companyName;
        WAGE_PER_HR = wagePerHr;
        MAX_WORKING_DAYS = maxWorkingDays;
        MAX_WORKING_HRS = maxWorkingHrs;
        totalWage = 0;
    }

    public EmployeeWages(String companyName, int wagePerHour, int workingDaysPerMonth, int workingHoursPerMonth) {
        this.COMPANY_NAME = companyName;
        this.WAGE_PER_HR = wagePerHour;
        this.MAX_WORKING_DAYS = workingDaysPerMonth;
        this.MAX_WORKING_HRS = workingHoursPerMonth;
    }

    int generateEmployeeType()
    {
        return (int) ((Math.random() * 100) % 3);
    }

    int getWorkingHrs(int empType)
    {
        switch (empType)
        {
            case FULL_TIME:
                return 8;
            case PART_TIME:
                return 4;
            default:
                return 0;
        }
    }

    void calculateTotalWage()
    {
        System.out.println("Computation of total wage of " + COMPANY_NAME + " employee");
        int workingHrs;
        for (int day = 1, totalWorkingHrs = 0; day <= MAX_WORKING_DAYS
                && totalWorkingHrs <= MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs)
        {
            int empType = generateEmployeeType();
            workingHrs = getWorkingHrs(empType);
            int wage = workingHrs * WAGE_PER_HR;
            totalWage += wage;
            System.out.println("Total Working Days :" + day);
            System.out.println("Wages:" + wage);
            System.out.println("Total Working Hours :" + totalWorkingHrs);
        }

    }
    @Override
    public String toString() {
        return "EmployeeWages{" +
                "COMPANY_NAME='" + COMPANY_NAME + '\'' +
                ", WAGE_PER_HR=" + WAGE_PER_HR +
                ", MAX_WORKING_DAYS=" + MAX_WORKING_DAYS +
                ", MAX_WORKING_HRS=" + MAX_WORKING_HRS +
                ", totalWage=" + totalWage +
                '}';
    }

    public static void main(String args[])
    {
        EmployeeWages company1 = new EmployeeWages("Google", 8, 20, 100);
        EmployeeWages company2 = new EmployeeWages("Microsoft", 4, 30, 150);

        company1.calculateTotalWage();
        System.out.println(company1);

        company2.calculateTotalWage();
        System.out.println(company2);
    }


}
