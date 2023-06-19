package com.marvin.config;

import com.marvin.context.support.client.Client;
import com.marvin.context.support.client.DingClient;
import com.marvin.model.message.ding.DingDingProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(prefix = "calma.dingding",name = "enable",havingValue = "true")
@EnableConfigurationProperties(DingDingProperty.class)
@Slf4j
public class DingDingClientConfiguration {//注入发送钉钉信息的客户端

	@Bean
	@ConditionalOnMissingBean
	public Client dingDingClient(DingDingProperty dingProperty) {
		if (log.isDebugEnabled()){
			log.info("-----------------》》》》》钉钉组件客户端注入《《《《《《《-------------------------");
		}
		return new DingClient(dingProperty);
	}
}
