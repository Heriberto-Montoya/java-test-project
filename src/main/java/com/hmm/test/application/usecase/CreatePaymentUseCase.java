package com.hmm.test.application.usecase;

import com.hmm.test.domain.model.Payment;
import com.hmm.test.domain.responses.ResponseModel;

public interface CreatePaymentUseCase {
    ResponseModel<Payment> create(Payment payment);
}
