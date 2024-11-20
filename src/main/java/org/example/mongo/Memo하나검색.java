package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class Memo하나검색 {
    public static void main(String[] args) {
        //1. MongoClient생성
        MongoClient client = new MongoClient("localhost", 27017);
        //2. db연결, collection연결
        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> member = db.getCollection("memo");
        System.out.println("member컬렉션까지 연결 성공~!");
        //3. 전송할 json생성(조건)
        Document filter = new Document();
        filter.append("age", 3);

        //4. 전송, 결과처리
        FindIterable<Document> result = member.find(filter);
        Document doc = result.first();
        System.out.println(doc.getString("name"));
        System.out.println(doc.getInteger("age"));
        System.out.println(doc.getString("office"));
        System.out.println(doc.getString("phone"));

        System.out.println("-----------------------");
        List<Document> result2 = member.find(filter).into(new ArrayList<>());
        System.out.println(result2.get(0).getString("name"));
        System.out.println(result2.get(0).getInteger("age"));
        System.out.println(result2.get(0).getString("office"));
        System.out.println(result2.get(0).getString("phone"));
        client.close();
    }
}