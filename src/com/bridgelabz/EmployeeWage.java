package com.bridgelabz;

public class EmployeeWage<companies, noOfCompanies> extends EmployeeWages {
    public EmployeeWage(String companyName, int wagePerHour, int workingDaysPerMonth, int workingHoursPerMonth) {
        super(companyName, wagePerHour, workingDaysPerMonth, workingHoursPerMonth);
    }


    public interface EmployeeWageBuilder {

        void createWageBuilder(); // public and abstarct
        int getTotalWage(String companyName);

    }

    static CompanyEmpWage[] companies;
    //companies = new CompanyEmpWage[noOfCompanies];
   //  int EmployeeWageComputation(noOfCompanies) {
        //super.WageComputation(noOfCompanies);
        //return 0;
    }

//    public EmployeeWage(int i) {
//        //super();
//    }
