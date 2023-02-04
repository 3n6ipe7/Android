import com.sun.org.apache.xml.internal.security.Init

fun main(args: Array<String>) {
    abstract class Person(
        var name: String = "",
        var age: Int = 0,
        var race: String = "") {
        var weapon = Weapon()

        open fun info(): String {
            return "Персонаж ${this.race} Имя ${this.name} Возраст ${this.age} Weapon ${weapon.getType()}"
        }
    }

    class Human(name: String = "", age: Int = 0,
                race: String = "Человек",
                var type: String = "Мечник") : Person(name, age, race) {

        override fun info(): String {
            return "Человек: Имя ${this.name} Возраст ${this.age} Класс: ${this.type} Weapon ${weapon.getType()}"
        }
    }

    class Elf(name: String = "", age: Int = 0,
              race: String = "Эльф",
              var power: Int = 10) : Person(name, age, race) {

        override fun info(): String {
            return "Эльф: Имя ${this.name} Возраст ${this.age} Волшебство: ${this.power}"
        }
    }

    class Orc(name: String = "", age: Int = 0,
              race: String = "Орк",
              var Intellect: Int = -100) : Person(name, age, race) {

        override fun info(): String {
            return "Орк: Имя ${this.name} Возраст ${this.age} Интеллект: ${this.Intellect}"
        }
    }

    var namesHero = listOf("Иван", "Антон", "Семён")
    var nameOrc = listOf("Grifor", "Abavarlg", "Gorosh")
    var nameElf = listOf("Legalas", "ashgdjhas", "ahjgsajhas")
    var listTypeHuman = listOf("Мечник", "Лучник", "Ассасин")
    var numberTypeNPC = listOf(1,2,3)
    var listNPC = listOf(Human(name = namesHero.random(),
        age = (17..35).random(), type=listTypeHuman.random()),
        Orc(name = nameOrc.random(), age = (55..135).random()),
        Elf(name = namesHero.random(), age = (150..235).random()))

    println("Создаем 10 персонажей NPC")
    for (i in 3..10) {
        var number = numberTypeNPC.random()

        when (number) {
            1 -> {
                listNPC = listNPC + Human(name = namesHero.random(),
                    age = (17..35).random(),
                    type=listTypeHuman.random())
            }
            2 -> {
                listNPC = listNPC + Orc(name = nameOrc.random(),
                    age = (55..135).random())
            }
            3 -> {
                listNPC = listNPC + Elf(name = nameElf.random(),
                    age = (150..235).random())
            }
        }
    }

    for (npc in listNPC) {
        println(npc.info())
    }

}


