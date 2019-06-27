<template>
  <div id="app">
    <el-button v-on:click="openDialog">打开测试</el-button>
    <publish-issues v-if="isOpenDialog" v-bind:visible="isOpenDialog"></publish-issues>
  </div>
</template>

<script>
import NoteArea from "./components/NoteArea";
import PictureUpload from "./components/pictureUpload";
import HotList from "./components/HotList";
import QuestionDetail from "./components/QuestionDetailHeader";
import Answer from "./components/Answer";
import PublishIssues from "./components/PublishIssues";
export default {
  name: 'App',
  components: {PublishIssues, Answer, HotList, PictureUpload, NoteArea,QuestionDetail},
  data(){
    return{
      isOpenDialog: false
    }
  },
  methods: {
    openDialog: function(){
      this.isOpenDialog = true
      console.log(this.isOpenDialog)
    }
  }
}
</script>


