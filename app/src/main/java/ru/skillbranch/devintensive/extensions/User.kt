package ru.skillbranch.devintensive.extensions

import android.provider.ContactsContract
import ru.skillbranch.devintensive.models.User
import ru.skillbranch.devintensive.models.UserView
import ru.skillbranch.devintensive.utils.Utils


fun User.toUserView() : UserView {

    val nickName = ("$ $firstName $lastName")
 //было первоначально так:   val nickName = ""
   //!!! val nickName = Utils.transliteration("$ $firstName $lastName")
    val initials = ""
   //!!! val initials = Utils.toInitials(firstName,lastName)
    val status = if (lastVisit==null) "Еще ни разу не был" else if (isOnline) "online" else "Последний раз был $lastVisit "
                                                        //!!! строчкой выше должно быть в конце ${lastVisit. humanizeDiff}
    return UserView(
        id,
        fullName = "$firstName $lastName",
        avatar = avatar,
        nickName = nickName,
        initials = initials,
        status = status)

}
