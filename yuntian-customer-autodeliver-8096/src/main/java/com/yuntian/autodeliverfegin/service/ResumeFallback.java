package com.yuntian.autodeliverfegin.service;

import org.springframework.stereotype.Component;

/**
 * 降级回退逻辑需要定义⼀个类，实现FeignClient接⼝，实现接⼝中的⽅法
 */
@Component("resumeServiceFeginClient")
public class ResumeFallback implements ResumeServiceFeginClient{

    @Override
    public Integer findResumeOpenState(Long userId) {
        return -1;
    }
}
