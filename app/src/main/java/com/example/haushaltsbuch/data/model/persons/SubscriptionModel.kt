package com.example.haushaltsbuch.data.model.persons

import java.util.*

class SubscriptionModel (
        val name: String,
        val price: Currency,
        val billingInterval: BillingInterval
        ) {
}