package site.toeicdoit.tx.calendar.service;



import site.toeicdoit.tx.calendar.model.CalendarDto;
import site.toeicdoit.tx.calendar.model.CalendarModel;
import site.toeicdoit.tx.domain.model.MessengerVo;
import site.toeicdoit.tx.service.CommandService;
import site.toeicdoit.tx.service.QueryService;

import java.util.List;

public interface CalendarService extends CommandService<CalendarDto>, QueryService<CalendarDto> {

    default CalendarDto entityToDto(CalendarModel entity){
        return CalendarDto.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .allDay(entity.isAllDay())
                .start(entity.getStart())
                .userId(entity.getUserId().getId())
                .startTime(entity.getStartTime())
                .endTime(entity.getEndTime())
                .build();
    }

    default CalendarModel dtoToEntity(CalendarDto dto) {
        return CalendarModel.builder()
                .title(dto.getTitle())
                .allDay(dto.isAllDay())
                .start(dto.getStart())
                .userId(UserModel.builder().id(dto.getUserId()).build())
                .startTime(dto.getStartTime())
                .endTime(dto.getEndTime())
                .build();
    }
    MessengerVo save(List<CalendarDto> calendarDto);

    List<CalendarDto> getCalendarByUserId(Long userId);

    MessengerVo add(CalendarDto dto);
}
