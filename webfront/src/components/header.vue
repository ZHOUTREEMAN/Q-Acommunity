<template>
    <div class="header">
      <div class="query">
        <el-dialog :visible.sync="queryForm" style="width: 900px;">
          <el-form>
            <el-form-item>
              <el-col :span="4"><img src="../assets/logo.png" style="width: 50px;height: 50px;"/></el-col>
              <el-col :span="18">
                <el-input type="textarea" v-on:focus="getFoucus" v-model="content" :rows="5" style="border: 0">
                  {{content}}
                </el-input>
              </el-col>
            </el-form-item>
            <el-form-item>
              <el-button style="float: right;" size="mini" primary>发布提问</el-button>
            </el-form-item>
          </el-form>
        </el-dialog>
      </div>

        <el-row>
            <el-col :span="2" :offset="1">
                <el-button @click.native="gotoHome" type='text'>首页</el-button>
            </el-col>
            <el-col :span="2">
                <el-button @click.native="gotoTitle" type='text'>话题</el-button>
            </el-col>
            <el-col :span="5">
                <el-input style="padding-top:10px;" v-model="search" placeholder="请输入你想要进行的查询">
                    <el-button @click.native="gotoSearch" slot="append" icon="el-icon-search"></el-button>
                </el-input>
            </el-col>
            <el-col :span="2">
                <el-button style="margin:5px;" @click.native="queryForm = true" type='primary' size='small'>提问</el-button>
            </el-col>
            <el-col :span="1" :offset="7">
                <el-tooltip effect="dark" :content="message?`有${message}条未读消息`:`消息中心`" placement="bottom">
                        <router-link to="/">
                            <i style="padding-top:20px;" class="el-icon-bell"></i>
                        </router-link>
                    </el-tooltip>
            </el-col>
            <el-col :span="1.5"><div class="user-avator"><img style="padding-top:5px;" :src=imgUrl></div></el-col>
            <el-col :span="4.5">
                <el-dropdown style="padding-top:15px;">
                    <span class="el-dropdown-link">{{username}}<i class="el-icon-arrow-down el-icon--right"></i></span>
                    <el-dropdown-menu slot="dropdown">
                        <el-dropdown-item>我的主页</el-dropdown-item>
                        <el-dropdown-item>设置</el-dropdown-item>
                        <el-dropdown-item>退出</el-dropdown-item>
                    </el-dropdown-menu>
                </el-dropdown>
            </el-col>
        </el-row>
    </div>
</template>

<script>
import PublishIssues from "./PublishIssues";
export default {
    name:'header',
  components: {PublishIssues},
  data(){
        return{
            search:'',
            message:2,
            imgUrl:require('../assets/img.jpg'),
            username:'diljane',
            queryForm: false,
            content: '在框内输入你的问题，并以问号结尾'
        }
    },
    methods:{
        gotoHome:function(){
            alert("首页")
        },
        gotoTitle:function(){
            alert("话题")
        },
        gotoAsk:function(){
            alert("提问")
        },
        gotoSearch:function(){
            alert("1")
        },
        getFoucus: function () {
          this.content = null
        }
    }
}
</script>

<style scoped>

    .header {
        background: gray;
        position: absolute;
        top: 0;
        left: 0;
        box-sizing: border-box;
        width: 100%;
        height: 90px;
        /* font-size: 28px; */
        color: #fff;
    }
    .el-row{
        padding-top:20px;
    }
    .el-button{
        font-size: 28px;
        color:white;
    }
    .query .el-button{
      font-size: 14px;
      color: black;
    }
    .user-avator{
        margin-left: 20px;
    }
    .user-avator img{
        display: block;
        width:50px;
        height:50px;
        border-radius: 50%;
    }
    .el-dropdown-link {
        cursor: pointer;
        color: white;
        font-size: 20px;
    }
    .el-icon-arrow-down {
        font-size: 20px;
    }

</style>
