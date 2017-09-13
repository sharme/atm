var express = require('express');
var path = require('path');
var favicon = require('serve-favicon');
var logger = require('morgan');
var cookieParser = require('cookie-parser');
var bodyParser = require('body-parser');

var index = require('./backend/routes/index');
var users = require('./backend/routes/users');
var events = require('./backend/routes/events');
var comments = require('./backend/routes/comments');
var api = require('./backend/routes/api');
var newest = require('./backend/routes/newest.js');
var notifications = require('./backend/routes/notifications.js');
var feedback = require('./backend/routes/feedbacks.js');
var pageView = require('./backend/routes/pageview.js');

var app = express();

// view engine setup
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'jade');

// uncomment after placing your favicon in /public
//app.use(favicon(path.join(__dirname, 'public', 'favicon.ico')));
app.use(logger('dev'));
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public/templated-urban')));

app.use(function(req, res, next){
  res.header('Access-Control-Allow-Origin', '*');
  res.header('Access-Control-Allow-Menthods', 'GET,PUT,POST,DELETE');
  res.header('Access-Control-Allow-Headers', 'Content-Type');
  next();
});


app.use('/backend', index);
app.use('/users', users);
app.use('/events', events);
app.use('/comments', comments);
app.use('/api', api);
app.use('/newest', newest);
app.use('/notifications', notifications);
app.use('/feedback', feedback);
app.use('/pageView', pageView);


// catch 404 and forward to error handler
app.use(function(req, res, next) {
  var err = new Error('Not Found');
  err.status = 404;
  next(err);
});

// error handler
app.use(function(err, req, res, next) {
  // set locals, only providing error in development
  res.locals.message = err.message;
  res.locals.error = req.app.get('env') === 'development' ? err : {};

  // render the error page
  res.status(err.status || 500);
  res.render('error');
});

module.exports = app;
