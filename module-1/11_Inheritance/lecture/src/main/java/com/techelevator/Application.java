package com.techelevator;

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
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids
     Bid currentHighBid = generalAuction.getHighBid();
     Bid lastBid = generalAuction.getLastBid();
        System.out.println("Last Bid: " + lastBid.getBidder() + " at $" + lastBid.getBidAmount() + " || " + " Current Bid: " + currentHighBid.getBidder() + " at $" + currentHighBid.getBidAmount());


        System.out.println("-----------------");
        System.out.println("Buyout Auction commencing");
        //Auction
        Auction buyoutAuction = new BuyoutAuction("Dildo Collection", 500);
        //Bids
        generalAuction.placeBid(new Bid("Poor Sap Who Bid an Hour Before Auction Ends", 20));
        generalAuction.placeBid(new Bid("Buddy", 30));
        generalAuction.placeBid(new Bid("Pal", 45));
        generalAuction.placeBid(new Bid("Amigo", 21));

        Bid currentHighBid = generalAuction.getHighBid();
        Bid lastBid = generalAuction.getLastBid();
        System.out.println("Last Bid: " + lastBid.getBidder() + " at $" + lastBid.getBidAmount() + " || " + " Current Bid: " + currentHighBid.getBidder() + " at $" + currentHighBid.getBidAmount());



    }
}
