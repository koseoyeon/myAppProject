package com.watchtek.watchall.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watchtek.watchall.mapper.EventMapper;

/**
 * 이벤트 웹 서비스
 * 
 * @date 2021.03.22
 * @author Ju
 */
@Service
public class EventService
{
    @Autowired
    EventMapper mapper;

    /**
     * 이벤트 등급 정보를 반환한다. (테스트용)
     *
     * @return
     * @author Ju
     * @create-date : 2021. 3. 22.
     */
    public List<Map<String, Object>> getEventLevels()
    {
        return mapper.getEventLevels();
    }
}
