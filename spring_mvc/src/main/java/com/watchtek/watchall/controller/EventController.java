package com.watchtek.watchall.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.watchtek.watchall.service.EventService;
import com.watchtek.watchall.vo.AjaxResultVO;

/**
 * 이벤트 요청 컨트롤러
 * 
 * @date 2021.03.22
 * @author Ju
 */
@Controller
@RequestMapping("event/")
public class EventController
{
    private static final Logger LOGGER = LoggerFactory.getLogger(EventController.class);

    @Autowired
    private EventService eventService;

    /**
     * 이벤트 등급 정보를 반환한다. (테스트용)
     *
     * @return
     * @author Ju
     * @create-date : 2021. 3. 22.
     */
    @RequestMapping(value = "get-event-levels.do", method = RequestMethod.GET)
    @ResponseBody
    public AjaxResultVO getEventLevels()
    {
        AjaxResultVO resultVO = new AjaxResultVO(false, null);
        try
        {
            resultVO.setData(eventService.getEventLevels());
            resultVO.setSuccess(true);
        }
        catch (Exception e)
        {
            resultVO.setSuccess(false);
            LOGGER.error("[event] getEventLevels : " + e.getMessage(), e);
        }
        return resultVO;
    }

}
