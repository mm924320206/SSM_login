$(function(){
	//错误提示
	$('#l_username').blur(logincheckName);
	$('#l_password').blur(logincheckpassword);
	$('#r_username').blur(regcheckName);
	$('#r_password').blur(regcheckpassword);
		$("#create").click(function(){
			check_register();
			return false;
		})
		$("#login").click(function(){
			check_login();
			return false;
		})
		$('.message a').click(function () {
		    $('form').animate({
		        height: 'toggle',
		        opacity: 'toggle'
		    }, 'slow');
		});
	});

function logincheckName(){
	var name = $('#l_username').val();
	if(name == null || name == ""){
		//提示错误
		$('#l_user_msg').html("用户名不能为空");
		return false;
	}
	var reg = /^\w{3,10}$/;
	if(!reg.test(name)){
		$('#l_user_msg').html("输入3-10个字母或数字或下划线");
		return false;
	}
	$('#l_user_msg').empty();
	return true;
}

function logincheckpassword(){
	var pwd = $('#l_password').val();
	if(pwd == null || pwd == ""){
		//提示错误
		$('#l_password_msg').html("密码不能为空");
		return false;
	}
	var reg = /^\w{3,10}$/;
	if(!reg.test(pwd)){
		$('#l_password_msg').html("输入3-10个字母或数字或下划线");
		return false;
	}
	$('#l_password_msg').empty();
	return true;
}

function regcheckName(){
	var name = $('#r_username').val();
	if(name == null || name == ""){
		//提示错误
		$('#r_user_msg').html("用户名不能为空");
		return false;
	}
	var reg = /^\w{3,10}$/;
	if(!reg.test(name)){
		$('#r_user_msg').html("输入3-10个字母或数字或下划线");
		return false;
	}
	$('#r_user_msg').empty();
	return true;
}


function regcheckpassword(){
	var pwd = $('#r_password').val();
	if(pwd == null || pwd == ""){
		//提示错误
		$('#r_password_msg').html("密码不能为空");
		return false;
	}
	var reg = /^\w{3,10}$/;
	if(!reg.test(pwd)){
		$('#r_password_msg').html("输入3-10个字母或数字或下划线");
		return false;
	}
	$('#r_password_msg').empty();
	return true;
}


function checkTelephone(){
	var tel = $('#r_tel').val();
	
	var reg = /^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8}$/;
	if(!reg.test(tel)){
		$('#r_tel_msg').html("输入正确的电话号码");
		return false;
	}
	$('#r_tel_msg').empty();
	return true;
}

function check_login()
	{
	 var name=$("#l_username").val();
	 var pass=$("#l_password").val();
	 if (logincheckName()==true&&logincheckpassword()==true) {
	 	 $.post("userlogin.do",{"username":name,"password":pass},function(data){
	 	 			
				  	if(data.msg=="yes")
				  	/*window.location.href="home";*/
				  	alert("登陆成功！");
				  	if(data.msg=="no")
				  	$('#l_password_msg').html("用户名或密码错误");
				  },"json");
	 } else{
	 	$("#login_form").removeClass('shake_effect');  
	  setTimeout(function()
	  {
	   $("#login_form").addClass('shake_effect')
	  },100);  
	 }
	 
	}
function check_register(){
		var name = $("#r_username").val();
		var pass = $("#r_password").val();
		var tel = $("#r_tel").val();
		if(name!="" && pass=="" && email != "")
		 {
		  alert("注册成功！");
		  $("#l_username").val("");
		  $("#l_password").val("");
		 }
		 else
		 {
		  $("#login_form").removeClass('shake_effect');  
		  setTimeout(function()
		  {
		   $("#login_form").addClass('shake_effect')
		  },100);  
		 }
	}
	