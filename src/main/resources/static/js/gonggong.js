var $ = layui.jquery,
    layer = layui.layer; //独立版的layer无需执行这一句

var layuimodel = function(title, content, id) {
    //多窗口模式，层叠置顶
    layer.open({
        type: 1, //此处以页面层举例
        title: title,
        area: ['660px', '460px'],
        shade: 0,
        maxmin: true,
        id: id,
        content: content,
        zIndex: layer.zIndex //重点1
    });
}

var layuimodel2 = function(title, content, id) {
    //多窗口模式，层叠置顶
    layer.open({
        type: 1, //此处以页面层举例
        title: title,
        area: ['900px', 'auto'],
        shade: 0,
        maxmin: true,
        id: id,
        content: content,
        zIndex: layer.zIndex //重点1
    });
}
// 开始菜单显隐
var toggle = function() {
    $(".caidan").toggle();
}