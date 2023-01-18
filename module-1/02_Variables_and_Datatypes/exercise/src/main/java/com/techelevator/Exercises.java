package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
        int numberOfRacoons = 3;
		int racoonsBackHome = 2;
		int racoonsRemaining = numberOfRacoons - racoonsBackHome;

        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
        int numberOfFlowers = 5;
		int numberOfBees = 3;
		int placeHolderNames = numberOfFlowers - numberOfBees;

        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		  int numberOfPigeons = 1;
		  int numberOfReturningPigeons = 1;
		  int totalNumberOfPigeonsEating = numberOfPigeons + numberOfReturningPigeons;

        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
          int numberOfCentristOwls = 3;
		  int numberOfSmartOwls = 2;
		  int numberOfOwlsPutTogether = numberOfCentristOwls + numberOfSmartOwls;

        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
          int numberOfBeaversWorking = 2;
		  int numberOfBeaversOnBreak = 1;
		  int totalNumberOfWorkingBeavers = numberOfBeaversWorking - numberOfBeaversOnBreak;

        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
          int numberOfToucans = 2;
		  int numberOfToucanGuests = 1;
		  int totalNumberOfToucans = numberOfToucans + numberOfToucanGuests;

        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
          int numberOfSquirrels = 4;
		  int numberOfNuts = 2;
		  int discrepancyOfNuts = numberOfSquirrels - numberOfNuts;

        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		 double quarter = 0.25;
		 double dime = 0.10;
		 double nickel = 0.05;
		 double mrsHiltWallet = quarter + dime + nickel + nickel;

        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
        int brierClass = 18;
		int macAdamsClass = 20;
		int mrsFlanneryClass = 17;
		int overallMuffinCount = brierClass + macAdamsClass + mrsFlanneryClass;

        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double yoyoCost = 0.24;
		double whistleCost = 0.14;
		double totalCost = yoyoCost + whistleCost;

        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
         int riceKrispyTreats = 5;
		 int largeMarshmallows = 8;
		 int miniMarshmallows = 10;
		 int totalMarshmallows = largeMarshmallows + miniMarshmallows;

        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int mrsHiltSnow = 29;
		int brecknockSchool = 17;
		int hiltsExtraSnow = mrsHiltSnow - brecknockSchool;

        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2.50 on a pencil
        case. How much money does she have left?
        */
        double mrsHiltInitialBalance = 10.00;
		double toyTruckPrice = 3.00;
		double pencilCasePrice = 2.50;
		double mrsHiltTotalBalance = mrsHiltInitialBalance - toyTruckPrice - pencilCasePrice;

        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
        int initMarbles = 16;
		int lostMarbles = 7;
		int totalMarbles = initMarbles - lostMarbles;

        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
        int currentSeaShells = 19;
		int desiredSeaShells = 25;
        int neededSeaShells  = desiredSeaShells - currentSeaShells;
        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
         int balloonCount = 17;
		 int redBalloons  = 8;
		 int greenBalloons = balloonCount - redBalloons;

        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		 int presentBooks = 38;
		 int newBooks = 10;
		 int futureBooks = presentBooks + newBooks;

        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int beeLegCount = 6;
		int combinedBeeLegs = beeLegCount * 8;

        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double iceCreamCost = 0.99;
		double iceCream2ConeBulk = iceCreamCost * 2;
        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int rocksNeededForBorder = 125;
		int currentRockCount = 64;
		int rocksNeeded = rocksNeededForBorder - currentRockCount;
        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int marbleCount = 38;
		int marbleLost = 15;
		int remainingMarbles = marbleCount - marbleLost;
        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
         int concertTrip = 78;
		 int tripBackBeforeGas = 32;
		 int remainingMiles = concertTrip - tripBackBeforeGas;

        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int snowShovelingMorning = 90;
		int snowShovelingEvening = 45;
		int totalSnowShoveling = snowShovelingMorning + snowShovelingEvening;
        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
        int hotDogsPurchased = 6;
		double hotDogsCost = 0.50;
		double totalDogCost = hotDogsCost * hotDogsPurchased;

        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int msHiltInitialBalance = 50;
		int pencilCost = 7;
		int amountOfTotalPencils = msHiltInitialBalance / pencilCost;
        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
        int seenButterflies = 33;
		int orangeButterflies = 20;
		int redButterflies = seenButterflies - orangeButterflies;

        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
        double kateCash = 1.00;
		double candyCost = 0.54;
		double kateChange = kateCash - candyCost;

        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
        int currentTreeCount = 13;
		int plantedTreeSeeds = 12;
		int futureTreeCount = currentTreeCount + plantedTreeSeeds;

        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int hoursPerDay = 24;
		int timeUntilGrandma = hoursPerDay * 2;

        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int cousins = 4;
		int giftedGum = 5;
		int totalGumNecessary = giftedGum * cousins;
        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double danWallet = 3.00;
		double candyBar = 1.00;
		double danTotalBalance = danWallet - candyBar;
        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		 int boats = 5;
         int boatPopulation = 3;
		 int totalSeaPopulation = boatPopulation * boats;
        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
         int lego = 380;
		 int lostLego = 57;
		 int totalLego = lego - lostLego;

        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int currentMuffins = 35;
		int neededMuffins = 48;

        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        int willyCrayonCount = 1400;
		int lucyCrayonCount  = 290;
		int crayonDiscrepancy = willyCrayonCount - lucyCrayonCount;
        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersPerPage = 10;
		int pagesOfStickers = 22;
		int totalStickers = 10 * 22;

        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		double cupcakes = 100;
		double children = 8;
		double amountOfCupcakes = cupcakes / children;

        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
        int gingerBreadCookies = 47;
		int jarQuantity = 6;
		int tinyGlassJars = gingerBreadCookies % jarQuantity;

        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
		int croissants = 59;
		int neighbors = 8;
		int giftedCroissants = croissants % neighbors;
        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
         int depressionCookies = 276;
		 int cookieTrayMaxCount = 12;
		 int cookieTrays = depressionCookies / cookieTrayMaxCount;

        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
         int biteSizedPretzels = 480;
		 int servingSize = 12;
		 int totalServings = biteSizedPretzels / servingSize;

        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
         int lemonCupcakes = 53;
		 int lemonCupcakesAbandoned = 3;
		 int lemonBoxes = lemonCupcakes / 3;

        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
         int carrotSticks = 74;
		 int hungryGuests = 12;
		 int eatenSticks = carrotSticks % hungryGuests;
        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
         int teddyBears = 98;
		 int shelfSpace = 7;
		 int shelves = teddyBears / shelfSpace;


        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int familyPhotos = 480;
		int albumContents = 20;
		int photoAlbums = familyPhotos / albumContents;


        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
         int tradingCards = 94;
		 int unfilledBoxes = tradingCards - 88;





        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
         int bookCount = 210;
		 int shelfCount = 10;
		 int booksOnEachShelf = 210 / 10;

        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
         double croissant = 17;
		 double guests = 7;
		 double quantityOfFood = croissant / guests;

	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a standard room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 standard rooms?
	    Hint: Calculate the rate at which each painter can complete a room (rooms / hour), combine those rates,
	    and then divide the total number of rooms to be painted by the combined rate. (goal is 5.043)
	    */
		double billPaintHrs = 1 / 2.15;
		double jillPaintHrs = 1 / 1.90;
		double combined = billPaintHrs + jillPaintHrs;
		int numberOfRooms = 5;
		double totalTime = numberOfRooms / combined;
	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
		String firstName = "Grace";
		String middleInitial = "B";
		String lastName = "Hopper";
		String fullName = lastName + ", " + firstName + " " + middleInitial + ".";
		System.out.println(fullName);
	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		double distanceNewYorkChicago = 800.00;
		double trainTravelDistance = 537.00;
		double milesTraversedSoFar = (trainTravelDistance / distanceNewYorkChicago) * 100;
		int distancePercentage = (int)milesTraversedSoFar;
	}

}
