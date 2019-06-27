<template>
  <div id="app">
    <hot-list></hot-list>
  </div>
</template>

<script>
import NoteArea from "./components/NoteArea";
import PictureUpload from "./components/pictureUpload";
import HotList from "./components/HotList";
export default {
  name: 'App',
  components: {HotList, PictureUpload, NoteArea}
}
</script>


