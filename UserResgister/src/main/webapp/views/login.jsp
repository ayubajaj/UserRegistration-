<%@page language="java"%>
<head>
  <link rel="stylesheet" href="loginstyle.css" />
  <title>Regpage</title>
</head>

<html>
<form >
  <div class="outer-box">
    <div class="email">
      <input class="input" type="text" placeholder="Email" id="email" name="email"/>
    </div>
    <div class="password">
      <input class="input" type="text" placeholder="Password" id="password" name="password"/>
    </div>
    <div class="buttons">
      <div>
        <button formaction="login" method="post" type="submit" value="Submit" name="signin">Login</button>
      </div>
      <div>
        <button formaction="signup" >Sign Up</button>
      </div>
    </div>
  </div>
</form>
</html>
