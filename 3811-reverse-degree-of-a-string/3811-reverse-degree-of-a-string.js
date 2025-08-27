/**
 * @param {string} s
 * @return {number}
 */
var reverseDegree = function(s) {
    let ans=0;
    for(let i=0; i<s.length; i++){
        ans+= (i+1) * (123- s[i].charCodeAt(0))
    }
    return ans;
};