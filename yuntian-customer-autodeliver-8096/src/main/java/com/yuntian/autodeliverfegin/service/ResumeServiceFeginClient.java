package com.yuntian.autodeliverfegin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Administrator
 * @date 2020-12-20 23:36
 * @description
 */
@FeignClient(name="yuntian-service-resume" ,path = "/resume",fallback = ResumeFallback.class)
public interface ResumeServiceFeginClient {

    /**
     * 调⽤的请求路径
     * @param userId
     * @return
     */
    @RequestMapping(value = "/openstate/{userId}",method= RequestMethod.GET)
    Integer findResumeOpenState(@PathVariable(value = "userId") Long userId);
}
