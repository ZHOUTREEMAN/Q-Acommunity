<template>
  <div class="answer">
    <el-container>
      <el-header>
        <img :src="userHeaderPictureURL" style="float: left;"/>
        <div class="user-information" style="float: left">
          <span>{{userName}}</span>
          <p>{{userDiscribe}}</p>
        </div>
        <br/><br/>
        <p style="font-size: 12px;color: #8c939d">{{supportNum}}人赞同了此回答</p>
      </el-header>

      <el-main>
          <div v-html="content" class="main-content">
            {{content}}
          </div>
      </el-main>
    </el-container>
  </div>
</template>

<script>
    export default {
        name: "Answer",
        props: ['answerID'],
        data() {
          return {
            userName: "测试用户名",
            userDiscribe: "测试用户描述,哈哈哈哈哈哈哈哈，用户描述尽量简短哦",
            userHeaderPictureURL: require("../assets/logo.png"),
            supportNum: 0,
            content: '<p>我靠，我真的只是一个测试样例</p>'
          }
        },
        methods: {

        }
    }
</script>

<style scoped>
.answer{
  width: 45%;
}
  .el-header img{
    width: 5%;
    min-width: 44px;
  }
  .user-information span{
    font-size: 12px;
    font-weight: bold;
    margin: 6px;
  }
  .user-information p{
    font-size: 12px;
    margin: 6px;
  }
  .el-main{
    padding: 0px;
    padding-left: 20px;
  }
  .main-content{
    font-size: 12px;
    word-wrap: break-word;
  }
</style>
