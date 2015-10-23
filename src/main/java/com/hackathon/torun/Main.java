package com.hackathon.torun;

import com.hackathon.torun.database.Event;
import com.mongodb.*;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import java.io.IOException;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


import facebook4j.*;
import facebook4j.auth.AccessToken;
import facebook4j.internal.http.RequestMethod;

/**
 *
 * @author ryan
 * JavaFX Tax Calculator Form Layout
 * and Basic JavaFX Button Event Handler
 */
public class Main {

    private static String categoriesDir;

    public static void main(String[] args) throws UnknownHostException {


        String TOKEN = "CAALxbcDtOlcBAPBtLDVazd4CaFcyQHhiKnaNTB73DbjRuIhXSOELOdILEZCV8lS0yD0OJL9SxInvmpuz1UXRZAgs4krEgCzCgGtTpoC2FVbtxVehrHZBEGU3veIvcbzRpOzwVUMzOyxEd79whVUtfaBlanZBnZAmE9CLpsMJBUu4VP6M6tRNu";
        String PAGEID = "905304489529307";

        FacebookConnector facebookConnector = new FacebookConnector(TOKEN,PAGEID);
        facebookConnector.makeTestPost();


//        String appId = "nope";
//        String appSecret = "<>";
//
//        Facebook facebook = new FacebookFactory().getInstance();
//
//        facebook.setOAuthAppId(appId, appSecret);
//
//        AccessToken at = facebook.getOAuthAccessToken();
//
//        System.out.println(at.toString());

        //String accessTokenString = "CAALxbcDtOlcBADoDUVPGapUu8KCH9xfzSHiPqDiz1nZAgpWO2WLWML1aTPTjDW00f43tZCUBkkL5LBVgiuGHmzeGJjfCb3QrmCJBPkXApfZAeXi2R9NvTH94XHY673XnLZAZBvAMGuxipCj6mwLdzHdxrWZCctc613gYmEmZBUy9RiVH24Vr3KZApoqJPPbTZCDnadF6Tc4shx8Oe0w3CRnGf";
        //AccessToken at = new AccessToken(accessTokenString);
        //facebook.setOAuthAccessToken(at);
//
//
//        FBFetcher fbFetcher = new FBFetcher(facebbok);
//        System.exit(0);




      //  MongoOperations mongoOperation = new MongoTemplate(new SimpleMongoDbFactory(new MongoClientURI("mongodb://admin:d41d8cd98f00b204e9800998ecf8427e@ds036648.mongolab.com:36648/facebookevent")));
       // Collection<Event> eve = new LinkedList<Event>();
        /*try {
            // For every category file
            for(Path categoryFile: Files.newDirectoryStream(Paths.get(categoriesDir))){
                System.out.println(categoryFile.toString());

                // Read category
                FBEventCategory fbCategory = new FBEventCategory(categoryFile);

                // Search events in category
                List<FBEvent> events = fbFetcher.fetchIncomingEvents(fbCategory);

                for(FBEvent ev: events) {
                    System.out.println(ev.getEventID() + " || "  + ev.getLocationCity() + " || " + ev.getEventName());

                  /*  eve.add(new Event(ev.getEventID(),ev.getEventName(),
                            ev.getEventDescription(),ev.getEventCategory(),
                            ev.getEventOwner(),ev.getStartTime(),
                            ev.getPictureURL(),ev.getLocationPlace(),
                            ev.getLocationCity(),ev.getLocationStreet(),"IT"));*/
/*
                    try {
                        // Save data in database
                       // mongoOperation.insert(eve, Event.class);
                    } catch(DuplicateKeyException dk) {System.err.println("* Duplicat event id:" + ev.getEventID());}
                    eve.clear();
                }

                Thread.sleep(1000);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
           */
    }
}