package com.dailycodework.buynowdotcom.utils;

import com.stripe.Stripe;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class StripeUtil {

    @Value("${stripe.secret.key}")
    private String stripeSecretKey;

    @PostConstruct
    public void inti(){
        Stripe.apiKey = stripeSecretKey;
    }
}
