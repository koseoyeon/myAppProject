package com.watchtek.watchall.mapper;

import java.util.List;
import java.util.Map;

/**
 * 이벤트 매퍼
 *
 * @author Ju
 * @version 1.0
 */
public interface EventMapper
{
    /**
     * 이벤트 등급 정보를 조회한다.
     *
     * @return
     * @author Ju
     * @create-date : 2021. 3. 22.
     */
    public List<Map<String, Object>> getEventLevels();
}
