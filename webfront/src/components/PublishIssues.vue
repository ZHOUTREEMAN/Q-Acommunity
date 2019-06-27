<template>
    <el-dialog :visible.sync="visible" style="width: 900px;">
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
</template>

<script>
    export default {
        name: "PublishIssues",
        props: ['userImageURL', 'visible'],
        data() {
          return {
            content: '在框内输入你的问题，并以问号结尾'
          }
        },
        methods: {
          getFoucus: function () {
            this.content = null
          }
        }
    }
</script>

<style scoped>
  .el-dialog__header{
    height: 0;
  }
  .el-dialog__body{
    padding: 0;
  }
  .el-dialog{
    width: 600px;
  }
  .el-textarea__inner{
    height: 300px;
  }
  .el-button{
    position: relative;
    right: 30px;
  }
</style>
