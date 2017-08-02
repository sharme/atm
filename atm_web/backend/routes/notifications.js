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
router.get('/getNotifications', function(req, res, next) {
    var sql = "select n_id, n_msg, n_created_time from atm_notifications";

    if(req.param('u_id') ) {
        sql += " where u_id = " + req.param('u_id');
    }
    
    sql += " order by n_created_time desc";
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
