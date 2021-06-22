function Validate(){
                var username=document.getElementById("username").value;
                var regx=/[18]BEC[0-9]/;
                //regx=new RegExp("E00","i");
                if(regx.test(username)){
                    alert("Valid Username");
                    document.getElementById("label").style.visibility="hidden";
                }
                else {
                    alert("Invalid Username");
                    document.getElementById("label").style.visibility="visible";
                }
            }
