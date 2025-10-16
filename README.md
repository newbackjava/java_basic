```

const http = require("http");
const server = http.createServer((req, res) => {
	res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
	res.end("welcome");
});
const PORT = 3000;
server.listen(PORT, () => {
console.log("server 3000 start");
});



```



# 자바 기본
# JDBC + mySQL
# JDBC + mongoDB
