package com.contigo.controller;

import com.contigo.dao.impl.RideRequestDaoImpl;
import com.contigo.dao.mapper.RideRequestDao;
import com.contigo.domain.RideRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

/**
 * Created by nithin on 7/7/2016.
 */
@RestController
@RequestMapping("/request")
public class RideRequestController {
    private static final Logger logger = Logger.getLogger(RideRequestController.class);

    @Autowired
    @Qualifier("a")
    private RideRequestDao rideRequestDao;
   /* public RideRequestDao getRideRequestDao() {
        return rideRequestDao;
    }

    public void setRideRequestDao(RideRequestDao rideRequestDao) {
        this.rideRequestDao = rideRequestDao;
    }*/

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody

    public RideRequest requestRide(@RequestBody RideRequest rideRequest) {
        logger.debug("Ride request started");
        RideRequest ride = rideRequestDao.requestRide(rideRequest);
        //int x = getRideRequestDao().requestRide(rideRequest);
        logger.debug("ride request completed");
        logger.trace("sample trace");
        logger.warn("im warning u");
        return ride;
    }
}

