/**
 * Created by yao on 7/17/17.
 */

var express = require('express');
var router = express.Router();
var mysql = require('mysql');
var bodyParser = require('body-parser');
// Create application/x-www-form-urlencoded parser
var urlencodeParser = bodyParser.urlencoded( { extended: false });

var connection = mysql.createConnection({
    host: '127.0.0.1',
    user: 'root',
    password: 'fm@youtumi',
    database: 'atm'
});

connection.connect();

var date = new Date();


// 小白u_id 喜欢at_id 足迹tp_id
// [小白] [喜欢] 了你的 [足迹]    [时间]
router.get('/getNewest', function(req, res, next) {
    var sql = "select (select u_name from atm_users where u_id=n.n_from) as u_name, n_message, n_created_time from atm_newest as n";

    sql += " order by n_created_time desc";

    if(req.param('start') && req.param('count')) {
        sql += " limit " + req.param('start') + "," + req.param('count');
    }

    console.log(sql);
    
    connection.query(sql, function (err, result) {
        if(err) {
            res.send("[{code: 500, err: "+ err +"}]");
        } else {
            res.send(result);
        }
    })

});







module.exports = router;
