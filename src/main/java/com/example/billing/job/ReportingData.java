package com.example.billing.job;

public record ReportingData(
        BillingData billingData,
        double billingTotal
) {
}
