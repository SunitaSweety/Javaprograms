/*********** Date And Time **********/

/* JavaScript Date Object represent a single moment in time in a 
   plateform - independent format. Date Objects contain a Number
   That represents milliseconds since 1 january 1970 UTC
*/

// ***** 1. Creating Date Objects *****
// There are 4 ways to create a new date object:

/* a. new Date()
   b. new Date(year, month, day, hours, minutes, seconds, milliseconds)
// it takes 7 arguments
   c. new Date(milliseconds)
// we cannot avoid month section
   d. new Date(date String) */


// *** a. new Date() ***
// Date objects are created with the new Date() constructor.

/*let currDate = new Date();
  console.log(currDate);  */       // 2022-08-22T05:12:51.540Z

// NOTE - India is 5 hours and 30 minutes ahead of Greenwich Mean Time 
// And if we add 5hr 30 min, we gwt our Indian time Ok.. you can check

/*console.log(new Date());     // 2022-08-22T05:18:01.632Z
  console.log(new Date().toLocaleString());      // 2022-08-22T05:18:01.632Z
  console.log(new Date().toString()); */       // Mon Aug 22 2022 10:49:52 GMT+0530 (India Standard Time)-----> same as browser timing 

// *** 2. Date.now() ***
/* Returns the numeric value corresponding to the current time - the 
   number of millisecond elapsed since January 1, 1970 00:00:00 UTC
*/ 

/* console.log(Date.now());   */  // 1661146111687 in millisecond


// *** c. new Date(year, month, ...) ***
/* 7 numbers specify year, month, day, hour, minute, second, 
   and millisecond (in that order) 
   NOTE: JavaScript counts months from 0 to 11.*/

// january is 0. December is 11.
/*  var d = new Date(2022, 7, 22, 11, 11, 30);
   var dT = new Date(2022, 7, 22, 20, 15, 30);
   var dT2 = new Date(2022,7,22);
   console.log(d.toLocaleString());        // 8/22/2022, 11:11:30 AM
   console.log(dT.toLocaleString());      // 8/22/2022, 8:15:30 PM
   console.log(dT2.toLocaleString()); */  // 8/22/2022, 12:00:00 AM  but time is wrong

// *** d. new Date(dateString) ***
// new Date(dateString) creates a new date object from a date string

/*var d = new Date ("August 22, 2022 11:32:14");
  console.log(d.toLocaleString()); */     // 8/22/2022, 11:32:14 AM

// ***** 2. new Date(milliseconds) *****
// new Date(milliseconds) creates a new date object as zero time
// plus milliseconds

//var d = new Date(1609574531435);
//console.log(d.toLocaleString());     // 1/2/2021, 1:32:11 PM

//var d = new Date(0);
//console.log(d.toLocaleString());      // 1/1/1970, 5:30:00 AM

// ***** Dates Method *****
/* const curDate = new Date();
// How to get the indivisual date
   console.log(curDate.toLocaleString());     // 8/22/2022, 11:51:17 AM
   console.log(curDate.getFullYear());        // 22
   console.log(curDate.getMonth());     // 0-11 juan to dec Output---> 7
   console.log(curDate.getDate());      // 22
   console.log(curDate.getDay());     // 1
*/

// How to set the indivisual date
/*const curDate = new Date();
console.log(curDate.setFullYear(2022));      // 1661165537968
// The setFullYear() method can optionally set month and day

console.log(curDate.setFullYear(2022,10,5));  //1667645537968 
console.log(curDate.setMonth(10));            //1667645537968 
console.log(curDate.setDate(5));      //1667645537968            
console.log(curDate.toLocaleString()); */   //11/5/2022, 4:22:17 PM 


// *** Times Methods ***

/* const curTime = new Date();

// How to get the indivisual Time. 
console.log(curTime.getTime());           // 1661167026232  

// The getTime() method returns the number of milliseconds since January 1, 1970
console.log(curTime.getHours());    // 16   -----> 4 pm

// The getHours() method returns the hours of a date as a number(0 - 23)
console.log(curTime.getMinutes());     // 47 ------> 47 minutes
console.log(curTime.getSeconds());     // 6   ------> 6 seconds
console.log(curTime.getMilliseconds()); */    // 232   -------> 232 milliseconds

// How to set the indivisual Time 

let curTime = new Date();
//console.log(curTime.setTime()); 
console.log(curTime.setHours(5));    // 1661214023811
console.log(curTime.setMinutes(5));  // 1661214023811 
console.log(curTime.setSeconds(5));    // 1661214023811
console.log(curTime.setMilliseconds(5));    //1661214023811













   













