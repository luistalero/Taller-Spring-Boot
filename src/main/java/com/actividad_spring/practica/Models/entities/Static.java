package com.actividad_spring.practica.Models.entities;

public class Static {
    Double Count;
    Double Average;
    Double Min;
    Double Max;
    Double Sum;

    public Static(Double count, Double average, Double min, Double max, Double sum) {
        Count = count;
        Average = average;
        Min = min;
        Max = max;
        Sum = sum;
    }

    public Double getCount() {
        return Count;
    }
    public void setCount(Double count) {
        Count = count;
    }
    public Double getAverage() {
        return Average;
    }
    public void setAverage(Double average) {
        Average = average;
    }

    public Double getMin() {
        return Min;
    }

    public void setMin(Double min) {
        Min = min;
    }

    public Double getMax() {
        return Max;
    }

    public void setMax(Double max) {
        Max = max;
    }

    public Double getSum() {
        return Sum;
    }

    public void setSum(Double sum) {
        Sum = sum;
    }
    
}
