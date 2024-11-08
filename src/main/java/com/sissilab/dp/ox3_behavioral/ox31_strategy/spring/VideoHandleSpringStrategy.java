package com.sissilab.dp.ox3_behavioral.ox31_strategy.spring;

import org.springframework.stereotype.Component;

/**
 * 具体策略类：视频处理策略
 */
@Component(HandleSpringContext.VIDEO_STRATEGY_TYPE)
public class VideoHandleSpringStrategy implements IHandleSpringStrategy {
    @Override
    public String handle() {
        return "handle video...";
    }
}
