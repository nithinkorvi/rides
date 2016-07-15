package com.contigo.dao.mapper;

import com.contigo.domain.Ride;

import java.util.List;


/**
 * Created by nithin on 7/2/2016.
 */

public interface RideDao {
    public Ride createRide(Ride ride);

    public List<Ride> allrides();

    public Ride getRide(Long Id);


}
