/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    s = s.replace(/[^a-zA-Z0-9]/g, '').toLowerCase();
    let p1 = 0;
    let p2 = s.length-1;
    while(p1 < p2){
        if(s.charAt(p1) !== s.charAt(p2)){
            return false;
        }
        p1++;
        p2--;
    }
    return true;
};