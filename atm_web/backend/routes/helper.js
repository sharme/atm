


var helper = module.exports = {
    fs: require('fs'),
    initializationPicFolder: function(u_id) {
        var originalFolderPath = __dirname.substr(0, __dirname.length - 7) + "/public/images/original/" + u_id;
        var smallFolderPath = __dirname.substr(0, __dirname.length - 7) + "/public/images/small/" + u_id;
        var bigFolderPath = __dirname.substr(0, __dirname.length - 7) + "/public/images/big/" + u_id;
        var mini = __dirname.substr(0, __dirname.length - 7) + "/public/images/mini/" + u_id;


        helper.fs.mkdir(originalFolderPath, 0777, function(result){});
        helper.fs.mkdir(bigFolderPath, 0777, function(result){});
        helper.fs.mkdir(smallFolderPath, 0777,function(result){});
        helper.fs.mkdir(mini, 0777,function(result){});
    }

};