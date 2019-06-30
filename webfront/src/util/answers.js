import axios from 'axios'
export default {
  commitAnswer: function (userID, questionID, content) {
    axios.get(`/api/answer/commitanswer?userID=${userID}&questionID=${questionID}&html_text=${content}`)
      .then(function(response){
      })
      .catch(function(err){
        console.log(err)
      })
  }
}
