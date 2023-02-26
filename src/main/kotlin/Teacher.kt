class Teacher (name:String):Person(name),TaoThongTin{
    override fun taoEmail(): String {
        var mail = ""
        var firstName = name.split(" ")
        mail = firstName.last()
        var k = firstName.size - 2
        for (j in 0..k) {
            mail += firstName[j][0]
        }
        return "${mail.lowercase()}.@vku.udn.vn"
    }
    fun printInfo(){
        println("Name: $name - Email: ${taoEmail()}")
    }

}