package com.ederfmatos.bytebank.model

data class Book (
        val title: String,
        val author: String,
        val yearPublish: Long,
        val publishCompany: String? = null
): Comparable<Book> {

    override fun compareTo(other: Book): Int {
        return this.yearPublish.compareTo(other.yearPublish)
    }

}