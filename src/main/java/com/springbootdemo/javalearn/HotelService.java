package com.springbootdemo.javalearn;

import java.util.ArrayList;
import java.util.List;

public class HotelService {
    List<Hotel> hotels = new ArrayList<>();

    public HotelService() {
        hotels.add(new Hotel("ravi",5000,5));
        hotels.add(new Hotel("gautam",3000,4));
        hotels.add(new Hotel("shubham",2100,3));
        hotels.add(new Hotel("arya",1500,4));
        hotels.add(new Hotel("soumva",2000,3));
    }

    List<Hotel> getHotels(FilteringCondition filteringCondition) {
        List<Hotel> hotels1 = new ArrayList<>();
        for(Hotel hotel : hotels) {
            if(filteringCondition.test(hotel)) {
                hotels1.add(hotel);
            }
        }
        return hotels1;
    }
}
