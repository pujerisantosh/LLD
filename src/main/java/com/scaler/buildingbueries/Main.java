package com.scaler.buildingbueries;

public class Main {
    public static void main(String[] args) {
        Query query = new QueryBuilder()
                .table("employees")
                .columns("id, name, salary")
                .where("salary > 50000")
                .orderBy("salary DESC")
                .build();

        System.out.println(query.getSQL());
    }
    }

