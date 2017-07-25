package com.lt.component.message.processor;

import com.lt.entity.message.in.MessageEntity;
import com.lt.entity.message.out.MessageResultEntity;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-07-25 11:38:09
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
public interface MessageProcessor<T extends MessageEntity> {
	MessageResultEntity process(T in);
}
