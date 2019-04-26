<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<html>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<%----%>
<script type="text/javascript">
    $(function () {
        $("button").click(function () {
            $.ajax(
                {
                    url: "test/myAjax.do",
                    success: function (data) {
                        alert(data)
                    }
                }
            );
        });
    });
</script>
<body>
<h2>Hello World!</h2>
<button>submit ajax request</button>
</body>
</html>
