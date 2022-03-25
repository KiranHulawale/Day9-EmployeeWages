package com.bridgelabz;
import java.util.*;

public class EmployeeWages {

    // class constants
    static final int PART_TIME = 1;
    static final int FULL_TIME = 2;
    static int noOfCompanies,index;

     String COMPANY_NAME;
     int WAGE_PER_HR;
     int MAX_WORKING_DAYS;
     int MAX_WORKING_HRS;
     int totalWage;

    static CompanyEmpWage[] companies;

    public EmployeeWages(int noOfCompanies) {
        for (CompanyEmpWage company : companies)
        {
            int totalWage = calculateTotalWage(noOfCompanies);
            company.setTotalEmployeeWage(totalWage);
            System.out.println(company);
        }
    }

    void WageComputation(int noOfCompanies)
    {
        this.noOfCompanies = EmployeeWages.noOfCompanies;
        companies = new CompanyEmpWage[EmployeeWages.noOfCompanies];
        index = 0;
    }


    void EmployeeWageComputation(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs,int noOfCompanies)
    {
        COMPANY_NAME = companyName;
        WAGE_PER_HR = wagePerHr;
        MAX_WORKING_DAYS = maxWorkingDays;
        MAX_WORKING_HRS = maxWorkingHrs;
        totalWage = 0;
        noOfCompanies=0;
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

    int calculateTotalWage(int company)
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

        return company;
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

    private void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {
        companies[index++] = new CompanyEmpWage(companyName, wagePerHr, maxWorkingDays, maxWorkingHrs);
    }

    public static void main(String args[])
    {
        EmployeeWages company1 = new EmployeeWages(3);
        company1.addCompany("Microsoft", 4, 30, 100);
        company1.addCompany("Google", 5, 40, 170);
        company1.addCompany("Apple", 9, 10, 70);
        company1.calculateTotalWage(noOfCompanies);
    }


}
