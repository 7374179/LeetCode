/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    let p = s.length - 1;
    while(p>=0 && s.charAt(p)==' '){
        p--;
    }
    let count = 0;
    while(p>=0 && s.charAt(p)!=' '){
        p--;
        count++;
    }
    return count;
};