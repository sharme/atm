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
router.get('/add', function(req, res, next) {
    
    var sql = mysql.format(" insert into atm_feedbacks(u_id, f_msg, f_created_time, f_updated_time) values(?, ?, default, default)", [req.param('u_id'), req.param('f_msg')]);
    
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
