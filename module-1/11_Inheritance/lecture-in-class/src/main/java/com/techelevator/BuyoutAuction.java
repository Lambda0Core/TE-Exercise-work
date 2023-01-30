package com.techelevator;

public class BuyoutAuction extends Auction {

    private int buyoutPrice;

    /**
     *
     * @param itemForSale the auction item
     * @param buyoutPrice the set price that immediately wins the auction
     */
    public BuyoutAuction(String itemForSale, int buyoutPrice){
        super(itemForSale);
        this.buyoutPrice = buyoutPrice;
    }

    public int getBuyoutPrice() {
        return this.buyoutPrice;
    }
    @Override
    public boolean placeBid(Bid offeredBid){
        boolean  isCurrentWinningBid = false;
        if (getHighBid().getBidAmount() < this.buyoutPrice){

            if (offeredBid.getBidAmount() > this.buyoutPrice) {
                offeredBid = new Bid(offeredBid.getBidder(), buyoutPrice);
            }
            isCurrentWinningBid = super.placeBid(offeredBid);
        }
        return isCurrentWinningBid;
    }
}
