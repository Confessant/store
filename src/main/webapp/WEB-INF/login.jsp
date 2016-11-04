<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<title>我的首页-微博 随时随地发现新鲜事</title>
	<link rel="shortcut icon" type="image/x-icon" href="http://weibo.com/favicon.ico" />
	<link rel="stylesheet" type="text/css"
			href="assets/jslib/bootstrap/css/bootstrap.css">
		<link rel="stylesheet" type="text/css"
			href="assets/css/theme.css">
		<link rel="stylesheet"
			href="assets/jslib/font-awesome/css/font-awesome.css">
		<script src="assets/jslib/jquery-1.7.2.min.js"
			type="text/javascript"></script>
	<style type="text/css">
/* body{
	font-family: "Microsoft YaHei",tahoma,arial,"Hiragino Sans GB","宋体",sans-serif;
}
.brand .first {
	color: #fff;
	font-weight: bold;
	font-style: italic;
}

.booktype ul li {

	font-size:15px;
	float: left;
	padding: 10px;
	list-style-type: none;

}
.detail_sort{
	margin-right:50px;
}
.detail_sort1{

	width:100px;
	height:50px;
	border:1px solid #C81423;
	color:#fff;
	display:none;
	position:absolute;
}
.sort1 a{
	position:relative;
}
.main_sort:hover .detail_sort1{
	display:block;
}
.detail_sort1 a {
	color:#fff;
}
.test{
	border-color:#C81423;
	border-width:10px;
}
.container-fluid{
	display:inline;
}
.icon-div{
	position:absolute;
	left:50px;
	top:60px;
}
.headframe{
	position:relative;
	left:420px;
	top:20px;
}
.lookup{
	padding-left:80px;
}
.span12{
	padding-left:50px;
	padding-top:25px;
}
.showbook{
	position:relative;
	left:120px;
	top:40px;
}
.span2{  
	position:relative;
	top:20px;
} */





</style>
</head>
<body>
<div class="container-fluid">
		<div class="navbar-inner">
			<ul class="nav pull-right">
				<li id="fat-menu" class="dropdown"><a href="#" role="button"
					class="dropdown-toggle" data-toggle="dropdown"> <!-- <i
						class="icon-user"></i>登陆 
						<i class="icon-caret-down"></i> -->
				</a>

					<ul class="dropdown-menu">
						<li><a tabindex="-1" href="#">修改密码</a></li>
						<li class="divider"></li>
						<li><a tabindex="-1" class="visible-phone" href="#">Settings</a>
						</li>
						<li class="divider visible-phone"></li>
						<li><a tabindex="-1" href="sys/user?cmd=logout"
							target="_top">Logout</a></li>
					</ul></li>
			</ul>
			<a class="brand" href="index.jsp"><span class="first">用最平静的心来遨游图书的海洋</span>
			</a>
		</div>
	<div class="row-fluid">
		<div class="span2">
			<dl>
				<dt>
					Rolex
				</dt>
				<dd>
					劳力士创始人为汉斯.威尔斯多夫，1908年他在瑞士将劳力士注册为商标。
				</dd>
				<dt>
					Vacheron Constantin
				</dt>
				<dd>
					始创于1775年的江诗丹顿已有250年历史，
				</dd>
				<dd>
					是世界上历史最悠久、延续时间最长的名表之一。
				</dd>
				<dt>
					IWC
				</dt>
				<dd>
					创立于1868年的万国表有“机械表专家”之称。
				</dd>
				<dt>
					Cartier
				</dt>
				<dd>
					卡地亚拥有150多年历史，是法国珠宝金银首饰的制造名家。
				</dd>
			</dl>
		</div>
		<div class="span6">
			<form class="form-search">
				<input class="input-medium search-query" type="text" /> <button type="submit" class="btn">查找</button>
			</form>
			<div class="btn-group">
				 <button class="btn" type="button">文学</button> 
				 <button class="btn" type="button">流行</button> 
				 <button class="btn" type="button">文化</button> 
				 <button class="btn" type="button">小说</button> 
				 <button class="btn" type="button">童话</button> 
				 <button class="btn" type="button">科幻</button> 
				 <button class="btn" type="button">言情</button> 
				 <button class="btn" type="button">历史</button> 
				 <button class="btn" type="button">哲学</button> 
				 <!-- <button class="btn" type="button">我的收藏</button> 
				 <button class="btn" type="button">我的购买</button>
				 <button class="btn" type="button">我的评论</button> 
				 <button class="btn" type="button">我的发布</button> -->
				 
