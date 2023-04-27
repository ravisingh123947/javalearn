package com.springbootdemo.javalearn;

public class FilterHotelLessThan2000 implements FilteringCondition{
    @Override
    public boolean test(Hotel hotel) {
        return hotel.getPrice()>2000 ;
    }

}
