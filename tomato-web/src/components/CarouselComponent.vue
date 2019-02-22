<template>
  <div id="carouselHeadControls" class="carousel slide" data-ride="carousel">
    <div class="carousel-inner">
      <div class="carousel-item" v-bind:class="{'active':img.key == 1}" v-for="img in imgList">
        <img class="d-block w-100" v-bind:src="img.src">
      </div>
    </div>
    <a class="carousel-control-prev" href="#carouselHeadControls" role="button" data-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#carouselHeadControls" role="button" data-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
    <div class="position-absolute w-100 carousel-bottom animated fadeIn">
      <div>这是一段描述</div>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'CarouselComponent',
    data: function () {
      return {
        imgList: [{key: 1, src: require('../assets/images/1.jpg')},
          {key: 2, src: require('../assets/images/2.jpg')},
          {key: 3, src: require('../assets/images/3.jpg')}]
      }
    }
  };
</script>

<style>

</style>
