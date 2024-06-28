package site.toeicdoit.tx.calendar.repository;



import site.toeicdoit.tx.calendar.model.CalendarModel;

import java.util.List;

public interface CalendarDao {
    List<CalendarModel> getCalendarByUserId(Long userId);
}
