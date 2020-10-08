package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoCollections {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Malik Stuckey", 12345, 120.0F);

        ArrayList<Customer> arrayList = new ArrayList<>();
        arrayList.add(cust1);

        cust1 = new Customer("Tom Fulton", 23456, 900F);
        arrayList.add(cust1);
        PreferredCustomer pCust = new PreferredCustomer("Walter Jones", 34567, 45.25F);
        arrayList.add(pCust);
        System.out.println("ArrayList contents");

        for (int a = 0; a<arrayList.size(); a++){
            System.out.println(arrayList.get(a).toString());
        }
        arrayList.clear();

        HashMap<Integer, Customer> hashMap = new HashMap<>();
        Customer cust2 = new Customer("Malik Stuckey", 12345, 120.0F);
        hashMap.put(cust2.getCustNumber(), cust2);
        cust2 = new Customer("Tom Fulton", 23456, 900F);
        hashMap.put(cust2.getCustNumber(), cust2);
        hashMap.put(pCust.getCustNumber(), pCust);
        System.out.println("Hashmap contents");
//        System.out.println(hashMap.get(12345));
//        System.out.println(hashMap.get(23456));
//        System.out.println(hashMap.get(34567));

        for (Map.Entry mapElement : hashMap.entrySet()) {
            int key = (Integer)mapElement.getKey();
            System.out.println(hashMap.get(key));
        }

    }
}
