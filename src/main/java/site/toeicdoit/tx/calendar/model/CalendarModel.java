package site.toeicdoit.tx.calendar.model;

import jakarta.persistence.*;
import lombok.*;
import site.toeicdoit.tx.domain.model.BaseEntity;


import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
@ToString(exclude = {"id"})
@Entity(name = "calendars")
public class CalendarModel extends BaseEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private boolean allDay;
    @Setter
    private String start;
    private LocalDateTime startTime;
    private LocalDateTime endTime;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserModel userId;
}
