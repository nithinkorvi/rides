package com.contigo.domain;

import java.util.Date;

/**
 * Created by nithin on 7/2/2016.
 */
public class Ride {
    private Long rideId;
    private String destination;
    private String destinationZipcode;
    private String source;
    private String sourceZipcode;
    private String description;
    private Date rideDate;
    private Long userId;
    private Long passengerCount;
    private Date updatedDate;
    private Date createdDate;

    public Long getRideId() {
        return rideId;
    }

    public void setRideId(Long rideId) {
        this.rideId = rideId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestinationZipcode() {
        return destinationZipcode;
    }

    public void setDestinationZipcode(String destinationZipcode) {
        this.destinationZipcode = destinationZipcode;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceZipcode() {
        return sourceZipcode;
    }

    public void setSourceZipcode(String sourceZipcode) {
        this.sourceZipcode = sourceZipcode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getRideDate() {
        return rideDate;
    }

    public void setRideDate(Date rideDate) {
        this.rideDate = rideDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(Long passengerCount) {
        this.passengerCount = passengerCount;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Date getCreatedDate(java.sql.Date created_date) {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}




