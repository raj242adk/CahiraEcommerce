package com.ecommerce.cahira.service;

import com.fasterxml.jackson.databind.JsonNode;

public interface EpaymentService {

    public void initiatePayment(JsonNode requestData);
}
