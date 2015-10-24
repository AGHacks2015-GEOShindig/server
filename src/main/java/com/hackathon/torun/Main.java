package com.hackathon.torun;

import java.net.UnknownHostException;


public class Main {



    public static void main(String[] args) throws UnknownHostException {


        String TOKEN = "CAALxbcDtOlcBAPBtLDVazd4CaFcyQHhiKnaNTB73DbjRuIhXSOELOdILEZCV8lS0yD0OJL9SxInvmpuz1UXRZAgs4krEgCzCgGtTpoC2FVbtxVehrHZBEGU3veIvcbzRpOzwVUMzOyxEd79whVUtfaBlanZBnZAmE9CLpsMJBUu4VP6M6tRNu";
        String PAGEID = "905304489529307";

        FacebookConnector facebookConnector = new FacebookConnector(TOKEN,PAGEID);
        facebookConnector.makeTestPost();

    }
}