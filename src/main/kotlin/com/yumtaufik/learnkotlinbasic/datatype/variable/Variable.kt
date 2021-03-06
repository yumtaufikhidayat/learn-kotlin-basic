package com.yumtaufik.learnkotlinbasic.datatype.variable

/**
 * Constant Variable
 * Global: can be accessed in any places
 * Only used for immutable variable
 * Keyword: const val
*/
const val APP_NAME = "variableApp"
const val APP_VERSION = "1.0"

fun main() {

    /**
     * Mutable
     * Value can be changed with same data type
     */
    var firstName: String = "T"
    var lastName: String = "H"

    firstName = "Taufik"
    lastName = "Hidayat"

    //It will print latest value
    print("My name is $firstName $lastName")

    /**
     * Immutable
     * Value can't be changed either with same data type or different data type
    */
    val firstAlias = "T"
    val lastAlias = "H"

//    firstAlias = "Taufik"

    //Program will error because cannot be reassigned
    println(firstAlias)

    //Nullable
    var firstNames: String? = "Taufik"
    firstNames = null

    //For nullable
    println("Panjang char yaitu ${firstNames?.length}")

    //Get access of constant variable
    println("Aplikasi $APP_NAME versi $APP_VERSION")
}