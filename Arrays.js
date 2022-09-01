// 5 Array Subsection 4 Map and Reduse Method
// Array.prototype.map()

// let newArray = arr.map(Callback(currentValue[, index[, array]]) {
// // return element for newarray, after executing something     
//}[, thisArg]);

// Returns a new array containing the results of calling a 
// function on every element in this array.

/* const array1 = [1,4,9,16,25];
// num > 9
let newArr = array1.map((curElem,index,arr)=> {
    return curElem > 9;
})
console.log(array1);
console.log(newArr);  */  //   output----> [ 1, 4, 9, 16, 25 ]
                         //                [ false, false, false, true, true ]
                        
/*const array1 = [1,4,9,16,25];
let newArr = array1.map((curElm, index, arr) => {
    return `Index no = ${index} and the value is ${curElm}  belong to ${arr}`
}) 
console.log(newArr); */ // Output ------> [
                        //                'Index no = 0 and the value is 1  belong to 1,4,9,16,25', 
                       //                 'Index no = 1 and the value is 4  belong to 1,4,9,16,25', 
                       //                 'Index no = 2 and the value is 9  belong to 1,4,9,16,25', 
                       //                 'Index no = 3 and the value is 16  belong to 1,4,9,16,25',
                       //                 'Index no = 4 and the value is 25  belong to 1,4,9,16,25'     
                       //                 ]
                      
// The returning value 
/* The first difference between map() and forEach() is the returning value. The forEach()
   method returns undefined and map() returns a new array with the transformed elements.
   Even if they do the same job, the returning value remains different.
   Eg: 
   
   const myAwesomeArray = [1,2,3,4,5];
   myAwesomeArray.forEach(x => x*x)
   //>>>>>>>>>>>>>>>>>>>return value: undefined
   
   myAwesomeArray.map(x => x*x)
   //>>>>>>>>>>>>>>>>>>return value: [1,4,9,16,25]
*/
/* const array1 = [1,4,,9,16,25];
let newArrayfor = array1.forEach((curElm,index,arr)=>{
    return `Index no = ${index} and the value is ${curElm} belong to ${arr}`
})
console.log(newArrayfor);  */    // Output---------> undefined 

// 11. *** Challenge Time ***

// 1: Find the square root of each element in an array ? 
// 2: Multiply each element by 2 and return only those elements which are greater than 10?
         
//Solution 1 ..... 
/*let arr = [25,36,49,64,81]; 
let arrSqr = arr.map((curElem)=>{
     return Math.sqrt(curElem);
})
console.log(arrSqr);     // [ 5, 6, 7, 8, 9 ]   */

/*let arr = [25,36,49,64,81];
let arrSqr = arr.map((curElem)=> Math.sqrt(curElem))
console.log(arrSqr);     // [ 5, 6, 7, 8, 9 ]  */

// Solution 2 ..... 
/*let  arr = [2,3,4,6,8];
let arr2 = arr.map((curElem) =>{
    return curElem*2;
}).filter((curElm)=>{
    return curElm > 10;
})
console.log(arr2);   // output -------> [ 12, 16 ]   */

/* let  arr = [2,3,4,6,8];
let arr2 = arr.map((curElem) => curElem*2).filter((curElm)=>  curElm > 10);
console.log(arr2);       // output -------> [ 12, 16 ] */

/* let  arr = [2,3,4,6,8];
   let arr2 = arr.map((curElm) => curElm*2).filter((curElem) =>  curElem > 10).reduce((accumulator,curElem) => {
   return accumulator += curElem;
});
console.log(arr2); */


//  **** Reduce Method ****
/* flatten an array means to convert the 3d or 2d array into a 
   single dimensional array
   
   The reduce() method executes a reducer function (that you provide)
   on each element of the array, resulting in single output value.

   The reducer function tasks four arguments:
   Accumultor 
   Current Value
   current Index 
   Source Array   */
/*let arr = [5,6,2];

let mul = arr.reduce((accumulator,curElem)=>{
    debugger;
    return accumulator *= curElem;
})
console.log(mul);*/


//4 subj = 1sub = 7
//3 dubj = [5,6,2]
/*let arr = [5,6,2];

let mul = arr.reduce((accumulator,curElem)=>{
    debugger;
    return accumulator *= curElem;
},7)
console.log(mul);      // output---------> 420  */

// How to fatten an array 
// converting 2d and 3d array into one dimensional array 

const arr = [
        ['zone_1','zone_2'],
        ['zone_3','zone_4'],
        ['zone_5','zone_6'],
        ['zone_7',['zone_8','zone_8']]
]
let flatArr = arr.reduce((accum,currVal) => {
    return accum.concat(currVal);
})

console.log(flatArr);      /* Output--------> [
                                               'zone_1', 'zone_2',
                                               'zone_3', 'zone_4',
                                               'zone_5', 'zone_6',
                                               'zone_7', 'zone_8' 
                                              ] */


                                              
 
                               



















