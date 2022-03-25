package com.bridgelabz;

public class CompanyEmpWage {
    int totalEmpWage;

    public CompanyEmpWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {

        System.out.println("CompanyName :\" + companyName\n" +
                                          "+ \" WagesPerHr :\" + wagePerHr\n" +
                                             "+ \" MaxWokingDays :\" + maxWorkingDays\n" +
                                                "+ \" MaxWorkingHr :\" + maxWorkingHrs\n" +"");
    }

    public void setTotalEmployeeWage(int totalWage) {
        this.totalEmpWage = totalEmpWage;
    }
}
