<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 
<link href="<%=request.getContextPath() %>/css/bootstrap-theme.css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/css/theme.css" rel="stylesheet">
<script src="<%=request.getContextPath() %>/js/jweixin-1.0.0.js"></script> 
<script src="<%=request.getContextPath() %>/js/jquery-1.11.3.min.js"></script>
 -->
<link href="/css/bootstrap-theme.css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/css/theme.css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/css/bootstrap.min.css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/css/jumbotron-narrow.css" rel="stylesheet">
<script src="<%=request.getContextPath() %>/js/jweixin-1.0.0.js"></script> 
<script src="<%=request.getContextPath() %>/js/jquery-1.11.3.min.js"></script>
<script src="<%=request.getContextPath() %>/js/docs.min.js"></script>
<script src="<%=request.getContextPath() %>/js/ie10-viewport-bug-workaround.js"></script>
<script type="text/javascript">
wx.config({
    debug: true, // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
    appId: 'wx22f783baafa098a1', // 必填，公众号的唯一标识
    timestamp: 1436001589, // 必填，生成签名的时间戳
    nonceStr: 'h5ESqfWYGvgwpJZci37ERHMC30vGcz9kzrrMJAdbfX', // 必填，生成签名的随机串
    signature: 'yukibaby',// 必填，签名，见附录1
    jsApiList: ['onMenuShareTimeline'] // 必填，需要使用的JS接口列表，所有JS接口列表见附录2
});
</script>
<title>main</title>
</head>
<body>
<!-- 
<script>
wx.ready(function(){
	alert("success");
    // config信息验证后会执行ready方法，所有接口调用都必须在config接口获得结果之后，config是一个客户端的异步操作，所以如果需要在页面加载时就调用相关接口，则须把相关接口放在ready函数中调用来确保正确执行。对于用户触发时才调用的接口，则可以直接调用，不需要放在ready函数中。
});
</script>
-->
<nav class="navbar navbar-default">
        <div class="container">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Yuki Baby</a>
          </div>
          <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li class="active"><a href="#">Home</a></li>
              <li><a href="#about">照片</a></li>
              <li><a href="#contact">视频</a></li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="#">Action</a></li>
                  <li><a href="#">Another action</a></li>
                  <li><a href="#">Something else here</a></li>
                  <li role="separator" class="divider"></li>
                  <li class="dropdown-header">Nav header</li>
                  <li><a href="#">Separated link</a></li>
                  <li><a href="#">One more separated link</a></li>
                </ul>
              </li>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </nav>

<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
          <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
          <li data-target="#carousel-example-generic" data-slide-to="1"></li>
          <li data-target="#carousel-example-generic" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner" role="listbox">
          <div class="item active">
            <img data-src="holder.js/1140x500/auto/#777:#555/text:First slide" alt="First slide">
          </div>
          <div class="item">
            <img data-src="holder.js/1140x500/auto/#666:#444/text:Second slide" alt="Second slide">
          </div>
          <div class="item">
            <img data-src="holder.js/1140x500/auto/#555:#333/text:Third slide" alt="Third slide">
          </div>
        </div>
        <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
          <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
          <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>
</div>
      <div class="page-header">
        <h1></h1>
      </div>
<div class="row">
        <div class="col-sm-6">
          <div class="panel panel-default">
            <div class="panel-heading">
              <h3 class="panel-title">关于我</h3>
            </div>
            <div class="panel-body">
              to be continued...
            </div>
          </div>
          <div class="panel panel-primary">
            <div class="panel-heading">
              <h3 class="panel-title">多彩生活</h3>
            </div>
            <div class="panel-body">
               to be continued...
            </div>
          </div>
        </div><!-- /.col-sm-4 -->
        <div class="col-sm-6">
          <div class="panel panel-success">
            <div class="panel-heading">
              <h3 class="panel-title">成长足迹</h3>
            </div>
            <div class="panel-body">
              to be continued...
            </div>
          </div>
          <div class="panel panel-info">
            <div class="panel-heading">
              <h3 class="panel-title">留言板</h3>
            </div>
            <div class="panel-body">
              to be continued...
            </div>
          </div>
      </div>
</div>
      <footer class="footer">
        <p>&copy; personal blog</p>
      </footer>
</body>
</html>