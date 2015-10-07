<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Загрузка файлов на сервер</title></head>
<body>
<form method="post" action="/upload" enctype="multipart/form-data">
<input type="file" name="data"/>
<input type="submit" value="Загрузить"/>
</form>
</body>
</html>