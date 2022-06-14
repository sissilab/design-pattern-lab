package com.xixi.lab.dp.ox3_behavioral.ox3_01_strategy.normal;

/**
 * 具体策略类：图片处理策略
 */
public class ImageHandleStrategy implements IHandleStrategy {
    @Override
    public void handle() {
        System.out.println("handle image...");
    }
}
