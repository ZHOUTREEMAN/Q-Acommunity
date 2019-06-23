<!--话题tag标签-->
<template>
    <div>
      <span>{{tagName}}</span>
    </div>
</template>

<script>
    export default {
        name: "TalkTag",
        props: {
          tagName: null,
          url: null
        },
        data() {
          return {
          }
        }
    }
</script>

<style scoped>

</style>
