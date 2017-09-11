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

var date =new Date();

router.post('/add', function(req, res, next) {

    if(req.param('secret') != "q1w3e5r7t8y"){
        res.send("[{code: 404, err: access denied}]");
    } else {

        var u_id = 0000; //click by visitors
        if (req.body.u_id) {
            u_id = req.body.u_id;
        }

        var addSQL = mysql.format("insert into atm_pageview(key_id, key_type, u_id, p_created_time, p_updated_time) values (?,?,?, default, default)", [req.body.key_id, 1, u_id]);

        connection.query(addSQL, function (err, result) {
            if (err) {
                res.send("Error: " + err);
            } else {
                res.send(result);
            }
        })
    }
});


router.get('/search', function(req, res, next) {

    if(req.param('secret') != "q1w3e5r7t8y"){
        res.send("[{code: 404, err: access denied}]");
    } else {
        var searchSQL = mysql.format("select count(*) as page_view from atm_pageview where key_id = ?;", [req.param('key_id')]);

        connection.query(searchSQL, function (err, result) {
            if (err) {
                res.send("Error: " + err);
            } else {
                res.send(result);
            }
        })
    }
});








module.exports = router;
