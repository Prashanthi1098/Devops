function fun1()
{
	var a=document.registration.uid.value;
	var b=document.registration.username.value;
	var c=document.registration.password.value;
	var d=document.registration.email.value;
	var e=document.registration.address.value;
	var i=document.registration.country.value;
	var j=document.registration.zipcode.value;
	var k=document.registration.language.value;
	var l=document.registration.about.value;
	var f=document.getElementsByName("mgender");
	/*var z="";
	var p=document.getElementByName("en");
	 for(var i=0;i<p.length;i++)
		 {
		 if(p[i].checked)
			 z=z+z[i].value;
		 }
	 alert(z);*/
	/*if(document.getElementById('mmale').checked)
		f=document.getElementById("mmale").value;
	else if(document.getElementById('ffemale').checked)
		f=document.getElementById('ffemale').value;
	else
		f=document.getElementById('oother').value;*/
 alert("hi hello how are you "+a+""+b+""+c+""+d+""+e+""+f+""+i+""+j+""+k+""+l );
 
 if(fun2(a,5,12))
	 {
	 if(fun3(c,7,10))
		 {
		 if(allLetter(b))
			 {
			 
			 }
		 if(address(e))
			 {
			 
			 }
		 if(countryselect(i))
			 {
			 
			 }
		 if(allnumeric(j))
			 {
			 
			 }
		 if(validateEmail(d))
		 {
			 
		 }
		 if(gen(f))
		 {
		 
		 }
		 
		 }
	 }
 
	
}

function fun2(uid,mx,my)
{
var uid_len=uid.length;
if(uid_len==0 || uid_len>=my || uid_len<mx)
	{
	alert("user id should not be empty/length be between"+mx+"to"+my);
	uid.focus();
	return false;
	}
return true;
	}

function fun3(c,mx,my)
{
var pid_len=c.length;
if(pid_len==0 || pid_len>=my || pid_len<mx)
	{
	alert(" password should not be empty/length be between"+mx+"to"+my);
	c.focus();
	return false;
	}
return true;
	}

function allLetter(b)
{
var letters=/^[A-Za-z]+$/;
if(b.match(letters))
	{
	return true;
	}
else
	{
	alert("username must have alphabet characters only")
	b.focus();
	return false;
	}
	
}
 
function address(e)
{
var letters=/^[0-9A-Za-z]+$/;
if(e.match(letters))
	{
	return true;
	}
else
	{
	alert("address must have alphabet and numbers only")
	e.focus();
	return false;
	}
	
}




function countryselect(i)
{
	if(i=="Default")
		{
	alert("Select your country from the list")
	i.focus();
    return false;
		}
else
	
	return true;
	
}


function allnumeric(j)
{
var numbers=/^[0-9]+$/;
if(j.match(numbers))
	{
	return true;
	}
else
	{
	alert("Zip code must have numbeic characters only");
	f.focus;
	return false;
	}
}

function validateEmail(d)
{
var mailformat=/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
if(d.match(mailformat))
	{
	return true;
	}
else
	{
	alert("you have entered an invalid email address!");
	d.focus();
	return false;
	}
}

function gen(f)
{
	var x=0;
	if(f[0].checked==true)
		{
		x++;
		gender="male";
		}
	if(f[1].checked==true)
	{
	x++;
	gender="female";
	}
if(f[2].checked==true)
	{
	x++;
	gender="other";
	}
	if(x==0)
		{
		alert("select male or female");
		f.focus();
		return false;
		}
	else
		{
		alert("form successfully submitted");
		window.location.reload();
		return true();
		}
}
