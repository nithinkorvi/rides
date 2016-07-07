package com.contigo.dao.mapper;

import com.contigo.domain.Ride;
import com.contigo.domain.User;

import java.util.List;

/**
 * Created by nithin on 7/2/2016.
 */

public interface RideDao {
    Ride createRide(Ride ride);

    public List<Ride> allrides();

    public Ride getride(Long Id);


}
