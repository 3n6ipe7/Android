class Weapon {
    private var _typeWeapon = listOf("Weapon1", "Weapon2")

    fun getType(): String{
        return _typeWeapon.random()
    }
}