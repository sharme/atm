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
router.get('/getEvents', function(req, res, next) {
    var sql = "select e.e_id, e.u_id, e.e_logo, e.e_name, e.e_type, e.e_city, e.e_address, e.e_start_date, e.e_end_date,(select count(pg.p_id) from atm_pageview as pg where pg.key_id = e.e_id) as pageview from atm_events as e, atm_pageview as p group by e_id";

    sql += " order by e.e_created_time desc";

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

router.get('/getTotal', function(req, res, next) {
    var sql = "select e_id from atm_events";

    if(req.param('e_city') != '所有') {
        sql += " where e_city = '" + req.param('e_city') + "'";
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



router.get('/getEventByEId', function(req, res, next) {
    // var sql = "select * from atm_events";
    var sql = "select e.e_id, e.u_id, e.e_logo, e.e_name, e.e_description, e.e_type, e.e_city, e.e_address, e.e_start_date, e.e_end_date,(select count(pg.p_id) from atm_pageview as pg where pg.key_id = e.e_id) as pageview from atm_events as e, atm_pageview as p";

    if(req.param('e_id')) {
        sql += " where e.e_id = " + req.param('e_id');
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


router.get('/getEventsByCity', function(req, res, next) {
    var sql = "select * from atm_events";

    if(req.param('e_city') != '所有') {
        sql += " where e_city = '" + req.param('e_city') + "'";
    }

    sql += " order by e_created_time desc";

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
