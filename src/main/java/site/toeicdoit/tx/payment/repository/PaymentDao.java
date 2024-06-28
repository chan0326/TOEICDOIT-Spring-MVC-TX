package site.toeicdoit.tx.payment.repository;



import site.toeicdoit.tx.payment.model.PaymentDto;

import java.util.List;

public interface PaymentDao {
    List<PaymentDto> getPaymentByUserId(Long userId);
}