<!-- 				 <button class="btn" type="button"><em class="icon-align-left"></em></button> 
				 <button class="btn" type="button"><em class="icon-align-center"></em></button>
				 <button class="btn" type="button"><em class="icon-align-right"></em></button> 
				 <button class="btn" type="button"><em class="icon-align-justify"></em></button> -->
			</div>
			<ul class="thumbnails">
				<li class="span4">
					<div class="thumbnail">
						<img alt="300x200" src="assets/img/1.jpg" />
						<div class="caption">
							<h3>
								冯诺尔曼结构
							</h3>
							<p>
								也称普林斯顿结构，是一种将程序指令存储器和数据存储器合并在一起的存储器结构。程序指令存储地址和数据存储地址指向同一个存储器的不同物理位置。
							</p>
							<p>
								<a class="btn btn-primary" href="#">浏览</a> <a class="btn" href="#">分享</a>
							</p>
						</div>
					</div>
				</li>
				<li class="span4">
					<div class="thumbnail">
						<img alt="300x200" src="img/city.jpg" />
						<div class="caption">
							<h3>
								哈佛结构
							</h3>
							<p>
								哈佛结构是一种将程序指令存储和数据存储分开的存储器结构，它的主要特点是将程序和数据存储在不同的存储空间中，进行独立编址。
							</p>
							<p>
								<a class="btn btn-primary" href="#">浏览</a> <a class="btn" href="#">分享</a>
							</p>
						</div>
					</div>
				</li>
				<li class="span4">
					<div class="thumbnail">
						<img alt="300x200" src="img/sports.jpg" />
						<div class="caption">
							<h3>
								改进型哈佛结构
							</h3>
							<p>
								改进型的哈佛结构具有一条独立的地址总线和一条独立的数据总线，两条总线由程序存储器和数据存储器分时复用，使结构更紧凑。
							</p>
							<p>
								<a class="btn btn-primary" href="#">浏览</a> <a class="btn" href="#">分享</a>
							</p>
						</div>
					</div>
				</li>
			</ul>
			<div class="pagination">
				<ul>
					<li>
						<a href="#">上一页</a>
					</li>
					<li>
						<a href="#">1</a>
					</li>
					<li>
						<a href="#">2</a>
					</li>
					<li>
						<a href="#">3</a>
					</li>
					<li>
						<a href="#">4</a>
					</li>
					<li>
						<a href="#">5</a>
					</li>
					<li>
						<a href="#">下一页</a>
					</li>
				</ul>
				
			</div>
		</div>
		<div class="span4">
			<ul class="breadcrumb">
				<li>
					<a href="#">用户</a> <span class="divider">/</span>
				</li>
				<li>
					<a href="#">管理员</a> <span class="divider">/</span>
				</li>
				<li class="active">
					登陆角色
				</li>
			</ul>
			<form class="form-horizontal">
				<div class="control-group">
					 <label class="control-label" for="inputEmail">账号</label>
					<div class="controls">
						<input id="inputEmail" type="text" />
					</div>
				</div>
				<div class="control-group">
					 <label class="control-label" for="inputPassword">密码</label>
					<div class="controls">
						<input id="inputPassword" type="password" />
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						 <label class="checkbox"><input type="checkbox" /> Remember me</label> <button type="submit" class="btn">登陆</button>
					</div>
				</div>
			</form>
			<div class="user-function">
				 <button class="btn" type="button">我的收藏</button> 
				 <button class="btn" type="button">我的购买</button>
				 <button class="btn" type="button">我的评论</button> 
				 <button class="btn" type="button">我的发布</button>
			 </div>
		</div>
	</div>
</div>

</body>
</html>