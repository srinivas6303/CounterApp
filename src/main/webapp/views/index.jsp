<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Counter App</title>
</head>
<body>
    <h1>Simple Counter</h1>
    <h2>Current Count: ${count}</h2>

    <form action="increment" method="get">
        <input type="hidden" name="count" value="${count}" />
        <button type="submit">Increment</button>
    </form>

    <form action="decrement" method="get">
        <input type="hidden" name="count" value="${count}" />
        <button type="submit">Decrement</button>
    </form>
</body>
</html>
