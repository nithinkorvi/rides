package com.contigo.controller;

import com.contigo.dao.mapper.RideDao;
import com.contigo.domain.Ride;
import com.contigo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.contigo.domain.Ride;

/**
 * Created by nithin on 7/2/2016.
 */
@RestController
@RequestMapping("/ride")
public class RideController {
    @Autowired
    private RideDao rideDao;

    public void setRideDao(RideDao rideDao) {
        this.rideDao = rideDao;
    }

    public RideDao getRideDao() {
        return rideDao;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Ride createRide(@RequestBody Ride ride) {
        ride = getRideDao().createRide(ride);
        return ride;
    }


    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Ride> getAllRides() {
        List<Ride> rides = getRideDao().allrides();
        return rides;
    }
}
