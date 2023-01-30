package com.techelevator;

import blue.inclass.demo.Vehicle;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");


        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));
        generalAuction.placeBid(new Bid("Groucho", 5));
        generalAuction.placeBid(new Bid("Chico", 20));
        generalAuction.placeBid(new Bid("Harpo", 0));
        generalAuction.placeBid(new Bid("Gummo", 113));
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids
        Bid currentHighBid = generalAuction.getHighBid();
//
//        List<Bid> allBids = generalAuction.getAllBids();
//        Bid lastBid = allBids.get(allBids.size() -1 );
//
        Bid lastBid = generalAuction.getLastBid();
        System.out.println("Last Bid: " + lastBid.getBidder() + " " + lastBid.getBidAmount());
        System.out.println("Highest Bid: " + currentHighBid.getBidder() + " "  + currentHighBid.getBidAmount());


        System.out.println("============================");
        System.out.println("    Buyout Auction ");
        System.out.println();

        BuyoutAuction buyoutAuction = new BuyoutAuction("Tech Elevator Mug", 55);

        buyoutAuction.placeBid(new Bid("Larry", 5));
        buyoutAuction.placeBid(new Bid("Mo", 20));
        buyoutAuction.placeBid(new Bid("Curly", 15));
        buyoutAuction.placeBid(new Bid("Curly Joe", 55));
        buyoutAuction.placeBid(new Bid("Shemp", 45));
        buyoutAuction.placeBid(new Bid("Larry", 35));

         currentHighBid = buyoutAuction.getHighBid();
         lastBid = buyoutAuction.getLastBid();
        System.out.println("Last Bid: " + lastBid.getBidder() + " " + lastBid.getBidAmount());
        System.out.println("Highest Bid: " + currentHighBid.getBidder() + " "  + currentHighBid.getBidAmount());
        System.out.println();


        System.out.println("============================");
        System.out.println("    Reserve Auction ");
        System.out.println();

        ReserveAuction reserveAuction = new ReserveAuction("Tech Elevator Hat", 80);

        reserveAuction.placeBid(new Bid("Ted Mosby", 35));
        reserveAuction.placeBid(new Bid("Marshall Erickson", 65));
        reserveAuction.placeBid(new Bid("Lily Erickson", 65));
        reserveAuction.placeBid(new Bid("Barney Stinson", 70));
        reserveAuction.placeBid(new Bid("Robin SherBatsky", 20));

        currentHighBid = reserveAuction.getHighBid();
        lastBid = reserveAuction.getLastBid();
        System.out.println("Last Bid: " + lastBid.getBidder() + " " + lastBid.getBidAmount());
        System.out.println("Highest Bid: " + currentHighBid.getBidder() + " "  + currentHighBid.getBidAmount());
        System.out.println();

    }
}
