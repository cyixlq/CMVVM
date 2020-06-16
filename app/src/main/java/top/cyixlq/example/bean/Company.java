package top.cyixlq.example.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {
    public final String name;
    public final double marketCap;
    public final double annualCosts;
    public final double annualRevenue;
    public final List<Employee> employees;
    public final List<Office> offices;

    private Company(Builder builder) {
        List<Employee> builtEmployees = new ArrayList<>();
        for (Employee.Builder employee : builder.employees) {
            builtEmployees.add(employee.build());
        }
        List<Office> builtOffices = new ArrayList<>();
        for (Office.Builder office : builder.offices) {
            builtOffices.add(office.build());
        }
        employees = Collections.unmodifiableList(builtEmployees);
        offices = Collections.unmodifiableList(builtOffices);
        name = builder.name;
        marketCap = builder.marketCap;
        annualCosts = builder.annualCosts;
        annualRevenue = builder.annualRevenue;
    }

    public static class Builder {
        private String name;
        private double marketCap;
        private double annualCosts;
        private double annualRevenue;
        private List<Employee.Builder> employees = new ArrayList<>();
        private List<Office.Builder> offices = new ArrayList<>();

        public Company build() {
            return new Company(this);
        }

        public Builder addEmployee(Employee.Builder employee) {
            employees.add(employee);
            return this;
        }

        public Builder addOffice(Office.Builder office) {
            offices.add(office);
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setMarketCap(double marketCap) {
            this.marketCap = marketCap;
            return this;
        }

        public Builder setAnnualCosts(double annualCosts) {
            this.annualCosts = annualCosts;
            return this;
        }

        public Builder setAnnualRevenue(double annualRevenue) {
            this.annualRevenue = annualRevenue;
            return this;
        }
    }
}