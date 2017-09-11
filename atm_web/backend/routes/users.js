/**
 * Created by yao on 7/17/17.
 */

var express = require('express');
var router = express.Router();
var auth = require('./auth.js');
var mysql = require('mysql');
var bodyParser = require('body-parser');
// Create application/x-www-form-urlencoded parser
var helper = require('./helper.js');
var urlencodeParser = bodyParser.urlencoded( { extended: false });

var connection = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  password: 'fm@youtumi',
  database: 'atm'
});

connection.connect();

var date = new Date();


router.get('/getUserById', function(req, res, next) {

  if(req.param('secret') != "q1w3e5r7t8y"){
    res.send("[{code: 404, err: access denied}]");
  } else {

    var sql = "select * from atm_users";
    if (req.param('u_id')) {
      sql += " where u_id = " + req.param('u_id');
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

// API for registered by phone.
router.post('/create', urlencodeParser, function(req, res, next) {


  if(req.param('secret') != "q1w3e5r7t8y"){
    res.send("[{code: 404, err: access denied}]");
  } else {

    var createSQL = "insert into atm_users(u_name, u_phone_num, u_pwd, u_status, u_role, u_created_time, u_updated_time) values (?,?,?,1,1,default,default)";
    var inserts = [req.body.scCode + "58咖", req.body.u_phone_num, req.body.u_pwd];
    createSQL = mysql.format(createSQL, inserts);
    console.log(createSQL);
    connection.query(createSQL, function (err, result) {
      if (err) {
        res.send(err);
      } else {

        connection.query("select u_id from atm_users where u_phone_num='" + req.body.u_phone_num + "';", function (err, result) {
          if (result.length > 0)
            helper.initializationPicFolder(result[0].u_id);
        });

        res.send(result);
      }
    });
  }

});


router.post('/login', urlencodeParser, function(req,res, next) {

  if(req.param('secret') != "q1w3e5r7t8y"){
    res.send("[{code: 404, err: access denied}]");
  } else {

    var criteriaSQL = mysql.format("select * from atm_users where u_phone_num = ? and u_pwd = ?", [req.body.u_name, req.body.u_pwd]);
    connection.query(criteriaSQL, function (err, result) {
      if (err) {
        res.send(err);
      } else {
        if (result.length > 0) {
          // var log = "用户: " + result[0].u_id + " 登录成功.";
          // var ipAddress = requestIp.getClientIp(req);
          // var insertLog = mysql.format("insert into jk_logs(lg_content,lg_ip,lg_create_time) values(?,?,?)", [log, ipAddress, date]);
          // connection.query(insertLog, function (err, result) {
          //   console.log(insertLog);
          //   if (err)
          //     console.log(err);
          //   else
          //     console.log(result);
          // });

          // update u_last_login time
          var updateLoginTime = mysql.format("update atm_users set u_updated_time = ? where u_phone_num = ?", [date, req.body.u_name]);
          connection.query(updateLoginTime, function (err, result) {
            console.log(updateLoginTime);
            if (err)
              console.log(err);
            else
              console.log(result);
          });


          res.send([{
            u_id: result[0].u_id,
            u_avatar: result[0].u_avatar,
            u_name: result[0].u_name,
            secret: auth.encrypt(result[0].u_id.toString())
          }]);
        } else {
          res.send(result);
        }
      }
    });
  }
});





module.exports = router;
