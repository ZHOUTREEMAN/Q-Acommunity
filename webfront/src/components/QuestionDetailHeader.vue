<!--用户点击进去的题头组件-->
<!--不知道绑定会不会成功。。。。-->
<template>
  <talk-tag v-for="talkTopic in talkTopics" v-bind:tag="talkTopic"></talk-tag>
  <h4>{{title}}</h4>
  <div>
    <button v-on:click="">关注问题</button>
    <button v-on:click="">写回答</button>
    <button v-on:click="">邀请回答</button>
    <div>
      <icon>评论</icon><!--ui图标-->
      <span>{{commentNum}}条评论</span>
      <icon>分享</icon>
      <icon>举报</icon>
    </div>
    <span></span>
    <span></span>
  </div>
</template>

<script>

  import TalkTag from "./TalkTag";
    export default {
        name: "QuestionDetail",
      components: {TalkTag},
      component: '@component/talkTag',
        data() {
          return {
            talkTopics: [
              {url: null, tag: null}
            ],
            title: null,
            commentNum: 0
          }
        }
    }
</script>

<style scoped>

</style>
