package com.contigo.controller;

import com.contigo.dao.mapper.RideRequestDao;
import com.contigo.domain.Ride;
import com.contigo.domain.RideRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by nithin on 7/7/2016.
 */
@RestController
@RequestMapping("/request")
public class RideRequestController {
    @Autowired
    private RideRequestDao rideRequestDao;

    public RideRequestDao getRideRequestDao() {
        return rideRequestDao;
    }

    public void setRideRequestDao(RideRequestDao rideRequestDao) {
        this.rideRequestDao = rideRequestDao;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public RideRequest requestRide(RideRequest rideRequest) {
        RideRequest ride = getRideRequestDao().requestRide(rideRequest);
        return ride;
    }
}

