package com.kodwa

import io.micronaut.context.annotation.Requires
import jakarta.validation.constraints.NotBlank
import io.micronaut.context.annotation.ConfigurationProperties

@Requires(property = "dynamodb.table-name")
@ConfigurationProperties("dynamodb")
public interface DynamoConfiguration {
    @get:NotBlank
    val tableName: String
}
