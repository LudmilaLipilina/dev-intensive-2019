package ru.skillbranch.devintensive.utils

object Utils {
 fun parseFullName(fullName:String?):Pair<String?,String?> {
     //TO DO FIX ME
     val parts: List<String>? = fullName?.split(" ")

         val firstName = parts?.getOrNull(0)
         val lastName = parts?.getOrNull(1)
         return when {
             firstName == "" -> Pair( null, lastName)
             lastName == "" -> Pair(firstName, null)
         //    firstName == null -> Pair( null, null)
            // lastName == " " -> Pair(firstName, null)
           //  parts == null -> Pair( null, null)
            // firstName == "" |  lastName == "" -> Pair( null, null)
             // (parts == "") & (lastName == "") -> Pair("", "")
             else -> Pair(firstName, lastName)
         }


 }
       //1  val parts: List<String>? = fullName?.split(" ")

        //1 val firstName = parts?.getOrNull(0)
       //1  val lastName = parts?.getOrNull(1)
         //return Pair(firstName, lastName)
         // return firstName to lastName
         //  return when(firstName) {"null" -> ($firstname , $lastName") }
         //(lastName = null and firstName = null) -> "null null"
         //  else firstName to lastName
         ///if (fullName.isNullOrBlank() || fullName.isEmpty()) {
          //   fullName == null
           //  lastName == null
     //    }
       //  return firstName to lastName


    // fun transliteration(payload: String, divider:String="" ): String {
  //TODO to change body of created fuction use File
    //}
    //fun toInitials(firstName: String?, lastName: String?): String {
    //To DO
  //  }
}