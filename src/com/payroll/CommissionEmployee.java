package com.payroll;

import java.util.ArrayList;

public class CommissionEmployee extends Employee {
    private double commissionRate;
//    private double[] sales = new double[7];
//    I'm just going to go with 14 days, since I figured out the indexing
    private ArrayList<Double> sales = new ArrayList<>();
    public CommissionEmployee(String name, int employeeId, double commissionRate) {
        super(name, employeeId);
        this.commissionRate = commissionRate;
        initSalesCollection();
    }

    private void initSalesCollection(){
//        this is to make sure I have exactly 14 elements already in the collection
        for (int count=0; count<14; count++){
            sales.add(0D);  // "D" for Double...or use 0.0
        }
    }

    public double getTotalSales(){
        double total = 0;
        for (double totalSalesForDay: sales){
            total += totalSalesForDay;
        }
        return total;
    }

    // how do I get the darn index to work right?
    // Oh, I know...add 7 if week 2
    private  int getIndex(Day day, Week week) {
        int adder = 0;
        if (week == Week.WEEK2){
            adder = 7;
        }
        return day.ordinal() + adder;
//        hey...I was tired  :)
    }

    // use this for two week array
//    public void sell(double salePrice, Day day, Week week){
//        sales[getIndex(day, week)] += salePrice;
//    }

//    this is for a 7 element ArrayList, just to start
//    public void sell(double salePrice, Day day){
//        int index = day.ordinal();
////        this is for array version
////        sales[index] += salePrice;
//        double currentValue = sales.get(day.ordinal());
//        currentValue += salePrice;
//        sales.set(day.ordinal(), currentValue);
//    }

        public void sell(double salePrice, Day day, Week week){
//        this is for array version
//        sales[index] += salePrice;
        int index = getIndex(day, week);
//        a little tricky with a collection...I need to get the existing value at the index, then increment it
//        by the sale price, and set the value back in the collection at that index
        double currentValue = sales.get(index);
        currentValue += salePrice;
        sales.set(index, currentValue);
    }

    @Override
    public double calculatePay() {
        return  commissionRate * getTotalSales() ;
    }

    // do I have direct access to my parent's private features
    // NEWP!!!
}
