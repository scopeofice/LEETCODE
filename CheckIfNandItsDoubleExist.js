/**
 * @param {number[]} arr
 * @return {boolean}
 */
var checkIfExist = function(arr) {
    return arr.some((num,index)=> arr.some((val,ind)=> index !== ind && num === 2*val));
 };