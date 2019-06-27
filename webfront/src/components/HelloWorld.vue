<template>
  <div>
    <note-area></note-area>

  </div>
</template>

<script>
import NoteArea from "./NoteArea";
export default {
  name: 'HelloWorld',
  components: {NoteArea},
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->

