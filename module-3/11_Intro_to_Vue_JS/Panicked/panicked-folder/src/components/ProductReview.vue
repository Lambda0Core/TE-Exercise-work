<template>
    <div class="main">
        <h2>Products for {{ name }}</h2>

        <p class = "description">{{ description }}</p>
<div class="well-display">
    <div class="well">
        <span class="amount"></span>
        Average rating
    </div>
    <div class="well"><span class="amount">{[ numberOfOneStarReviews }}</span>1 Star Review</div>
    <div class="well"><span class="amount">{[ numberOfTwoStarReviews }}</span>2 Star Review</div>
    <div class="well"><span class="amount">{[ numberOfThreeStarReviews }}</span>3 Star Review</div>
    <div class="well"><span class="amount">{[ numberOfFourStarReviews }}</span>4 Star Review</div>
    <div class="well"><span class="amount">{[ numberOfFiveStarReviews }}</span>5 Star Review</div>
</div>

    </div>
    <div class = "review" v-for="review in reviews" v-bind:key="review.id">
        <h4> {{ review.reviewer }} </h4>
        <div class = "rating">
            <img src="../assets/star.png" 
            vbind:title="review.rating + 'Star Review'"
            class="ratingStar"
            v-for="n in review.rating"
            v-bind:key="n"
            >
        </div>
        <h3> {{ review.title }}</h3>
        <p>{{ review.review }}</p>


    </div>
</template>


<script>
export default ({
    name: 'product-review',
    data() {
        return {
            name: 'Cigar Party for Dummies',
            description: 'Host and plan for the perfect cigar party for all your squirelly friends.',
            reviews : [
                {
                    reviewer: "Malcolm Gladwell",
                    title: "What a book!",
                    review: "It certainly is a book... I mean, I can see that.",
                    rating: 3
                },
                {
                    reviewer: "Timmy Ferriss",
                    title: "Had a cigar party started in less than 4 hours!",
                    review: "It's amazing, we all blew smoke in the faces of the less fortunate with a fat stogie in our mouths!",
                    rating: 4,
                    favorited: false
                },

            ]
            
        }
    },
     computed: {
         averageRating() {
             let sum = this.reviews.reduce( (currentSum, review) => {
                 return currentSum + review.rating;
             }, 0)

             return sum/ this.reviews.length;
         },
         numberOfOneStarReviews() {
             return this.reviews.reduce( (currentCount, review) =>{
                 return currentCount + (review.rating == 1);
             }, 0)
         },
         numberOfTwoStarReviews() {
             return this.reviews.reduce( (currentCount, review) =>{
                 return currentCount + (review.rating == 1);
             }, 0)
         },
         numberOfThreeStarReviews() {
             return this.reviews.reduce( (currentCount, review) =>{
                 return currentCount + (review.rating == 1);
             }, 0)
         },
         numberOfFourStarReviews() {
             return this.reviews.reduce( (currentCount, review) =>{
                 return currentCount + (review.rating == 1);
             }, 0)
         },
         numberOfFiveStarReviews() {
             return this.reviews.reduce( (currentCount, review) =>{
                 return currentCount + (review.rating == 1);
             }, 0)
         }
     }
})
</script>

<style scoped>
div.main {
    margin: 1rem 0;
    display:flex;
    flex-direction: column;
    justify-content: center;
}
div.main div.well-display {
    display: flex;
    justify-content: space-around;
    margin-bottom: 1rem;
}

div.main div.well-display div.well {
    display: inline-block;
    width: 15%;
    border: 1px black solid;
    border-radius: 6px;
    text-align: center;
    margin: 0.25rem;
    padding: 0.25rem;
}

div.main div.well-display div.well span.amount {
    color: darkslategray;
    display: block;
    font-size: 2.5rem;
}

div.main div.review {
    border: 1px black solid;
    border-radius: 6px;
    padding: 1rem;
    margin: 10px;
}

div.main div.review div.rating {
    height: 2rem;
    display: inline-block;
    vertical-align: top;
    margin: 0 0.5rem;
}

div.main div.review div.rating img {
    height: 100%;
}

div.main div.review p {
    margin: 20px;
}

div.main div.review h3 {
    display: inline-block;
}

div.main div.review h4 {
    font-size: 1rem;
}
</style>