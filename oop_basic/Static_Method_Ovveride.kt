package oop_basic

open class A {
    companion object {
        fun hi() {

        }
    }

}

class B : A() {
    // can not ovverride hi
}

open class C {
    open fun hi() {

    }
}

// By default class and function are final.
// Need to use open keyword to extend or override
class D : C() {
    override fun hi() {
        super.hi()
    }
}
