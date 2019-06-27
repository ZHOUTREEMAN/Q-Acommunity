<!--热榜组件-->
<!--传入问题所有信息-->
<template>
  <div class="hotTemp">
    <el-container>
      <el-aside><p style="margin: 0 auto">{{ranking}}</p></el-aside>
          <div class="main-content">
            <p>{{title}}</p>
            <div class="con">{{text}}</div>
            <div>
              <i class="el-icon-s-opportunity" style="font-size: 12px;float: left">
                {{hotInformation}}热度
              </i>
              <i class="el-icon-s-promotion" style="margin-left: 30px;font-size: 12px;float: left;"><span>分享</span></i>
            </div>

          </div>
          <div class="image-content">
            <img :src="imageURL">
          </div>
    </el-container>
  </div>
</template>

<script>
    export default {
        name: "HotList",
        props: {
          questionID: {
            type: String,
            default: ""
          },
          title: {
            type: String,
            default: "测试标题"
          },
          text: {
            type: String,
            default: "测试内容，稍后修改,真正的男人，敢于面对淋漓的鲜血"
          },
          ranking: {
            type: Number,
            default: 1
          },
          image: "@/assets/logo.png",
          hotInformation: {
            type: Number,
            default: 0
          }
        },
        data() {
          return {
            imageURL: "../static/img/logo.png",
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
  .el-container{
    width: 100%;
    height: 100%;
  }
  .el-aside{
    max-width: 20px;
    width: 5%;
    text-align: center;
    padding-top: 3%;
  }
  .el-aside p{

  }
  .el-header{
  }
  .el-main{
    height: 100%;
    padding: 0px;
    margin: 0;
    border: 0;
    margin: 0;
  }
  .main-content p{
    margin: 12px;
    font-weight: bolder;
    font-size: 16px;
  }
  .main-content .con{
    margin: 12px;
    font-size: 12px;
    overflow: hidden;
    word-wrap: break-word;
    height: 35%;
  }
  .main-content div{
    margin: 12px;
  }
  .hotTemp{
    width: 70%;
    height: 100px;
    border-top: 0.1mm solid;
    border-color: #8c939d;
  }
  .main-content{
    padding-top: 3%;
    width: 68%;
    height: 100%;
    float: left;
    padding: 0;
  }
  .main-content p{
    height: 10px;
  }
  .image-content img{
    width: 100%;
    height: 100%;
  }
  .image-content{
    width: 32%;
    float: left;
    height: 100%;
  }
</style>
