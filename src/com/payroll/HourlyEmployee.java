package com.payroll;

public class HourlyEmployee extends Employee{
// we need to keep track of hourly rate and  hours
// we need to keep track of employee ID
// also name

    private double hourlyRate;  // 15 digits of precision
    private TimeCard timeCard = new TimeCard();
//    private double[] hours = new double[7];

//    public static final int SUNDAY = 0;
//    public static final int MONDAY = 1;
//    public static final int TUESDAY = 2;
//    public static final int WEDNESDAY = 3;
//    public static final int THURSDAY = 4;
//    public static final int FRIDAY = 5;
//    public static final int SATURDAY = 6;

    public HourlyEmployee(String name, int employeeId, double hourlyRate) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {return hourlyRate;}

    public void setHourlyRate(double hourlyRate) {this.hourlyRate = hourlyRate; }

    public double getHoursWorked() {
        return timeCard.getHoursFromTimeCard();
    }


//    public void setHours(double hours) {
//        this.hours = hours;
//    }

    public void work (double hoursWorked, Day day){
        timeCard.recordHours(hoursWorked, day);
    }

    @Override
    public double calculatePay(){

        return timeCard.getHoursFromTimeCard() * hourlyRate;
    }

}
