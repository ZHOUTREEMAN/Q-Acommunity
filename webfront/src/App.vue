<template>
  <note-area></note-area>
</template>

<script>
import NoteArea from "./components/NoteArea";
import PictureUpload from "./components/pictureUpload";
import HotList from "./components/HotList";
import QuestionDetail from "./components/QuestionDetailHeader";
import Answer from "./components/Answer";
import PublishIssues from "./components/PublishIssues";
import Login from "./components/login";
import Register from "./components/register";
import Header from './components/header'
export default {
  name: 'App',
  components: {Register, Login, PublishIssues, Answer, HotList, PictureUpload, NoteArea,QuestionDetail, Header},
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


