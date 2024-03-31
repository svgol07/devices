package org.example

interface Callable {
     fun call()
}

interface Browsable {
     fun browse()
}
interface Receivable: Callable {
    fun receive()
}

class Phone: Receivable, Browsable {
    override fun call() {
        println("Телефон звонит")
    }
    override fun browse() {
        println("Телефон вышел в интернет")
    }

    override fun receive() {
        println("Телефон принимает звонки")
    }
}

class Tablet: Callable, Browsable {
    override fun call() {
        println("Планшет звонит")
    }
    override fun browse() {
        println("Планшет вышел в интернет")
    }
}

class SmartWatch: Callable, Browsable {
    override fun call() {
        println("Умные часы звонят")
    }

    override fun browse() {
        println("Умные часы вышли в интернет")
    }
}

class Fridge: Callable {
    override fun call() {
        println("Холодильник звонит")
    }

}

fun main() {
    val phone = Phone()
    val tablet = Tablet()
    val smartWatch = SmartWatch()
    val fridge = Fridge()
    listOf(phone, tablet, smartWatch, fridge).forEach { it.call() }
}