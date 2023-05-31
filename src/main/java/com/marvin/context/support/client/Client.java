package com.marvin.context.support.client;

import com.marvin.model.message.Message;

/**
 * @Describe: 真正的发送组件
 * @Date: 2021/03/01
 * @Author: Marvin
 */
@FunctionalInterface
public interface Client {

	void doSend(Message message);
}
