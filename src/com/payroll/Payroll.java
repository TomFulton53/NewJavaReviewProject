package com.payroll;

public class Payroll {

    public static void main(String[] args) {
        HourlyEmployee employee1 = new HourlyEmployee("Billy Bob Thornton", 12345, 15.50);
        System.out.println(employee1.getName());
        employee1.work(7.5, Day.SUNDAY);
        employee1.work(6, Day.MONDAY);
        employee1.work(4.5, Day.WEDNESDAY);
        employee1.work(4.1, Day.THURSDAY);
        employee1.work(4.1, Day.THURSDAY);
//        employee1.work(5.5, 4);
//        employee1.work(5.5, -7);

        employee1.setName(null);
        System.out.println(employee1.getName());
        System.out.println(employee1.getName().length());

        System.out.println(employee1.getHoursWorked());

//        Day today = Day.WEDNESDAY;
//        System.out.println(today);
//        System.out.println(today.ordinal());
        System.out.println(employee1.calculatePay());

        SalariedEmployee employee2 = new SalariedEmployee("Jane Jones", 34567, 48000);
        System.out.println("Salary for this month is: " + employee2.calculatePay());

        CommissionEmployee employee3 = new CommissionEmployee("ME", 45678, .05);
//        let's try this first with one day on the first week
        employee3.sell(18000, Day.MONDAY, Week.WEEK1);
        employee3.sell(12000, Day.MONDAY, Week.WEEK1);
        employee3.sell(24000, Day.MONDAY, Week.WEEK1);
//        // OK, multiple sales on a single day works, now let's try the second week and get total
        employee3.sell(17500, Day.TUESDAY, Week.WEEK2);
        System.out.println("Total sales: " + employee3.getTotalSales());  // should be 71500
        System.out.println("Total pay: " + employee3.calculatePay());  // should be 3575

//        I tested this public, then converted to private
//        Day day = Day.SUNDAY;
//        Week week = Week.WEEK2;
//        int index = employee3.getIndex(day, week);
//        System.out.println("Index " + index);

        // 0  1  2  3  4  5  6  7  8  9  10...13

        // OK, now how do I pay ALL my employees?

        Employee currentEmployee = new HourlyEmployee("HourlyGuy", 55555, 15.50);



        Employee[] emps = new Employee[3];
        emps[0] = employee1;
        emps[1] = employee2;
        emps[2] = employee3;
        System.out.println(emps[0].calculatePay());

        // ((SalariedEmployee)(emps[0])).getSalary();  throws ClassCastException
        for (int i = 0; i<emps.length; i++){
            System.out.println("Employee " + i + " pay is " + emps[i].calculatePay());
        }
    }
}
