<%--
  Created by IntelliJ IDEA.
  User: lzy
  Date: 17/5/27
  Time: 下午11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="./react/react.js"></script>
    <script src="./react/react-dom.js"></script>
    <script src="./react/babel.js"></script>
<script>

</script>
</head>
<body>
<div id="example"></div>
<input type="button" value="设计兵团"/>
<script type="text/babel">
    var HelloMessage = React.createClass({
        getInitialState: function() {
            return {value: 'Hello Runoob!'};
        },
        handleChange: function(event) {
            $.get("http://localhost:8086/crawlerDesignCompany", function (result) {
                this.setState({
                    value: result
                });
            }.bind(this));
        },
        render: function() {
            var value = this.state.value;
            return <div>
                <input type="text" value="设计兵团获取" onChange={this.handleChange} />
                <h4>{value}</h4>
            </div>;
        }
    });
    ReactDOM.render(
            <HelloMessage />,
            document.getElementById('example')
    );
</script>
</body>
</html>
