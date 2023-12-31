package kopo.poly.calendar.history.service;

import kopo.poly.calendar.history.dto.OrderedDTO;
import kopo.poly.calendar.history.dto.OrderedHistoryByDayDTO;
import kopo.poly.calendar.history.dto.CalendarEventDTO;

import java.util.List;

public interface IOrderedHistoryService {

    /**
     * 유저정보 기반으로 캘린더에 띄워줄 OrderedHistoryByDayDTO 의 List 만들기
     * 이거를 CalendarEventDTO 로 만드는건 어디서 할지 고민중
     * @param pDTO
     * 유저정보가 담겨있음 (userId)
     * @return
     * userId 기반으로 모든 발주 가져오기 (group by 함수 활용)
     */
    List<CalendarEventDTO> getUserCalendarEventList(OrderedHistoryByDayDTO pDTO);

    /**
     * 
     * @param pDTO
     * 유저정보와 ocrDateLocalDate 가 담겨있음 이거로 조회해야됨
     * (userId, ocrDateLocalDate)
     * @return
     * userId 와 ocrDateLocalDate 를 기반으로 해당 일의 모든 발주 가져오기
     */
    List<OrderedDTO> getUserOrderedList(OrderedHistoryByDayDTO pDTO);
}
