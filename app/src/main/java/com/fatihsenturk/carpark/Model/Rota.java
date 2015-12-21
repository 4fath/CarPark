package com.fatihsenturk.carpark.Model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by fatih on 21.12.2015.
 * CarPark App
 */


// Bu class 'i kisilerin her rota yani park ettikleri yerden geri gelene kadar ki yol icin kullanabiliriz , denemek icin olusturdum

public class Rota {
    private String first; //qr dan donen ilk deger yani ilk cekildigi kisim
    private String last;  // qr dan donen son deger yani indi otoparka cektigi qr resmi

    private String mesafe ; // first ile lasr arsinda ki mesafeyi belki tutariz

    private Date date ;     // o gunun tarihi tutulabilir
    private int timeStamb; // bunu da ne kadar sure icerde kaldigini tuatbilirz

    private User user ;  // hangi kullanicinin kullandigi

    private ArrayList<KoseBaslari>  baslariArrayList;  // bunu da koseler icin tutulabilir

    public Rota() {
    }

    public Rota(String first, String last, String mesafe, Date date, int timeStamb, User user, ArrayList<KoseBaslari> baslariArrayList) {
        this.first = first;
        this.last = last;
        this.mesafe = mesafe;
        this.date = date;
        this.timeStamb = timeStamb;
        this.user = user;
        this.baslariArrayList = baslariArrayList;
    }


    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getMesafe() {
        return mesafe;
    }

    public void setMesafe(String mesafe) {
        this.mesafe = mesafe;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTimeStamb() {
        return timeStamb;
    }

    public void setTimeStamb(int timeStamb) {
        this.timeStamb = timeStamb;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<KoseBaslari> getBaslariArrayList() {
        return baslariArrayList;
    }

    public void setBaslariArrayList(ArrayList<KoseBaslari> baslariArrayList) {
        this.baslariArrayList = baslariArrayList;
    }
}
