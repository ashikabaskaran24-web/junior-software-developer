const http=require("http")
http.createServer(function(req,res){
    res.end("<h1>welcome to nodejs</h1>");
}).listen(9887)