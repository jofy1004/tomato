<template>
  <div class="container-fluid marginT100">
    <carousel-component></carousel-component>
    <card-component></card-component>
    <hr class="featurette-divider">
    <div class="row">
      <div class="col-md-7"></div>
      <div class="col-md-5">
        <img src="../assets/images/7.jpg" class="img-fluid" alt="Responsive image">
      </div>
    </div>
    <hr class="featurette-divider">
    <div class="row">
      <div class="col-md-5">
        <img src="../assets/images/8.jpg" class="img-fluid" alt="Responsive image">
      </div>
      <div class="col-md-7"></div>
    </div>
  </div>
</template>

<script>
  import CarouselComponent from './CarouselComponent'
  import CardComponent from './CardComponent'

  export default {
    name: 'HomePage',
    components: {
      'carousel-component': CarouselComponent,
      'card-component': CardComponent
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
