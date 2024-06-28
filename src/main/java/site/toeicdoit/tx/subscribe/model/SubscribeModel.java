package site.toeicdoit.tx.subscribe.model;

import jakarta.persistence.*;
import lombok.*;
import site.toeicdoit.tx.domain.model.BaseEntity;
import site.toeicdoit.tx.payment.model.PaymentModel;


import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "subscribes")
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(exclude = "id")
public class SubscribeModel extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id", nullable = false)
    private Long id;
    @Setter
    private Boolean subscribeState;
    @Setter
    private LocalDateTime endDate;
    private LocalDateTime createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserModel userId;

    @OneToMany(mappedBy = "subscribeId", fetch = FetchType.LAZY)
    private List<PaymentModel> paymentIds;

}
