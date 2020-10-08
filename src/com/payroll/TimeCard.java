package com.payroll;

public class TimeCard {
    private double[] hours = new double[7];

    public double getHoursFromTimeCard() {
        // delegate all this to the TimeCard
        double total = 0;
        for (int a = 0; a<hours.length; a++){
            total += hours[a];
        }
        return total;

    }

    public void recordHours (double hoursWorked, Day day){
        if (hoursWorked > 0) {
            hours[day.ordinal()] += hoursWorked;  // this is better
        }
    }
}
