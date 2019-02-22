<template>
  <div class="card-deck marginT20">
    <div class="card" v-for="data in list">
      <img class="card-img-top" v-bind:src="data.src" alt="">
      <div class="card-body">
        <h5 class="card-title">{{data.title}}</h5>
        <p class="card-text">{{data.text}}</p>
        <p class="card-text">
          <small class="text-muted">Last updated 3 mins ago</small>
        </p>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name: "CardComponent",
    data: function () {
      return {
        list: [{
          key: 1, src: require('../assets/images/4.jpg'), title: '这是个描述',
          text: `This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.`
        },
          {key: 2, src: require('../assets/images/5.jpg'), title: '这是个描述',},
          {key: 3, src: require('../assets/images/6.jpg'), title: '这是个描述',}]
      }
    }
  }
</script>

<style>

</style>
