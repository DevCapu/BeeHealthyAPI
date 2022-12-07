package br.com.devcapu.beehealthy.domain.model

import java.util.regex.Pattern

val EMAIL_ADDRESS_PATTERN: Pattern =
    Pattern.compile("[a-zA-Z\\d+._%\\-]{1,256}@[a-zA-Z\\d][a-zA-Z\\d\\-]{0,64}(\\.[a-zA-Z\\d][a-zA-Z\\d\\-]{0,25})+")

data class Email(
    val address: String,
) {
    val isValid: Boolean
        get() = EMAIL_ADDRESS_PATTERN.matcher(address).matches()

    override fun toString() = address
}