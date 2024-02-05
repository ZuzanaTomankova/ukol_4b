package com.engeto.ja.hotel;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;

public class Booking {

    private Room room;

    private Guest guest;

    private LocalDate startOfStay;
    private LocalDate endOfStay;

    private boolean businessStay;

    public Booking(Room room, Guest guest, LocalDate startOfStay, LocalDate endOfStay, boolean businessStay) {
        this.room = room;
        this.guest = guest;
        this.startOfStay = startOfStay;
        this.endOfStay = endOfStay;
        this.businessStay = businessStay;
    }

    @Override
    public String toString() {
        return "Booking(" +
                "room:" + room +
                ", guest:" + guest +
                ", startOfStay:" + startOfStay +
                ", endOfStay:" + endOfStay +

                '\'' +
                ')';
    }

    //region Přístupové metody
    public LocalDate getStartOfStay() {
        return startOfStay;
    }

    public void setStartOfStay(LocalDate startOfStay) {
        this.startOfStay = startOfStay;
    }

    public LocalDate getEndOfStay() {
        return endOfStay;
    }

    public void setEndOfStay(LocalDate endOfStay) {
        this.endOfStay = endOfStay;
    }

    public boolean isBusinessStay() {
        return businessStay;
    }

    public void setBusinessStay(boolean businessStay) {
        this.businessStay = businessStay;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }
    //endregion

    public void stays (LocalDate startOfStay,LocalDate endOfStay){
    TemporalAmount stay = Period.between(startOfStay, endOfStay);
    int    stays = (int)stay.get(ChronoUnit.DAYS);
        System.out.println("Délka pobytu:" + stays);
    }


}