package com.yuntian.autodeliverfegin.contoller;

import com.yuntian.autodeliverfegin.service.ResumeServiceFeginClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autodeliver")
public class AutodeliverController {


    @Autowired
    private ResumeServiceFeginClient resumeServiceFeginClient;

    /**
     * 使用fegin调用
     * @param userId
     * @return
     */
    @GetMapping("/checkState/{userId}")
    public Integer findResumeOpenState(@PathVariable Long userId) {
        return resumeServiceFeginClient.findResumeOpenState(userId);
    }



}
