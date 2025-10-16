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

- index.html
  
```

<h1>i am out file</h1>
<img src=https://gongu.copyright.or.kr/static/gongu/img/sub/pixabay.jpg>

```

- server2.js

```
const http = require("http");
const fs = require("fs");
const path = require("path");

const PORT = 3000;
const INDEX_PATH = path.join(__dirname, "index.html");

const server = http.createServer((req, res) => {
  // 루트(/)로 왔을 때 index.html을 내려줌
  if (req.url === "/" || req.url === "/index.html") {
    fs.readFile(INDEX_PATH, (err, data) => {
      if (err) {
        res.writeHead(500, { "Content-Type": "text/plain; charset=utf-8" });
        return res.end("500 Internal Server Error");
      }
      res.writeHead(200, { "Content-Type": "text/html; charset=utf-8" });
      res.end(data);
    });
  } else {
    // 그 외 경로는 404
    res.writeHead(404, { "Content-Type": "text/plain; charset=utf-8" });
    res.end("404 Not Found");
  }
});

server.listen(PORT, () => {
  console.log(`server ${PORT} start`);
});


```

# 자바 기본
# JDBC + mySQL
# JDBC + mongoDB
