$(function(){
    $("#userForm").validate({
        rules:{
            name:{
                required:true,
                minLength:2
            },
            userName:{
                required:true,
                email:true,
                minLength:5,
                remote:{
                    url:"/user/check",
                    type:"post",
                    dataType:"json",
                    data:{
                        userName:$("#form-username").val()
                    },success:function(data){
                        if(data == 1){
                            $("#s2").html("你输入的账号已存在").css({"color":"green","margin":"5px"});
                            return false;
                        }else{
                            $("#s2").html("你输入的账号可以注册！！！").css({"color":"red","margin":"5px"});
                        }
                    }
                }
            },
            password:{
                required:true,
                minLength:5
            }
        },
        messages:{
            name:{
                required:"用户名必须填写",
                minLength:"用户名最少2个字符"
            },
            userName:{
                required:"账号必须填写",
                email:"请填写正确的邮箱格式",
                minLength:"最少5个字符"
            },
            password:{
                required:"密码必须填写",
                minLength:"密码最少5个字符"
            }
        }
    })


});