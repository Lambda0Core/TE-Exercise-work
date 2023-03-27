<template>
    <div class="main">
        <h2>Products for {{ name }}</h2>

        <p class = "description">{{ description }}</p>
    </div>
</template>

<script>
export default ({
    name: 'product-review',
    data() {
        return {
            name: 'Cigar Party for Dummies',
            description: 'Host and plan for the perfect cigar party for all your squirelly friends.'
        }
    }
})
</script>

<style scoped>
div.main {
    margin: 1rem 0;
}
</style>