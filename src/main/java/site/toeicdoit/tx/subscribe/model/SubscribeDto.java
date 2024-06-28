package site.toeicdoit.tx.subscribe.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Log4j2
public class SubscribeDto {
    private Long id;
    private Boolean subscribeState;
    private LocalDateTime endDate;
    private LocalDateTime createdAt;
    private Long userId;
    private Long paymentId;
}
