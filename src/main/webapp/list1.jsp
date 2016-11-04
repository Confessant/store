<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";%> 
<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">

<title>图书商城</title>

<link rel="stylesheet" type="text/css"
	href="<%=basePath%>jslib/bootstrap/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/theme.css">
<link rel="stylesheet"
	href="<%=basePath%>jslib/font-awesome/css/font-awesome.css">
<script src="<%=basePath%>jslib/jquery-1.7.2.min.js"
	type="text/javascript"></script>
<style type="text/css">
body{
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
}





</style>

</head>

<body>
	<div class="navbar">
		<div class="navbar-inner">
			<ul class="nav pull-right">
				<li id="fat-menu" class="dropdown"><a href="#" role="button"
					class="dropdown-toggle" data-toggle="dropdown"> <i
						class="icon-user"></i>登陆 
						<i class="icon-caret-down"></i>
				</a>

					<ul class="dropdown-menu">
						<li><a tabindex="-1" href="#">修改密码</a></li>
						<li class="divider"></li>
						<li><a tabindex="-1" class="visible-phone" href="#">Settings</a>
						</li>
						<li class="divider visible-phone"></li>
						<li><a tabindex="-1" href="<%=basePath%>sys/user?cmd=logout"
							target="_top">Logout</a></li>
					</ul></li>
			</ul>
			<a class="brand" href="index.jsp"><span class="first">用最平静的心来遨游图书的海洋</span>
			</a>
		</div>
	</div>


	<div class="container-fluid">
		<div class = "icon-div">
			<a href="" class = "icon"><img width="300" height="200" src="<%=basePath%>image/4.jpg"></a>
		</div>
		<div class="row-fluid">
		<div class="headframe">
			<div class="booktype">
				<ul>
					<li>
						<div class="sort1">
							<a href="https://www.amazon.cn/gp/bestsellers/books/658393051/ref=amb_link_30652892_23?pf_rd_m=A1AJ19PSB66TGU&pf_rd_s=merchandised-search-1&pf_rd_r=S0BE3A4DZDNP4B3MJHX5&pf_rd_t=101&pf_rd_p=289865452&pf_rd_i=658390051" class="main_sort">小说</a>
						</div>
						<div class="detail_sort">
							<div class="detail_sort11">
								<div class="detail_sort1">
									<a></a>
									<a></a>
								</div>
							</div>
						</div>
					</li>
					<li><a href="http://list.jd.com/list.html?cat=1713,13634&go=0" class="main_sort">音乐</a>
						<div class="detail_sort">
							<div class="detail_sort1">
								<a></a>
								<a></a>
							</div>
						</div>
					</li>
					<li><a href="http://list.jd.com/list.html?cat=1713,3258,3300" class="main_sort">名著</a>
						<div class="detail_sort">
							<div class="detail_sort1">
								<a></a>
								<a></a>
							</div>
						</div>
					</li>
					<li><a href="https://www.amazon.cn/%E7%94%9F%E6%B4%BB%E5%9B%BE%E4%B9%A6/b/ref=sv_b_13?ie=UTF8&node=77515071" class="main_sort">生活</a>
						<div class="detail_sort">
							<div class="detail_sort1">
								<a></a>
								<a></a>
							</div>
						</div>
					</li>
					<li><a href="https://www.amazon.cn/%E7%AE%A1%E7%90%86%E5%9B%BE%E4%B9%A6/b/ref=sa_menu_books_l3_b658399051?ie=UTF8&node=658399051" class="main_sort">经管</a>
						<div class="detail_sort">
							<div class="detail_sort1">
								<a></a>
								<a></a>
							</div>
						</div>
					</li>
					<li><a href="http://channel.jd.com/1713-3260.html" class="main_sort">青春</a>
						<div class="detail_sort">
							<div class="detail_sort1">
								<a></a>
								<a></a>
							</div>
						</div>
					</li>
				</ul>
			</div>
			<div class="span6">
				<div class="lookup">
					<form class="form-search">
						<!-- input-medium的作用是减少input的长度 -->
						<input class="search-query" type="text">
						<button type="submit" class="btn">查找</button>
					</form>
				</div>
			</div>
		</div>
		</div>
	</div>

	<%-- <img src = "<%=basePath%>images/1.jpg" /> --%>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span12">
				<div class="row-fluid">
				<div class="span2">
		<dl>
		<h3>热门推荐</h3>
		<c:forEach items="${list}" var="item">
   			<dt><a href="">${item.bookname}</a></dt>
   			<dd>${item.bookisrec}</dd>
   			<br>
   		</c:forEach>
   		</dl>
   		
					</div>
					<div class="span6">
					<div class="showbook">
						<ul class="thumbnails">
							<!-- TODO sdfsdffsas -->
								<!-- <dl> -->
								<c:forEach items="${list}" var="item">
							<li class="span4">
								<div class="thumbnail">
									<img alt="300x200" src="<%=basePath%>${item.bookimg}">
									<div class="caption">
										<h3>${item.bookname}</h3>
										<p>
											${item.bookisrec}
										</p>
										<p>
											<a class="btn btn-primary" href="<%=basePath%>sys/book?cmd=list">详情</a> <a class="btn"
												href="#">删除</a>
										</p>
									</div>
									
								</div>
							</li>
							</c:forEach>
   							<!-- </dl> -->
							<%-- <li class="span4">
								<div class="thumbnail">
									<img alt="300x200" src="<%=basePath%>images/2.jpg">
									<div class="caption">
										<h3>三体Ⅱ·黑暗森林</h3>
										<p>
											刘慈欣的作品宏伟大气、想象绚丽，既注重极端空灵与厚重现实的结合，也讲求科学的内涵和美感。具有浓郁的中国特色和鲜明的个人风格。为中国科幻确立了一个新高度。
										</p>
										<p>
											<a class="btn btn-primary" href="#">浏览</a> <a class="btn"
												href="#">分享</a>
										</p>
									</div>
								</div>
							</li>
							<li class="span4">
								<div class="thumbnail">
									<img alt="300x200" src="img/sports.jpg">
									<div class="caption">
										<h3>改进型哈佛结构</h3>
										<p>
											改进型的哈佛结构具有一条独立的地址总线和一条独立的数据总线，两条总线由程序存储器和数据存储器分时复用，使结构更紧凑。</p>
										<p>
											<a class="btn btn-primary" href="#">浏览</a> <a class="btn"
												href="#">分享</a>
										</p>
									</div>
								</div>
							</li> --%>
						</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html> 