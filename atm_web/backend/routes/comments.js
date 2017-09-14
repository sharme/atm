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


router.get('/getComments', function(req, res, next) {

    if(req.param('secret') != "q1w3e5r7t8y"){
        res.send("[{code: 404, err: access denied}]");
    } else {
        var sql = mysql.format("select * from atm_comments where s_id = ? and c_type = ?", [req.param('s_id'), req.param('c_type')]);

        sql += " order by c_created_time desc";

        // if(req.param('start') && req.param('count')) {
        //     sql += " limit " + req.param('start') + "," + req.param('count');
        // }

        console.log(sql);

        connection.query(sql, function (err, result) {
            if (err) {
                res.send("[{code: 500, err: " + err + "}]");
            } else {
                res.send(result);
            }
        })
    }

});


router.post('/add', function(req, res, next) {

    if(req.param('secret') != "q1w3e5r7t8y"){
        res.send("[{code: 404, err: access denied}]");
    } else {

        var addSQL = mysql.format("insert into atm_comments(c_type, s_id, u_id, c_comment, " +
            "c_created_by, c_created_time, c_updated_by, c_updated_time) values(?,?,?,?,null,?,null,?);", [req.body.c_type, req.body.s_id, req.body.u_id, req.body.c_comment, date, date]);

        connection.query(addSQL, function (err, result) {
            if (err) {
                res.send("Error: " + err);
            } else {
                res.send(result);
            }
        })
    }
});





module.exports = router;
