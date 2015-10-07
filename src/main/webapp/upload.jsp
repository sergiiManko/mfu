<%--
 * Created by Sergey Manko
 * Date: 07.10.2015
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Upload</title>
</head>
<body>
<form method="post" action="uploadFile" enctype="multipart/form-data">
    <label for="choosefile">Select file to upload:</label>
    <input id="choosefile" type="file" name="uploadFile"/>
    <br/><br/>
    <input type="submit" value="Upload"/>
</form>
</body>
</html>
