package ru.skillbranch.devintensive.utils

object Utils {
 fun parseFullName(fullName:String?):Pair<String?,String?>{
     //TO DO FIX ME
     val parts : List<String>? = fullName?.split(" ")

     val firstName =parts?.getOrNull(0)
     val lastName = parts?.getOrNull(1)
     //return Pair(firstName, lastName)
     return firstName to lastName
 }



    // fun transliteration(payload: String, divider:String="" ): String {
  //TODO to change body of created fuction use File
    //}
    //fun toInitials(firstName: String?, lastName: String?): String {
    //To DO
  //  }
}