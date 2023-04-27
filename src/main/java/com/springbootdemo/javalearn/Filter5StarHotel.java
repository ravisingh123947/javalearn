package com.springbootdemo.javalearn;

public class Filter5StarHotel implements FilteringCondition{
    @Override
    public boolean test(Hotel hotel) {
        return hotel.getRating() == 5 ;
    }
}
