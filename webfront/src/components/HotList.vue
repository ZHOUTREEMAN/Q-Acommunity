<!--热榜组件-->
<!--传入问题所有信息-->
<template>
  <div>
    <div>
      <span>{{ranking}}</span>
    </div>
    <div>
      <span>{{questionText}}</span>
      <img v-if="imageURL != null" :src="imageURL"/>
      <div>{{hotInformation}}</div>
    </div>
  </div>
</template>

<script>
    export default {
        name: "HotList",
        props: {
          questionID: {
            type: String,
            default: null
          },
          questionText: {
            type: String,
            default: null
          },
          ranking: {
            type: Number,
            default: 0
          },
          imageURL: {
            type: String,
            default: null
          },
          hotInformation: {
            type: String,
            default: null
          }
        },
        data() {
          return {

          }
        },
        mounted: function(){

        },
        methods: {
          /**
           * 获取问题热榜信息
           */
          getQuestionHotRanking: function (questionID) {

          },
          getPhotoURL: function (questionID) {

          }
        }
    }
</script>

<style scoped>

</style>
