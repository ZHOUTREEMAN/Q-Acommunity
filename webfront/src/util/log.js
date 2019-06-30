import axios from 'axios'
export default {
  validate:  function (userName, password) {
     var res = axios.get(  `/api/identify/vali?userName=${userName}&password=${password}`)
      .then(function (response) {
        if (response.data.mainData == null) {
         return{
           'res': false,
           'data': response.data.tip
         }
        } else {
            return{
              'res': true,
              'data': response.data.mainData
            }
        }
      })
      .catch(function (err) {
          console.log(err)
        }
      )
      return res
  },
  register: function(userName, password){
    axios.get(`/api/identify/sign/complete?userName=${userName}&password=${password}`)
      .then(function(response){
      })
      .catch(function(res){
      })
  },
  doubleNameAlert: function(userName){
    axios.get(`/api/identify/sign/validate?userName=${userName}`)
      .then(function(response){
        return response.data.mainData
      })
      .catch(function(err){
        console.log(err)
      })
  },
  test: function(){
    return {
      'data': 'scscsdc',
      'res': false
    }
  }

}
