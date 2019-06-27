<template>
  <!-- bidirectional data binding（双向数据绑定） -->
  <quill-editor v-model="content"
                ref="myQuillEditor"
                @change="onEditorChange">
  </quill-editor>

</template>

<script>
  // require styles
  import 'quill/dist/quill.core.css'
  import 'quill/dist/quill.snow.css'
  import 'quill/dist/quill.bubble.css'
  // you can also register quill modules in the component
  //import Quill from 'quill'
  // import { someModule } from '../yourModulePath/someQuillModule.js'
  // Quill.register('modules/someModule', someModule)

  import { quillEditor } from 'vue-quill-editor'

  // 工具栏配置
  const toolbarOptions = [
    ['bold'],
    ['image']
  ]

  export default {
    components:{
      quillEditor
    },
    data () {
      return {
        content: '<h2>I am Example</h2>',
        editorOption: {
          modules: {
            toolbar: {
              container: toolbarOptions,  // 工具栏
            }
          }
        }
      }
    },
    // manually control the data synchronization
    // 如果需要手动控制数据同步，父组件需要显式地处理changed事件
    methods: {
      onEditorBlur(quill) {
        console.log('editor blur!', quill)
        console.log(quill.container.firstChild.innerHTML)//获得html格式文本,岂不美哉
      },
      onEditorFocus(quill) {
        console.log('editor focus!', quill)
      },
      onEditorReady(quill) {
        console.log('editor ready!', quill)
      },
      onEditorChange({ quill, html, text }) {
        console.log('editor change!', quill, html, text)
        this.content = html
        console.log(this.content + "cdscdscsdc")
      }
    },
    computed: {
      editor() {
        return this.$refs.myQuillEditor.quill
      }
    },
    mounted() {
      console.log('this is current quill instance object', this.editor)
    }
  }
</script>
<style scoped>
  .quill-editor{
    width: 800px;
    height: 500px;
    margin: 0 auto;
  }
</style>
