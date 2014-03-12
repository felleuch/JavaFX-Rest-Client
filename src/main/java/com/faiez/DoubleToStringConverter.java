package com.faiez;

import javafx.util.StringConverter;


public class DoubleToStringConverter extends StringConverter<Double> {

    @Override
    public String toString(Double t) {
        return Double.toString(t);
    }

    @Override
    public Double fromString(String string) {
        return Double.valueOf(string);
    }


}
