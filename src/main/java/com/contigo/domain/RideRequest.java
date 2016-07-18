package com.contigo.domain;

import java.util.Date;

/**
 * Created by nithin on 7/6/2016.
 */
public class RideRequest {
    private Long RequestId;
    private String source;
    private String notes;
    private boolean approved;
    private Date updatedDate;
    private String destinationZipcode;
    private Date createdDate;
    private Long sourceZipCode;
    private String destination;
    private Long rideId;
    private Long userId;

    public Long getRequestId() {
        return RequestId;
    }

    public void setRequestId(Long requestId) {
        RequestId = requestId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getDestinationZipcode() {
        return destinationZipcode;
    }

    public void setDestinationZipcode(String destinationZipcode) {
        this.destinationZipcode = destinationZipcode;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Long getSourceZipCode() {
        return sourceZipCode;
    }

    public void setSourceZipCode(Long sourceZipCode) {
        this.sourceZipCode = sourceZipCode;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Long getRideId() {
        return rideId;
    }

    public void setRideId(Long rideId) {
        this.rideId = rideId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }


}
