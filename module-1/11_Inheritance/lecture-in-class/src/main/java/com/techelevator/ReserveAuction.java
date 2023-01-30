package com.techelevator;

public class ReserveAuction extends Auction {

    private int reservePrice;

    /**
     *
     * @param itemForSale the name of the auction item
     * @param reservePrice the minimum price for the item
     */
    public ReserveAuction(String itemForSale, int reservePrice){
        super(itemForSale);
        this.reservePrice = reservePrice;
    }

    @Override
    public boolean placeBid(Bid offeredBid){
        boolean isCurrentWinningBid = false;
        if (offeredBid.getBidAmount() >= this.reservePrice){
            isCurrentWinningBid = super.placeBid(offeredBid);
        }
        return isCurrentWinningBid;
    }


}
