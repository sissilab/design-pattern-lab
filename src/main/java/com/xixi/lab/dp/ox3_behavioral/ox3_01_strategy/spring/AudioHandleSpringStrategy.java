package com.xixi.lab.dp.ox3_behavioral.ox3_01_strategy.spring;

import org.springframework.stereotype.Component;

/**
 * 具体策略类：音频处理策略
 */
@Component(HandleSpringContext.AUDIO_STRATEGY_TYPE)
public class AudioHandleSpringStrategy implements IHandleSpringStrategy {
    @Override
    public String handle() {
        return "handle audio...";
    }
}
