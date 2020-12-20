package com.yuntian.controller;

import com.yuntian.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/resume")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;


    @Value("${server.port}")
    private Integer port;

    //"/resume/openstate/1545132"
    @GetMapping("/openstate/{userId}")
    public Integer findDefaultResumeState(@PathVariable Long userId, HttpServletRequest request) {
        // 模拟处理超时
        if (port == 8081) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //return resumeService.findDefaultResumeByUserId(userId).getIsOpenResume();
        System.out.println("====>>>>>>>>>>>>>>访问到我这里了......:" + request.getLocalPort());
        return port;
    }
}
