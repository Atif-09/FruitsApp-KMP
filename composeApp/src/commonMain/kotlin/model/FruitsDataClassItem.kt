package model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class FruitsDataClassItem(
    @SerialName("family")
    val family: String,
    @SerialName("genus")
    val genus: String,
    @SerialName("id")
    val id: Int,
    @SerialName("name")
    val name: String,
    @SerialName("nutritions")
    val nutritions: Nutritions,
    @SerialName("order")
    val order: String
)

@Serializable
data class Nutritions(
    @SerialName("calories")
    val calories: Int,
    @SerialName("carbohydrates")
    val carbohydrates: Double,
    @SerialName("fat")
    val fat: Double,
    @SerialName("protein")
    val protein: Double,
    @SerialName("sugar")
    val sugar: Double
)