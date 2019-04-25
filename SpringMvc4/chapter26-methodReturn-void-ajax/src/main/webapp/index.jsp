<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<html>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>

<script type="text/javascript">
    $(function () {
        $("button").click(function () {
            // alert("=========================")
            $.ajax(
                {
                    url: "test/myAjax.do",
                    data: {
                        name: "张三",
                        age: 23
                    },
                    success: function (data) {
                        var json = eval("(" + data + ")")
                        alert(json.name + " " + json.age)
                    }
                }
            )
        })
    })
</script>
<body>
<h2>Hello World!</h2>
<button>submit ajax request</button>
</body>
</html>
