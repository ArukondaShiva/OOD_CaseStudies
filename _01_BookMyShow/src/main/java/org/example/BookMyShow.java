package org.example;

import org.example.enumImpl.Genre;
import org.example.enumImpl.Language;
import org.example.movieImpl.Movie;
import org.example.movieImpl.Show;
import org.example.movieImpl.Theater;
import org.example.userImpl.GuestUser;
import org.example.userImpl.RegisteredUser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class BookMyShow {

    ArrayList<Theater> theaters;
    static HashMap<String,ArrayList<Show>> movieMap;

    private void generateMovieMap(){
        for(Theater theater : theaters){

            ArrayList<Show> shows = theater.getShows();

            for(Show show : shows){

                if(show!=null){

                    if(movieMap.containsKey(show.getMovie().getName())){
                        movieMap.get(show.getMovie().getName()).add(show);
                    }
                    else{
                        ArrayList<Show> movieShowList = new ArrayList<>();
                        movieShowList.add(show);
                        movieMap.put(show.getMovie().getName(),movieShowList);
                    }
                }
            }
        }
    }


    public BookMyShow(ArrayList<Theater> theaters){
        this.theaters = theaters;
        this.movieMap = new HashMap<>();
        generateMovieMap();
        System.out.println(movieMap);
    }


    public static ArrayList<Show> searchShows(String movieName){
        if(movieMap.containsKey(movieName)){
            return movieMap.get(movieName);
        }else{
            return null;
        }
    }


    public static void main(String[] args) {

        System.out.println("----------- BookMyShow ------------");

        // Creating a Guest User
        GuestUser piyush = new GuestUser("Piyush");

        RegisteredUser ayush = new RegisteredUser("Ayush");
        RegisteredUser saurabh = new RegisteredUser("Saurabh");


        // Creating a movies
        Movie kalki2898AD = new Movie("Kalki2898AD", Language.ENGLISH, Genre.SCIFI);
        Movie RRR = new Movie("RRR",Language.ENGLISH,Genre.ACTION);
        Movie OMG2 = new Movie("OMG2",Language.HINDI,Genre.COMEDY);
        Movie Pk = new Movie("Pk",Language.HINDI,Genre.COMEDY);
        Movie mahanati = new Movie("Mahanati",Language.ENGLISH,Genre.BIOGRAPHY);
        Movie sitaramam = new Movie("SITARAMAM",Language.ENGLISH,Genre.ROMANCE);


        // Creating a Theater
        Theater pvr_grip = new Theater("PVR","GRIP Hyderabad",30);
        Theater amb_mall = new Theater("AMB Mall","Hydrabad kothaguda",40);


        // Creating shows for movies
        Show show1,show2,show3,show4;
        show1 = show2 = show3 = show4 = null;

        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMM dd, yyyy HH:mm:ss a");

        try{

            // creating show for movie kalki2898AD on on 7 Jun 2024 @ 9:00 AM in AMB
            String dateInString = "Thursday, Jun 27, 2024 09:00:00 AM";
            Date date = formatter.parse(dateInString);
            show1 = new Show(date,kalki2898AD,amb_mall);


            dateInString = "Thursday, Jun 27, 2024 12:00:00 PM";
            date = formatter.parse(dateInString);
            show2 = new Show(date,RRR,amb_mall);


            dateInString = "Thursday, Jun 27, 2024 09:00:00 AM";
            date = formatter.parse(dateInString);
            show3 = new Show(date,Pk,pvr_grip);


            dateInString = "Thursday, Jun 27, 2024 12:00:00 PM";
            date = formatter.parse(dateInString);
            show4 = new Show(date,OMG2,pvr_grip);

            /*
            amb_mall.addShow(show1);
            amb_mall.addShow(show2);

            pvr_grip.addShow(show3);
            pvr_grip.addShow(show4);

             */

        }
        catch (ParseException e){
            e.printStackTrace();
        }


        // we have two theatres with shows
        // add these theatres to bookMyShow

        ArrayList<Theater> theaterArrayList = new ArrayList<>();
        theaterArrayList.add(amb_mall);
        theaterArrayList.add(pvr_grip);

        BookMyShow bookMyShow = new BookMyShow(theaterArrayList);

        // searching all the shows
        ArrayList<Show> searchedShow = BookMyShow.searchShows("RRR");

        System.out.println("------------ searching for RRR start ----------------------");
        for(Show show : searchedShow){
            System.out.println(show.toString());
        }
        System.out.println("------------ searching for RRR End ----------------------");


        // Ticket Booking Threads
        // Ayush and saurabh needs 10 tickets each
        Show bookShowRequest = searchedShow.get(0);
        TicketBookingThread thread1 = new TicketBookingThread(bookShowRequest,ayush,10);
        TicketBookingThread thread2 = new TicketBookingThread(bookShowRequest,saurabh,10);

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        // now 20 seats booked and 20 seats are remaining

        // now ayush wants to book 15 and saurabh wants to book 10 tickets


        TicketBookingThread thread3 = new TicketBookingThread(bookShowRequest,ayush,15);
        TicketBookingThread thread4 = new TicketBookingThread(bookShowRequest,saurabh,10);

        thread3.start();
        thread4.start();

        try{
            thread3.join();
            thread4.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Ayush old ticket : "+thread1.getTicket());
        System.out.println("Saurabh old ticket : "+thread2.getTicket());
        System.out.println("Ayush new Ticket : "+thread3.getTicket());
        System.out.println("Saurabh new Ticket : "+thread4.getTicket());

    }
}