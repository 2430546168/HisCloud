package com.yhhis.controller.Patient;

import com.yhhis.service.impl.RedisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.listener.KeyExpirationEventMessageListener;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.stereotype.Component;

@Component
public class RedisKeyExpirationListener extends KeyExpirationEventMessageListener {

    @Autowired
    RedisServiceImpl redisServiceImpl;

    public RedisKeyExpirationListener(RedisMessageListenerContainer listenerContainer) {
        super(listenerContainer);

    }

    /**
     *      * redis失效key事件处理      * @param message      * @param pattern      
     */
    @Override
    public void onMessage(Message message, byte[] pattern) {
    }

}
