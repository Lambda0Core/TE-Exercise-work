<template>
  <div class="card" v-bind:class="{read:book.read}">
      <div class="book-title">{{book.title}}</div>
    <img v-if="book.isbn" class="book-image" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'"/>
    <div class="book-author">{{book.author}}</div>
    <button class="mark-unread" v-on:click.prevent="markReadUnread" v-if="book.read">Mark Unread</button>
     <button class="mark-read" v-on:click.prevent="markReadUnread" v-if="!book.read">Mark Read</button>     
  </div>
</template>

<script>
import NewBookForm from './NewBookForm.vue';
export default {
    name: 'book-card',
     props: {
         book: Object
     },
   methods: {
    markReadUnread() {
      this.$store.commit("FLIP_STATUS", this.book);
    },
  },

    methods: {
        saveBook() {
            this.$store.commit('SAVE_BOOK', this.book);
            this.book = {
                title: '',
                author: '',
                read: false,
                isbn: ''
            };
        }
    }
}
</script>

<style>
.card {
    border: 2px solid black;
    border-radius: 10px;
    width: 250px;
    height: 550px;
    margin: 20px;
}

.card.read {
    background-color: lightgray;
}

.card .book-title {
    font-size: 1.5rem;
}

.card .book-author {
    font-size: 1rem;
}

</style>