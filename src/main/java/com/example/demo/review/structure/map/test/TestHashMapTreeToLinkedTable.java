package com.example.demo.review.structure.map.test;

import com.example.demo.review.structure.map.HashMapTest;
import com.example.demo.review.structure.map.MapTest;
import com.example.demo.review.structure.map.test.entity.UserKey;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 *
 * @Auther: bianjie
 * @Date: 2020/5/30
 */
public class TestHashMapTreeToLinkedTable {

    @Test
    public void testBRtreeToLinkedTable() {
        HashMapTest<UserKey,Integer> map = new HashMapTest();
        List<UserKey> userKeys = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            UserKey userKey = new UserKey("k" + i);
            map.put(userKey, i);
            userKeys.add(userKey);
            map.printCurrentStructure();
        }
        map.printCurrentStructure();

        //安排移除顺序
        int[] removeKeys = {1,3,8,4,0,2,7};
        for (int removeKey : removeKeys) {
            UserKey userKey = userKeys.get(removeKey);
            map.remove(userKey);
            System.out.println("移除:"+userKey.name+"后结构如下：");
            map.printCurrentStructure();
        }


        for (MapTest.Entry<UserKey, Integer> userKeyIntegerEntry : map.entrySet()) {

        }

    }





}
