<%@page language="java"%>
<head>
  <link rel="stylesheet" href="loginstyle.css" />
  <title>Signuppage</title>
</head>

<html>
<form action="update" method="post">
  <div class="outer-box">
    <div class="email">
      <input class="input" type="text" placeholder="Email" id="email" name="email"/>
    </div>
    <div class="password">
      <input class="input" type="text" placeholder="Password" id="password" name="password"/>
    </div>
    <div class="buttons">

      <div>
        <button formaction="add" type="submit" value="Submit">Sign Up</button>
      </div>
    </div>
  </div>
</form>
</html>
