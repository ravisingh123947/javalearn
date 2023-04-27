package com.springbootdemo.javalearn;

import java.util.List;

public class Main1 {
    public static void main(String[] args) {

         //First way
        //*****************************************
//        FilteringCondition filterHotelLessThan2000 = new FilteringCondition() {
//            @Override
//            public boolean test(Hotel hotel) {
//                return hotel.getPrice() > 2000 ;
//            }
//        };
//        HotelService hotelService = new HotelService();
//        List<Hotel> hotels = hotelService.getHotels(filterHotelLessThan2000);
//        System.out.println(hotels.toString());



        //Second Way
        //***********************************
//        HotelService hotelService = new HotelService();
//        List<Hotel> hotels = hotelService.getHotels(new FilteringCondition() {
//            @Override
//            public boolean test(Hotel hotel) {
//                return hotel.getPrice() > 2000 ;
//            }
//        });
//        System.out.println(hotels.toString());


        //using lambda expression
        HotelService hotelService = new HotelService();
        List<Hotel> hotels = hotelService.getHotels((Hotel hotel) -> hotel.getPrice() > 2000);
        System.out.println(hotels);
    }
}
