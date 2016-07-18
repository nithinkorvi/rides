package com.contigo.controller;

import com.contigo.dao.mapper.RideDao;
import com.contigo.domain.Ride;
import com.contigo.exception.ControllerException;
import com.contigo.exception.DaoException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by nithin on 7/2/2016.
 */
@RestController
@RequestMapping("/ride")
public class RideController {

    private static final Logger logger = Logger.getLogger(RideController.class);

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
        Ride newRide = getRideDao().createRide(ride);
        return newRide;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Ride> getAllRides() {
        List<Ride> rides = getRideDao().allrides();
        return rides;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Ride getRide(@PathVariable Long id) {
        try {
            Ride ride = getRideDao().getRide(id);
            return ride;
        } catch (DaoException d) {
            logger.error("invalid ride",d);
            throw new ControllerException(HttpStatus.BAD_REQUEST, "Invalid ride id provided");
        } catch (Exception e) {
            logger.error("Something went wrong ",e);
            throw new ControllerException(HttpStatus.BAD_REQUEST, "Some thing went wrong, check with support");
        }
    }

}
