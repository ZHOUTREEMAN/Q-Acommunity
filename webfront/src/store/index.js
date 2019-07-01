import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

const store = new Vuex.Store({
  state: {
    userName: '默认用户名'
  },
  getters: {
    getUserName: function (state) {
      return state.userName
    }
  },
  mutations: {
    setUserName(state, name){
      state.userName = name
    }
  }
})

export default store
