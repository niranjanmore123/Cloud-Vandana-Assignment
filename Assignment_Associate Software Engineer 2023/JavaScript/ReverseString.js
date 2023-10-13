// 1.	Take a sentence as an input and reverse every word in that sentence. 
// Example - This is a sunny day > shiT si a ynnus yad. 


function reverseString(str){

    let newString="";

    for(let i=str.length-1;i>=0;i--){

        newString +=str[i];
    }
    return newString;
}
console.log(reverseString("This is a sunny day"));