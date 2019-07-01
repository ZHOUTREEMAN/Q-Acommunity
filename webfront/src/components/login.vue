<template>
  <div class="login-wrap">
    <div class="ms-login">
      <div class="ms-title">问答系统</div>
      <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="0px" class="ms-content">
        <el-form-item prop="username">
          <el-input v-model="ruleForm.username" placeholder="username" clearable >
            <el-button slot="prepend" icon="el-icon-user"></el-button>
          </el-input>
        </el-form-item>
        <el-form-item prop="password">
          <el-input type="password" placeholder="password" v-model="ruleForm.password" @keyup.enter.native="submitForm('ruleForm')" clearable >
            <el-button slot="prepend" icon="el-icon-lock"></el-button>
          </el-input>
        </el-form-item>
        <div class="login-btn">
          <el-button type="primary" @click="submitForm('ruleForm')">登录</el-button>
        </div>
        <div style="color:aqua">
          <p @click="searchPass">Forget Password?</p>
        </div>
        <div style="color:aqua">
          <p @click="toRegister">还没注册过，现在去注册</p>
        </div>
      </el-form>
    </div>
  </div>
</template>

<script>
  import log from '../util/log'
  export default {
    name:'login',
    data: function(){
      return {
        ruleForm: {
          username: '',
          password: ''
        },
        rules: {
          username: [
            { required: true, message: '请输入用户名', trigger: 'blur' }
          ],
          password: [
            { required: true, message: '请输入密码', trigger: 'blur' }
          ]
        }
      }
    },
    methods: {
      async submitForm(formName) {
        var info = await log.validate(this.ruleForm.username, this.ruleForm.password)
        if(info.res){
          this.$store.commit("setUserName", this.ruleForm.username)
          console.log(this.$store.getters.getUserName)
        }
      },
      searchPass:function(){
        alert("成功找回密码")
      },
      toRegister:function(){
        alert("前往登陆界面")
      }
    }
  }
</script>

<style scoped>
  .login-wrap{
    position: absolute;
    width:100%;
    height:100%;
    top:0;
    left:0;
    background-image: url(../assets/login-bg.jpg);
    background-size: 100%;
  }
  .ms-title{
    width:100%;
    line-height: 50px;
    text-align: center;
    font-size:28px;
    color:black;
    border-bottom: 1px solid #ddd;
  }
  .ms-login{
    position: absolute;
    left:50%;
    top:50%;
    width:350px;
    margin:-190px 0 0 -175px;
    border-radius: 5px;
    background: rgba(255,255,255, 0.3);
    overflow: hidden;
  }
  .ms-content{
    padding: 30px 30px;
  }
  .login-btn{
    text-align: center;
  }
  .login-btn button{
    width:100%;
    height:36px;
    margin-bottom: 10px;
  }
</style>
