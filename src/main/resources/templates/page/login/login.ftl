<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>后台登录</title>
		<link rel="stylesheet" type="text/css" href="../admin/layui/css/layui.css" />
		<link rel="stylesheet" type="text/css" href="../admin/css/login.css" />
        <script src="webjars/jquery/3.1.1/jquery.min.js" type="text/javascript" charset="utf-8"></script>
	</head>

	<body>
		<div class="m-login-bg">
			<div class="m-login">
				<h3>后台系统登录</h3>
				<div class="m-login-warp">
					<form class="layui-form">
						<div class="layui-form-item">
							<input type="text" name="title" required lay-verify="required" placeholder="用户名" autocomplete="off" class="layui-input">
						</div>
						<div class="layui-form-item">
							<input type="text" name="password" required lay-verify="required" placeholder="密码" autocomplete="off" class="layui-input">
						</div>
						<div class="layui-form-item">
							<div class="layui-inline">
								<input type="text" name="verity" required lay-verify="required" placeholder="验证码" autocomplete="off" class="layui-input">
							</div>
							<div class="layui-inline">
								<img class="verifyImg" onclick="this.src=this.src+'?c='+Math.random();" src="../admin/images/login/yzm.jpg" />
							</div>
						</div>
						<div class="layui-form-item m-login-btn">
							<div class="layui-inline">
								<button class="layui-btn layui-btn-normal" lay-submit lay-filter="login">登录</button>
							</div>
							<div class="layui-inline">
								<button type="reset" class="layui-btn layui-btn-primary">取消</button>
							</div>
						</div>
					</form>
				</div>
				<p class="copyright">Copyright 2015-2016 by XIAODU</p>
			</div>
		</div>
		<script src="../admin/layui/layui.js" type="text/javascript" charset="utf-8"></script>
		<script>
			layui.use(['form', 'layedit', 'laydate'], function() {
				var form = layui.form(),
					layer = layui.layer;


				//自定义验证规则
				form.verify({
					title: function(value) {
						if(value.length < 5) {
							return '标题至少得5个字符啊';
						}
					},
					password: [/(.+){6,12}$/, '密码必须6到12位'],
					verity: [/(.+){6}$/, '验证码必须是6位'],
					
				});

				
				//监听提交
                form.on('submit(login)', function (data) {
                    //通过ajax进行对账号密码校验
                    $.ajax({
                        type: "get",
                        url: "/login/checkLogin",
                        data: "phone=1" + "&cardno=2",
                        success: function (data) {
                            if (data === 'ok') {
                                layer.alert('注册成功！', {icon: 1});
                                var url = "{:U('/main/main')}"; //成功跳转的url
                                setTimeout(window.location.href='/main/main',2000);
                            } else {
                                layer.msg(data.msg, {icon: 2});
                            }
                        }
                    });
                    // layer.alert(JSON.stringify(data.field), {
                    // 	title: '最终的提交信息'
                    // })
                    return false;
                });
            });
		</script>
	</body>

</html>