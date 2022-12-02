package com.mario21ic

/*
class Bar {
    String myfoo = "mybar"
}
*/

class Bar {
    String name
    Integer age
    String address

    Bar(name, address="Nowhere") {
        this.name = name
        this.address = address
    }

    def increaseAge(Integer years) {
        this.age += years
    }
}
