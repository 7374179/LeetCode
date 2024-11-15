/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    let nums = [];
    let num = 0;
    const tmp = [];
    for(let i=0;i<arr.length;i++){
        tmp[num++] = arr[i];
        if(num==size || i==arr.length-1){
            num = 0;
            nums.push([...tmp]);
            tmp.length = 0;
        }
    }
    return nums;
};
