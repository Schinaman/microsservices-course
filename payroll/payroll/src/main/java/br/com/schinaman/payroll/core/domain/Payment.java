package br.com.schinaman.payroll.core.domain;

import java.io.Serializable;
import java.util.Objects;

public class Payment implements Serializable{


    private String name;
    private Double dailyIncome;
    private Integer days;

    public Payment() {
    }

    public Payment(String name, Double dailyIncome, Integer days) {
        this.name = name;
        this.dailyIncome = dailyIncome;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(Double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(name, payment.name) && Objects.equals(dailyIncome, payment.dailyIncome) && Objects.equals(days, payment.days);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dailyIncome, days);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "name='" + name + '\'' +
                ", dailyIncome=" + dailyIncome +
                ", days=" + days +
                '}';
    }

    public Double getTotal(){
        return days*dailyIncome;
    }
}
