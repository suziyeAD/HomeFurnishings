<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/style.css">
    <title>注册</title>
</head>
<body>
    <!-- 头部导航栏部分  start -->
    <header>
        <div class="inner">
            <div class="logo">
                <img src="img/logo.png" width="120px" height="44px" alt="21cake 蛋糕官网">
            </div>
            <ul class="nav">
                <li><a href="index.jsp">首页</a></li>
                <li><a href="class.jsp">蛋糕</a></li>
                <li><a href="class.jsp">面包</a></li>
                <li><a href="class.jsp">冰淇淋</a></li>
                <li><a href="class.jsp">咖啡下午茶</a></li>
                <li><a href="class.jsp">全国送</a></li>
                <li><a href="class.jsp">企业专区</a></li>
            </ul>
            <ul class="join">
                <li><a href="#">APP下载</a></li>
                <li><a href="#">北京</a><i class="city"></i></li>
                <li><a href="#">消息</a></li>
                <li><a href="login.jsp">登录</a>/<a href="register.jsp">注册</a></li>
                <li class="cart"><i></i></li>
            </ul>
        </div>
    </header>

    <!-- 注册页中间部分 -->
    <div class="login-background" style="height: 682px;">
        <div class="reg-content-box" style="width: 1200px; min-height: 216px;">
            <div class="form-login-box" style="right: 0px;">
                <div class="login-regi-title">
                    <h2 class="regi-user">用户注册</h2>
                </div>
                <form action="">
                    <div class="form-content">
                        <ul class="reister-user">
                            <li>
                                <input type="text" name="loginName" autocomplete="off" autofocus="" maxlength="11"
                                    placeholder="输入手机号码" id="telephone" tabindex="1">
                                <i></i>
                            </li>
                            <li>
                                <input type="password" name="password" autocomplete="off" maxlength="20"
                                    placeholder="密码：请输入8～20字符，需同时包含英文和数字" id="password" tabindex="2">
                                <i></i>
                            </li>
                            <li>
                                <input type="password" name="rePassword" autocomplete="off" maxlength="20"
                                    placeholder="确认密码" id="rePassword" tabindex="3">
                                <i></i>
                            </li>
                            <li class="login-img-text" style="display: block">
                                <input type="text" placeholder="请输入图片字符" name="code" id="regiImgtext" tabindex="4">
                                <i></i>
                                <img src="img/passport-verify.png" class="regImg" alt="">
                                <a href="#" class="refresh-button"></a>
                            </li>
                            <!-- 输入短信验证码 -->
                            <li class="login-mes-umn">
                                <input type="text" name="authCode" placeholder="短信验证码" id="authCode" tabindex="5">
                                <i></i>
                                <a href="#" class="refiGetCode">获取验证码</a>
                            </li>
                            <li>
                                <input id="birthday" type="text" name="birthday" data-toggle="date" placeholder="请选择生日"
                                    data-required="0" class="hasDatepicker">
                            </li>
                            <li class="err-text">
                                <span>
                                    <i></i>
                                    请输入正确的手机号码
                                </span>
                            </li>
                            <li>
                                <input type="submit" class="login-button" value="注册" id="goRegister">
                            </li>
                        </ul>
                    </div>
                    <div class="reading-protocol">
                        <label>
                            <input type="checkbox" name="agree" checked>
                            &nbsp;已阅读并同意
                        </label>
                        <a href="#">21客会员协议</a>和
                        <a href="#">隐私保护政策</a>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <!-- 底部footer  start -->
    <footer>
        <img class="footer-logo" src="img/footer-logo.png" height="36" width="96" alt>
        <div class="footer-nav">
            <a href="#">联系我们</a>
            <span>|</span>
            <a href="#">订购帮助</a>
            <span>|</span>
            <a href="#">企业合作</a>
            <span>|</span>
            <a href="#">生产经营资质</a>
            <span>|</span>
            <a href="#">公告专区</a>
        </div>
        <div class="footer-icon">
            <a class="footer-weixin">
                <img src="img/footericon-02.png">
            </a>
        </div>
        <div class="footer-text">
            <span>订购专线: xxxx-xxxxxxx (服务时间 08:00-22:00)，团购热线: xxx xxxx xxxx</span>
            <span>客服电话:xxxx-xxxxxxx</span>
            <span>请提前3小时预定，当日 20点 以后的订单，于次日 8点 后开始审核</span>
            <span>当日蛋糕配送截至下单时间 20:00</span>
            <span>店铺地址:xxxxxxxxxxxxxxxxxx</span>
        </div>
        <div class="footer-copy">
            <span>Copyright© 信德利蛋糕官网商城 2007-2018, 版权所有 京ICP备14006254号-1</span>
        </div>
    </footer>
    <!-- 底部footer  end -->
</body>
</html>