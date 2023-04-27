package com.springbootdemo.javalearn;

import java.util.List;

class Main {
    public static void main(String[] args) {
          HotelService hotelService = new HotelService();
          List<Hotel> hotels = hotelService.getHotels(new FilterHotelLessThan2000());
          System.out.println("Hotels whose price is greater than 2000 : " + hotels.toString());

        System.out.println("Hotels which is 5 star :" + hotelService.getHotels(new Filter5StarHotel()).toString());
    }
}
