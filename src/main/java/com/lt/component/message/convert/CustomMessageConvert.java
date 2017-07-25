package com.lt.component.message.convert;

import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;

import com.lt.entity.message.MessageEnum;
import com.lt.entity.message.in.MessageEntity;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-07-25 10:12:02
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
public class CustomMessageConvert extends MappingJackson2XmlHttpMessageConverter {
	@Override
	protected Object readInternal(Class<?> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
		return super.readInternal(clazz, inputMessage);
	}

	@Override
	public Object read(Type type, Class<?> contextClass, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
		if (type.getTypeName().equals(MessageEntity.class.getTypeName())) {
			ParameterizedTypeImpl parameterizedType = ParameterizedTypeImpl.make(Map.class, new Type[]{String.class, String.class}, null);
			Map<String,String> params = (Map<String, String>) super.read(parameterizedType, contextClass, inputMessage);
			MessageEnum messageEnum = MessageEnum.get(params.get("MsgType"));
			if (messageEnum != null) {
				return messageEnum.getIn().init(params);
			}else{
				return new MessageEntity().init(params);
			}
		}
		return super.read(type, contextClass, inputMessage);
	}

}
