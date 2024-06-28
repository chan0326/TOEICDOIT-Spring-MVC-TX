package site.toeicdoit.tx.payment.model;

import jakarta.persistence.*;
import lombok.*;
import site.toeicdoit.tx.domain.model.BaseEntity;
import site.toeicdoit.tx.enums.PaymentStatus;
import site.toeicdoit.tx.product.model.ProductModel;
import site.toeicdoit.tx.subscribe.model.SubscribeModel;


import java.time.LocalDateTime;


@Entity(name = "payments")
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(exclude = "id")
public class PaymentModel extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id", nullable = false)
    private Long id; // 결제 번호
    @Setter
    private Integer amount; // 결제 금액
    @Setter
    private PaymentStatus status; // 결제 상태
    @Setter
    private String paymentUid; // 결제 고유 번호
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserModel userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private ProductModel productId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subscribe_id")
    private SubscribeModel subscribeId;





}