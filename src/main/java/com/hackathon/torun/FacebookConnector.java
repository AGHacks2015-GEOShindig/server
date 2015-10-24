package com.hackathon.torun;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.exception.FacebookException;
import com.restfb.types.Event;
import com.restfb.types.Page;
import com.restfb.types.User;

/**
 * Created by lukasz on 23.10.15.
 */

public class FacebookConnector {

    /* Variables */
    private  String pageAccessToken;
    private  String pageID;
    private FacebookClient fbClient;
    private User myuser = null;    //Store references to your user and page
    private Page mypage = null;    //for later use. In this answer's context, these
    //references are useless.
    private int counter = 0;

    public FacebookConnector(String pageAccessToken, String pageID) {

        this.pageAccessToken = pageAccessToken;
        this.pageID = pageID;

        try {

            fbClient = new DefaultFacebookClient(pageAccessToken);
            myuser = fbClient.fetchObject("me", User.class);
            mypage = fbClient.fetchObject(pageID, Page.class);
            counter = 0;
        } catch (FacebookException ex) {     //So that you can see what went wrong
            ex.printStackTrace(System.err);  //in case you did anything incorrectly
        }
    }

    public Connection<Event> makeTestPost() {
        Connection<Event> eventList =
                fbClient.fetchConnection("search", Event.class,
                        Parameter.with("q", "krakow"), Parameter.with("type", "event"),
                        Parameter.with("limit", "1000"),
                        Parameter.with("fields", "description,location,place,endTime,picture,owner"));


        return eventList;

    }
}
