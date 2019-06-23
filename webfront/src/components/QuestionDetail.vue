<!--问题点进去的主体部分-->
<template>
  <img :src="userDiscribe"/>
  <div>
    <span>{{userName}}</span>
    <span>{{userDiscribe}}</span>
    <div>
      <slot></slot>

    </div>
  </div>
</template>

<script>
    export default {
        name: "QuestionDetail",
        props: {
          userID: {
            type: String,
            default: null
          },
          userName: {
            type: String,
            default: null
          },
          userDiscribe: {
            type: String,
            default: null
          },
          userPhotoUrl: {
            type: String,
            default: null
          },
          answerID: {
            type: String,
            default: null
          }
        },
        data() {
          return {
          }
        },
        mounted() {
          this.userDiscribe = getUserDiscribe(this.userName)
        },
        methods: {

        }
    }
</script>

<style scoped>

</style>
