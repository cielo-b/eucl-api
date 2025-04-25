package com.app.eucl.schedulers;

import com.app.eucl.enums.ETokenStatus;
import com.app.eucl.models.PurchasedToken;
import com.app.eucl.repositories.IPurchasedTokenRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class TokenExpiryScheduler {
    private final IPurchasedTokenRepository purchasedTokenRepository;

    @Scheduled(cron = "0 0 0 * * ?")
    public void expireTokens() {
        List<PurchasedToken> tokens = purchasedTokenRepository.findByStatus(ETokenStatus.NEW);
        int expiredCount = 0;

        for (PurchasedToken token : tokens) {
            LocalDateTime expiryDate = token.getPurchasedDate().plusDays(token.getTokenValueDays());

            if (LocalDateTime.now().isAfter(expiryDate)) {
                token.setStatus(ETokenStatus.EXPIRED);
                expiredCount++;
            }
        }

        if (expiredCount > 0) {
            purchasedTokenRepository.saveAll(tokens);
            log.info("Marked {} tokens as EXPIRED", expiredCount);
        } else {
            log.info("No expired tokens found today.");
        }
    }
}
