package com.app.eucl.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseTokenDTO {
    private int meterNumber;
    private int amount;
}
