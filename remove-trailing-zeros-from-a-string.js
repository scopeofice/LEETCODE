/**
 * @param {string} num
 * @return {string}
 */
var removeTrailingZeros = function(num) {
    for(let i=num.length - 1; i >= 0; i--){
      if(num[i] !== "0"){
          return num;
      }else{
          num=num.substring(0,i);
      }
    }
  };