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



router.get('/getEvents', function(req, res, next) {
    
    if(req.param('secret') != "q1w3e5r7t8y"){
        res.send("[{code: 404, err: access denied}]");
    } else {

        var sql = "select e.e_id, e.u_id, e.e_logo, e.e_name, e.e_type, e.e_city, e.e_address, e.e_start_date, e.e_end_date,(select count(pg.p_id) from atm_pageview as pg where pg.key_id = e.e_id) as pageview from atm_events as e, atm_pageview as p group by e_id";
        sql += " order by e.e_created_time desc";

        if (req.param('start') && req.param('count')) {
            sql += " limit " + req.param('start') + "," + req.param('count');
        }

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

router.get('/getTotal', function(req, res, next) {

    if(req.param('secret') != "q1w3e5r7t8y"){
        res.send("[{code: 404, err: access denied}]");
    } else {

        var sql = "select count(e_id) as total from atm_events";
        if (req.param('e_city') != '所有' && req.param('e_city') != null) {
            sql += " where e_city = '" + req.param('e_city') + "'";
        }

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

router.get('/getEventByEId', function(req, res, next) {

    if(req.param('secret') != "q1w3e5r7t8y"){
        res.send("[{code: 404, err: access denied}]");
    } else {
        var sql = "select e.e_id, e.u_id, e.e_logo, e.e_name, e.e_description, " +
            "e.e_type, e.e_city, e.e_address, e.e_start_date, e.e_end_date," +
            "(select count(pg.p_id) from atm_pageview as pg where pg.key_id = e.e_id) as pageview from atm_events as e";

        if (req.param('e_id')) {
            sql += " where e.e_id = " + req.param('e_id');
        }
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

router.get('/getEventsByCity', function(req, res, next) {

    if(req.param('secret') != "q1w3e5r7t8y"){
        res.send("[{code: 404, err: access denied}]");
    } else {

        var sql = "select * from atm_events";
        if (req.param('e_city') != '所有') {
            sql += " where e_city = '" + req.param('e_city') + "'";
        }
        sql += " order by e_created_time desc";

        if (req.param('start') && req.param('count')) {
            sql += " limit " + req.param('start') + "," + req.param('count');
        }

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




module.exports = router;
