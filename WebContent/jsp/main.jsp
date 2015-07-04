<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="<%=request.getContextPath() %>/WEB-INF/js/jweixin-1.0.0.js"></script> 
<script type="text/javascript">
wx.config({
    debug: true, // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
    appId: 'wx22f783baafa098a1', // 必填，公众号的唯一标识
    timestamp: 20150310, // 必填，生成签名的时间戳
    nonceStr: 'h5ESqfWYGvgwpJZci37ERHMC30vGcz9kzrrMJAdbfX', // 必填，生成签名的随机串
    signature: 'yukibaby',// 必填，签名，见附录1
    jsApiList: [onMenuShareTimeline] // 必填，需要使用的JS接口列表，所有JS接口列表见附录2
});
</script>
<title>main</title>
</head>
<body>
<script>
wx.ready(function(){
	alert("success");
    // config信息验证后会执行ready方法，所有接口调用都必须在config接口获得结果之后，config是一个客户端的异步操作，所以如果需要在页面加载时就调用相关接口，则须把相关接口放在ready函数中调用来确保正确执行。对于用户触发时才调用的接口，则可以直接调用，不需要放在ready函数中。
});
</script>

test page!!
</body>
</html>