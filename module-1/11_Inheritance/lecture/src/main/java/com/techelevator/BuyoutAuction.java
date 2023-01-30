package com.techelevator;

public class BuyoutAuction extends Auction {

    private int buyoutPrice;


    /**
     *
     * @param ItemForSale The item up for auction.
     * @param buyOutPrice Buy it now price.
     */
    public BuyoutAuction(String ItemForSale,int buyOutPrice) {
        super(ItemForSale);
        this.buyoutPrice = buyoutPrice;

    }
    public int getBuyoutPrice(){
        return this.buyoutPrice;
    }
    @Override
    public boolean placeBid(Bid offeredBid){
        boolean isCurrentWinningBid = false;
        if (getHighBid().getBidAmount() < buyoutPrice){

            if (getHighBid().getBidAmount() > buyoutPrice)
            offeredBid = new Bid(offeredBid.getBidder(), buyoutPrice);
        }
        isCurrentWinningBid = super.placeBid(offeredBid);

     return isCurrentWinningBid;
    }

}
