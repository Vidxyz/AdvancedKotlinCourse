package com.vid.kotlincourse.classes


class DirectoryExplorer(val user: String) {

    // Need inner keyword to access properties of outer class from within
    inner class PermissionCheck() {

        fun validatePermission() {
            if(user != "Vid") {
                // Do something
            }
        }

    }


    fun listFolder(folder: String, user: String) {

        val permissionCheck = PermissionCheck()
        permissionCheck.validatePermission()
    }
}


fun main() {
    val de = DirectoryExplorer(" User")

    // Can access as long as  inner class is NOT private
    // Can access inner classes as only an instance
    val pc = DirectoryExplorer("user").PermissionCheck()
    val pc2 = de.PermissionCheck()
}