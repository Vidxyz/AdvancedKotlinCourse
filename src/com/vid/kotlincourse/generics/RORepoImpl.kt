package com.vid.kotlincourse.generics

class RORepoImpl<out T> : RORepo<T> {
    override fun getId(id: Int): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): List<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}