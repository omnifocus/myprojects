package com.omnifocus.controller;

import com.omnifocus.grace.result.GraceJSONResult;
import com.omnifocus.pojo.test.Stu;
import com.omnifocus.service.StuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("u")
@Slf4j
public class HelloController {

    @Autowired
    private StuService stuService;

    @RequestMapping("stu")
    public Object hello() {
        com.omnifocus.pojo.Stu stu = new com.omnifocus.pojo.Stu();
//        stu.setId(1);
        stu.setAge(20);
        stu.setName("panda");
        stuService.save(stu);

        return GraceJSONResult.ok(stu);
    }


}
