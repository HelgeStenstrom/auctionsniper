package test.endtoend.auctionsniper;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

/**
 * @author Helge Stenström on 2018-03-22.
 * @project AuctionSniper
 */
public class AuctionSniperEndToEndTest {
    private final FakeAuctionServer auction = new FakeAuctionServer("item-54321");
    private final ApplicationRunner application = new ApplicationRunner();

    @Test
    public void sniperJoinsAuctionUntilAuctionCloses() throws Exception {
        auction.startSellingItem(); // Step 1
        application.startBiddingIn(auction); // Step 2
        auction.hasReceivedJoinRequestFromSniper(); // Step 3
        auction.announceClosed(); // Step 4
        application.showsSniperHasLostAuction(); // Step 5
    }

    // Additional cleanup
    @AfterEach
    public void stopAuction() {
        auction.stop();
    }

    @AfterEach
    public void stopApplication() {
        auction.stop();
    }
}
