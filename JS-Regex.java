// Regular Expressions are used to perform powerful pattern matching
            // and search and replace functions on text
            // function Validate(){
            //     var username=document.getElementById("username").value;
            //     var regx=/Anchit/i;  //i is used for case insensitive flag
            //     if(regx.test(username)){
            //         //alert("Valid Username");
            //         document.getElementById("label").style.visibility="hidden";
            //     }
            //     else {
            //         //alert("Invalid Username");
            //         document.getElementById("label").style.visibility="visible";
            //     }
            // }
            // Regular Expressions Character set and Ranges
            function Validate(){
                var username=document.getElementById("username").value;
                // var regx=/[18]BEC[0-9]/;
                var regx=/[a-xA-X]00/; //here you can use i flag also
                //var regx=/[^1abc]abc/; //excluding 1abc in first location
                //regx=new RegExp("E00","i"); //RegExp is an inbuilt constructor
                if(regx.test(username)){
                    //alert("Valid Username");
                    document.getElementById("label").style.visibility="hidden";
                }
                else {
                    //alert("Invalid Username");
                    document.getElementById("label").style.visibility="visible";
                }
            }
