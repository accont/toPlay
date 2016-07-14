/**
 * Created by admin on 2016/5/20.
 */
function up(id){
    $.ajax({
        url:"/blg/thumb",
        type:"post",
        async : true,
        data:{id:id},
        timeout:1000,
        success:function(data){
            window.location.reload();
        },
        dataType:'json'
    })
}