package com.vid.kotlincourse.metaprogramming

// Want to map this to a database
@Target(AnnotationTarget.CLASS)
//@Repeatable
//@MustBeDocumented
annotation class Table(val name: String)

@Target(AnnotationTarget.PROPERTY)
annotation class Field(val name: String)

@Table(name="ContactTable")
//@Field(name="")
data class Contact(val id: Int, @Field(name="NAME") val name: String, val email: String) {

}


fun main() {

    val annotation = Contact::class.annotations.find {it.annotationClass.simpleName == "Table"}

    println(annotation)
}